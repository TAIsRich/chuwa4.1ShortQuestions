public interface OrderRepository extends CrudRepository<Oder, Long> {

    // order query example and return a stream
    Order findById(long id);

    @Query("select o from Order o where o.create_date = :create_date")
    List<Order> findByCreateDate(@Param("create_date") String create_date);

    List<Order> findAll();

    Order save(Order order);

    void deleteById(long id);

    void update(Order order);
}
