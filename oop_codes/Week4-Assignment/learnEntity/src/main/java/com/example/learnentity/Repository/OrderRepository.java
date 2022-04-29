package com.example.learnentity.Repository;

import com.example.learnentity.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByAmountBetween(int a, int b);
    List<Order> findOrdersByAmountBetween(int a, int b);
    List<Order> findOrdersByUnitPriceBetween(int a, int b);
    Order findDistinctFirstByAmountEquals(int a);
    List<Order> findOrdersByProductName(String productName);

    @Override
    <S extends Order> S save(S entity);

    boolean existsOrderByAmount(int a);

    void deleteAllByAmountIsNull();



}
