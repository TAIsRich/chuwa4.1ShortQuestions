/**
 * @ClassName UserNotFoundException
 */
package test.demo.rest.login.support;

/**
 *@ClassName UserNotFoundException
 *@Description TODO
 */
public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(){
        super();
    }

    public UserNotFoundException(String message){
        super(message);
    }

}
