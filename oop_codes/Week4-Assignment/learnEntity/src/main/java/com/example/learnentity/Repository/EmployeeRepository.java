package com.example.learnentity.Repository;

import com.example.learnentity.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findEmployeeByFirstnameAndLastname(String firstname, String lastname);
    List<Employee> findEmployeeByCreateDateBetween(LocalDateTime localDateTime1, LocalDateTime localDateTime2);
    List<Employee> findEmployeesByLastnameContains(String lastname);
    Employee findDistinctFirstByLastname(String lastname);
    boolean existsEmployeeByCreateDateBefore(LocalDateTime localDateTime);
    void deleteAllByTitleIsNull();

    @Override
    <S extends Employee> S save(S entity);

}
