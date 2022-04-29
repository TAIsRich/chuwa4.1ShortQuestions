### 1) What is POJO and what is Java Bean? What are the differences?
POJO in Java stands for Plain Old Java Object. It is an ordinary object, which is not bound by any special restriction. The POJO file does not require any special classpath. It increases the readability & re-usability of a Java program.

Java Bean is a normal Java class which has private properties with its public getter and setter method.Java Beans are generally used as helper class.

### 2) What is Hibernate and why we need Hibernate?
Hibernate is a framework in Java which comes with an abstraction layer and handles the implementations internally. The implementations include tasks like writing a query for CRUD operations or establishing a connection with the databases, etc.

A framework is basically a software that provides abstraction on multiple technologies like JDBC, servlet, etc.

Hibernate develops persistence logic, which stores and processes the data for longer use. It is lightweight and an ORM tool, and most importantly open-source which gives it an edge over other frameworks.

### 3) What is ORM? Why it is helpful?
ORM sets the mapping between the set of objects which are written in the preferred programming language like JavaScript and relational database like SQL. It hides and encapsulates the SQL queries into objects and instead of SQL queries we can use directly the objects to implement the SQL query.

### 4) What is Connection Pool? what is the advantage?
Connection pools promote the reuse of connection objects and reduce the number of times that connection objects are created. Connection pools significantly improve performance for database-intensive applications because creating connection objects is costly both in terms of time and resources.

### 5) List all of the annotations about Entity.
```
@Entity
@Table 
@Id
@Column
@Transient
@GeneratedValue
@Temporal
@Enumerated
```
### 6) What is the JPA Naming conversation? (check below pictures)
Spring Data JPA offers many features to use JPA in an application. Among those features, there's the standardization of table and column names in both DDL and DML queries.

### 7) How many JPA methods you know, list all. (check below pictures)
```
count()
delete(T entity)
deleteAll()
deleteAll(Iterable<? extends T> entities)
deleteById(ID id)
existsById(ID id)
findAll()
findAllById(Iterable<ID> ids)
findById(ID id)
save(S entity)
saveAll(Iteravle<S> entities)

```
### 8) How to write your own query with parameter?
```findByFirstNameAndLastName(a,b);```

### 9) What is pagination? (check below pictures)
To divide a large number of records into multiple parts, we use pagination. It allows users to display a part of records only. Loading all records on a single page may take time, so it is always recommended to created pagination. In java, we can develop pagination examples easily.

### 10) Design two entities and the repository
a) Employee(you can add more fields)
i.  id
ii. firstname
iii.lastname
iv. title
v.  join_date
vi. create_date
vii.update_date

```
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(name="FIRSTNAME", length=50, nullable=false, unique=false)
    private String firstname;
    
    @Column(name="LASTNAME", length=50, nullable=false, unique=false)
    private String lastname;
    
    @Column(name="TITLE", length=50, nullable=false, unique=false)
    private String title;

    @Temporal(TemporalType.DATE)
    private Date join_date;

    @Temporal(TemporalType.DATE)
    private Date create_date;

    @Temporal(TemporalType.DATE)
    private Date update_date;
}
```
b) order
i.  id
ii. firstname
iii.lastname
iv. title
v.  join_date
vi. create_date
vii.update_date
```
@Entity
@Table(name = "ORDER")
public class ORDER {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(name="FIRSTNAME", length=50, nullable=false, unique=false)
    private String firstname;
    
    @Column(name="LASTNAME", length=50, nullable=false, unique=false)
    private String lastname;
    
    @Column(name="TITLE", length=50, nullable=false, unique=false)
    private String title;

    @Temporal(TemporalType.DATE)
    private Date join_date;

    @Temporal(TemporalType.DATE)
    private Date create_date;

    @Temporal(TemporalType.DATE)
    private Date update_date;
}
```

c) EmployeeRepository
```
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
        
    Employee findById(long id); //(Read)
     
    Employee save(Employee employee); //(Create)
    
    void update(Employee employee); //(Update)

    void deleteById(long id); //(Delete)
}
```
d) OrderRepository
```
public interface OrderRepository extends JpaRepository<Order, Long> {
        
    Order findById(long id); //(Read)
     
    Order save(Order order); //(Create)
    
    void update(Order order); //(Update)

    void deleteById(long id); //(Delete)
}
```

e) In your repository code, list all of the CRUD methods from JPA for EmployeeRepository and OrderRepository