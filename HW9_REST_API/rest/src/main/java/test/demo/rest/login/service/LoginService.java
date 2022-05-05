/**
 * @ClassName LoginService
 */
package test.demo.rest.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import test.demo.rest.login.entity.UserDetail;
import test.demo.rest.login.entity.UserEntity;
import test.demo.rest.login.repository.UserRepository;
import test.demo.rest.login.support.UserLogin;
import test.demo.rest.login.support.UserNotFoundException;

import java.util.Optional;

/**
 *@ClassName LoginService
 *@Description TODO
 */
@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserDetail login(UserLogin userLogin) {
        // check if user exist or not
        Optional<UserEntity> userOpt = userRepository.findByLoginName(userLogin.getLoginName());
        UserEntity user = userOpt
                .orElseThrow(() -> new UserNotFoundException(String.format("user [loginName:%s] does not exist", userLogin.getLoginName())));

        // validate password
        if (!passwordEncoder.matches(userLogin.getPassword(), user.getPassword())){
            throw new RuntimeException("user name and password not match");
        }
        // return user detail
        UserDetail detail = new UserDetail();
        detail.setId(user.getId());
        detail.setLoginName(user.getLoginName());
        detail.setName(user.getName());
        detail.setCreateDate(user.getCreateDate());
        detail.setUpdateDate(user.getUpdateDate());
        return detail;
    }
}
