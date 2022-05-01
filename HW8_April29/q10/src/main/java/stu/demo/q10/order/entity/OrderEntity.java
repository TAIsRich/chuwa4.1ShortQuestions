/**
 * @ClassName OrderEntity
 */
package stu.demo.q10.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 *@ClassName OrderEntity
 *@Description TODO
 */
@Data
@Entity
@Table(name = "tbl_order")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String productName;
    private int amount;
    private double unitPrice;

    private Date createDate;
    private Date updateDate;

}
