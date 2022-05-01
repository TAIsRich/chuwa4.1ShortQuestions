/**
 * @ClassName OrderRepository
 */
package stu.demo.q10.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stu.demo.q10.order.entity.OrderEntity;

/**
 *@ClassName OrderRepository
 *@Description TODO
 */
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {


}
