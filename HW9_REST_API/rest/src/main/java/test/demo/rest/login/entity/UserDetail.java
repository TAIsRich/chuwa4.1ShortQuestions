/**
 * @ClassName UserDetail
 */
package test.demo.rest.login.entity;

import lombok.Data;

import java.util.Date;

/**
 *@ClassName UserDetail
 *@Description TODO
 */
@Data
public class UserDetail {

    private int id;

    private String name;// real name or nickname
    private String loginName;// use this to login

    private Date createDate;
    private Date updateDate;

}
