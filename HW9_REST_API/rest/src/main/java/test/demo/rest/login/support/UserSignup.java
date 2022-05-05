/**
 * @ClassName UserSignup
 */
package test.demo.rest.login.support;

import lombok.Data;

/**
 *@ClassName UserSignup
 *@Description TODO
 */
@Data
public class UserSignup {

    private String name;// real name or nickname
    private String loginName;// use this to login
    private String password;

}
