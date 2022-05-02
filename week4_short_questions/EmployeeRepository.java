public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    // employee query example and return a stream
    Employee findByFirstName(String firstname);

    List<Employee> findByLastName(String lastname);

    List<Employee> findAll();

    Employee save(Employee employee);

    void update(Employee employee);

    void deleteById(long id);
}

