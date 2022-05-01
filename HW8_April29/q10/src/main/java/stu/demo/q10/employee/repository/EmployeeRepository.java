/**
 * @ClassName EmployeeRepository
 */
package stu.demo.q10.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stu.demo.q10.employee.entity.EmployeeEntity;

/**
 *@ClassName EmployeeRepository
 *@Description TODO
 */
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {


}
