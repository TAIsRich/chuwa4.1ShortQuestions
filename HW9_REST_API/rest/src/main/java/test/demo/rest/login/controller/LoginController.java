/**
 * @ClassName LoginController
 */
package test.demo.rest.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.demo.rest.login.entity.UserDetail;
import test.demo.rest.login.service.LoginService;
import test.demo.rest.login.support.UserLogin;

/**
 *@ClassName LoginController
 *@Description TODO
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * validate user id and password
     * @param userLogin
     * @return
     */
    @PostMapping
    public UserDetail login(@RequestBody UserLogin userLogin){
        return loginService.login(userLogin);
    }

}
