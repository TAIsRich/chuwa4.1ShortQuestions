/**
 * @ClassName UserController
 */
package test.demo.rest.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.demo.rest.login.entity.UserDetail;
import test.demo.rest.login.service.UserService;
import test.demo.rest.login.support.UserSignup;

/**
 *@ClassName UserController
 *@Description TODO
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * get user detail
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public UserDetail get(@PathVariable int id){
        return userService.get(id);
    }

    /**
     * post user signup
     * @param userSignup
     * @return
     */
    @PostMapping("/signup")
    public UserDetail signup(@RequestBody UserSignup userSignup){
        return userService.signup(userSignup);
    }

}
