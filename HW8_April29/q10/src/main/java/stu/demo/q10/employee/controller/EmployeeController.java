/**
 * @ClassName EmployeeController
 */
package stu.demo.q10.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import stu.demo.q10.employee.entity.EmployeeEntity;
import stu.demo.q10.employee.repository.EmployeeRepository;
import stu.demo.q10.order.entity.OrderEntity;

import java.util.Date;
import java.util.Optional;

/**
 *@ClassName EmployeeController
 *@Description TODO
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/create")
    public EmployeeEntity create(@RequestBody EmployeeEntity entity){
        entity.setJoinDate(new Date());
        entity.setCreateDate(new Date());
        entity.setUpdateDate(new Date());
        employeeRepository.save(entity);
        return entity;
    }

    @GetMapping("/get")
    public EmployeeEntity get(int id){
        Optional<EmployeeEntity> opt = employeeRepository.findById(id);
        EmployeeEntity entity = opt.orElseThrow(() -> new RuntimeException("not found"));
        return entity;
    }

    @PutMapping("/update")
    public EmployeeEntity update(@RequestBody EmployeeEntity newOne){
        Optional<EmployeeEntity> opt = employeeRepository.findById(newOne.getId());
        EmployeeEntity entity = opt.orElseThrow(() -> new RuntimeException("not found"));
        entity.setFirstname(newOne.getFirstname());
        entity.setLastname(newOne.getLastname());
        entity.setTitle(newOne.getTitle());
        entity.setUpdateDate(new Date());
        employeeRepository.save(entity);
        return entity;
    }

    @DeleteMapping("/delete")
    public boolean delete(int id){
        employeeRepository.deleteById(id);
        return true;
    }

}
