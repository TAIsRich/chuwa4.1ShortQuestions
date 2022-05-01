/**
 * @ClassName EmployeeEntity
 */
package stu.demo.q10.employee.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 *@ClassName EmployeeEntity
 *@Description TODO
 */
@Data
@Entity
@Table(name = "tbl_employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstname;
    private String lastname;
    private String title;

    private Date joinDate;
    private Date createDate;
    private Date updateDate;

}
