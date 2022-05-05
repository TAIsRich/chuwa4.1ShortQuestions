/**
 * @ClassName UserService
 */
package test.demo.rest.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import test.demo.rest.login.entity.UserDetail;
import test.demo.rest.login.entity.UserEntity;
import test.demo.rest.login.repository.UserRepository;
import test.demo.rest.login.support.UserNotFoundException;
import test.demo.rest.login.support.UserSignup;

import java.util.Date;
import java.util.Optional;

/**
 *@ClassName UserService
 *@Description TODO
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserDetail get(int id){
        // check user exist or not
        UserEntity user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(String.format("user [id:%s] not exist", id)));
        // if existed, return detail
        UserDetail detail = new UserDetail();
        detail.setId(user.getId());
        detail.setLoginName(user.getLoginName());
        detail.setName(user.getName());
        detail.setCreateDate(user.getCreateDate());
        detail.setUpdateDate(user.getUpdateDate());
        return detail;
    }

    public UserDetail signup(UserSignup userSignup) {
        // check loginName exist or not
        Optional<UserEntity> existOpt = userRepository.findByLoginName(userSignup.getLoginName());
        // if loginName existed, can not sign up
        if (existOpt.isPresent()){
            throw new RuntimeException(String.format("loginName [%s] does exist", userSignup.getLoginName()));
        }
        // create user entity
        UserEntity user = new UserEntity();
        user.setName(userSignup.getName());
        user.setLoginName(userSignup.getLoginName());
        user.setPassword(passwordEncoder.encode(userSignup.getPassword()));
        user.setCreateDate(new Date());
        user.setUpdateDate(new Date());
        userRepository.save(user);

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
