/**
 * @ClassName UserEntity
 */
package test.demo.rest.login.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 *@ClassName UserEntity
 *@Description TODO
 */
@Data
@Entity
@Table(name = "rest_user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;// real name or nickname
    private String loginName;// use this to login
    private String password;

    private Date createDate;
    private Date updateDate;

}
