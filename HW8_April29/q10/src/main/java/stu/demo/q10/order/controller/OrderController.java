/**
 * @ClassName OrderController
 */
package stu.demo.q10.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import stu.demo.q10.order.entity.OrderEntity;
import stu.demo.q10.order.repository.OrderRepository;

import java.util.Date;
import java.util.Optional;

/**
 *@ClassName OrderController
 *@Description TODO
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/create")
    public OrderEntity create(@RequestBody OrderEntity entity){
        entity.setCreateDate(new Date());
        entity.setUpdateDate(new Date());
        orderRepository.save(entity);
        return entity;
    }

    @GetMapping("/get")
    public OrderEntity get(int id){
        Optional<OrderEntity> opt = orderRepository.findById(id);
        OrderEntity entity = opt.orElseThrow(() -> new RuntimeException("not found"));
        return entity;
    }

    @PutMapping("/update")
    public OrderEntity update(@RequestBody OrderEntity newOne){
        Optional<OrderEntity> opt = orderRepository.findById(newOne.getId());
        OrderEntity entity = opt.orElseThrow(() -> new RuntimeException("not found"));
        entity.setProductName(newOne.getProductName());
        entity.setAmount(newOne.getAmount());
        entity.setUnitPrice(newOne.getUnitPrice());
        entity.setUpdateDate(new Date());
        orderRepository.save(entity);
        return entity;
    }

    @DeleteMapping("/delete")
    public boolean delete(int id){
        orderRepository.deleteById(id);
        return true;
    }

}
