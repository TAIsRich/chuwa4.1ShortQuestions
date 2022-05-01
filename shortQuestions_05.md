# Short Questions_05

1. **What is POJO and what is Java Bean? What are the differences?**

   POJO is short for *Plain Old Java Object*. It is an ordinary Java object, not bound by any special restriction other than those forced by the Java Language Specification and not requiring any classpath. POJOs are used for increasing the readability and re-usability of a program. A POJO should not: i) Extend pre-specified classes; ii) Implement pre-specified interfaces; iii)Contain pre-specified annotations. Beans are special type of Pojos. There are some restrictions on POJO to be a bean. Beans are special type of POJOs. There are some restrictions on POJO to be a bean.

   | POJO                                                         | Java Bean                                                    |
   | ------------------------------------------------------------ | :----------------------------------------------------------- |
   | It doesn’t have special restrictions other than those forced by Java language. | It is a special POJO which have some restrictions.           |
   | It doesn’t provide much control on members.                  | It provides complete control on members.                     |
   | It can implement Serializable interface.                     | It can implement Serializable interface.                     |
   | Fields can be accessed by their names.                       | Fields are accessed only by getters and setters.             |
   | Fields can have any visibility.                              | Fields have only private visibility.                         |
   | There may/may-not be a no-arg constructor.                   | It must have a no-arg constructor.                           |
   | It is used when you don’t want to give restriction on your members and give user complete access of your entity | It is used when you want to provide user your entity but only some part of your entity. |

   *The Serializable interface is present in java.io package. It is a marker interface. A Marker Interface does not have any methods and fields. Thus classes implementing it do not have to implement any methods.*

   

2. **What is Hibernate and why we need Hibernate?**

   It is a java framework, open-source, lightweight, and ORM tool for the java language which simplifies the buildout of Java application to interact with the database. It is used to save the Java objects in the relational database system. The main feature of Hibernate is to map the Java classes to database tables. Following are some key features of Hibernate :

   - Hibernate is an implementation of JPA(Java Persistence API) guidelines.
   - It helps in mapping Java data types to SQL data types.
   - It is the contributor of JPA.

   JPA is only a specification which means that there is no implementation. We can annotate classes to the extent that we would like with JPA annotations, although, nothing will take place without an implementation. Suppose JPA as the guidelines that should be followed, however, Hibernate is a JPA implementation code that unites the API as described by the JPA specification and gives the anonymous functionality. The major difference between Hibernate and JPA is that Hibernate is a framework while JPA is API specifications. Hibernate is the implementation of all the JPA guidelines.

   Why we need Hibernate? Hibernate is used to overcome the of limitations of JDBC like:

   - JDBC code is dependent upon the Database software being used i.e. our persistence logic is dependent, because of using JDBC. 

   - If working with JDBC, changing of Database in middle of the project is very costly.

   - JDBC code is not portable code across the multiple database software.

   - In JDBC, Exception handling is mandatory. 

   - While working with JDBC, There is no support Object-level relationship.

   - In JDBC, there occurs a Boilerplate problem i.e. For each and every project we have to write the below code. That increases the code length and reduce the readability.

     ```java
     try{
       Class.forName("com.mysql.jdbc.Driver");
       connection con=DriberManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=root");
       System.out.println("connection established");
       con.close();  
     } catch(SQLException | ClassNotFoundException e)
     {
       e.printStackTrace();
     }
     ```

     

3. **What is ORM? Why it is helpful?**

   ORM stands for *Object Relational Mapping*. It is a middleware application or tool that sits between the web application and database. It wraps the implementation specific details of storage drivers in an API. ORM is a technique for converting data between Java objects and relational databases (table). In simple words, we can say that the ORM implements responsibility of mapping the object to relational model and vice-versa. The ORM tool (such as Hibernate, TopLink, EclipseLink, OpenJPA, MyBatis) does mapping in such a way that model class becomes a table in the database and each instance becomes a row of the table. 

   Advantages of ORM Tool：

   - It saves time and efforts.
   - It gives pace to development process.
   - It reduces the development cost.
   - It provides connectivity to the database.
   - It makes development more object-oriented.
   - Easy transaction management.
   - No need to implement database manually.
   - Modification in any model (object or relational model) does not affect each other.

    

4. **What is Connection Pooling? what is the advantage?**

   Connection pooling is a technique of creating and managing a pool of connections that are ready for use by any thread that needs them. Connection pooling can greatly increase the performance of your Java application, while reducing overall resource usage:

   - Reduced connection creation time
   - Simplified programming model
   - Controlled resource usage

   *For simple operations at small scale, the steps involved in opening and closing a connection are not expensive enough to warrant worrying about. As your application scales up, however, the constant opening and closing of connections becomes more expensive and can begin to impact your application’s performance. Often, it makes sense to find a way of keeping connections open and passing them from operation to operation as they’re needed, rather than opening and closing a brand new connection for each operation.*

   *Most applications only need a thread to have access to a JDBC connection when they are actively processing a transaction , which often takes only milliseconds to complete. When not processing a transaction, the connection sits idle. Connection pooling enables the idle connection to be used by some other thread to do useful work. In practice, when a thread needs to do work against a MySQL or other database with JDBC, it requests a connection from the pool. When the thread is finished using the connection, it returns it to the pool, so that it can be used by any other threads. When the connection is loaned out from the pool, it is used exclusively by the thread that requested it. From a programming point of view, it is the same as if your thread called `DriverManager.getConnection()` every time it needed a JDBC connection. With connection pooling, your thread may end up using either a new connection or an already-existing connection.*

   

5. **List all of the annotations about Entity.**

   - **@Entity**: It defines an entity so that JPA is aware of it. Specify this annotation at the **class** level. Because various JPA implementations will try subclassing our entity in order to provide their functionality, entity classes must not be declared **final**. The entity name defaults to the name of the class. We can change its name using the *name* element:

     ```java
     @Entity(name="student")
     public class Student { 
         // fields, getters and setters    
     }
     ```

   - **@Id**: Each JPA entity must have a primary key that uniquely identifies it. This annotation defines the primary key. 

   - **@GeneratedValue**: We can generate the identifiers in different ways, which are specified by the this annotation. We can choose from **four** id generation strategies with the *strategy* element. The value can be **AUTO** (JPA provider will use any strategy it wants to generate the identifiers), **TABLE**(The *TableGenerator* uses an underlying database table that holds segments of identifier generation values), **SEQUENCE**(This generator uses sequences if our database supports them. It switches to table generation if they aren't supported) or **IDENTITY**(This type of generation relies on the *IdentityGenerator*, which expects values generated by an *identity* column in the database. This means they are auto-incremented. One thing to note is that IDENTITY generation disables batch updates).

     ```java
     @Entity
     public class Student {
         @Id
         @GeneratedValue(strategy=GenerationType.AUTO)
         private Long id;
       
         private String name;
         // getters and setters
     }
     ```

   - **@Table**: specify the table name. We can also mention the schema using the *schema* element. Schema name helps to distinguish one set of tables from another.

     ```java
     @Entity
     @Table(name="STUDENT", schema="SCHOOL")
     public class Student {
         
         // fields, getters and setters    
     }
     ```

   - **@Column**: we can use the this annotation to mention the details of a column in the table. This annotation has many elements such as *name, length, nullable, and unique*. The *name* element specifies the name of the column in the table. The *length* element specifies its length. The *nullable* element specifies whether the column is nullable or not, and the *unique* element specifies whether the column is unique. If we don't specify this annotation, the name of the column in the table will be the name of the field.

     ```java
     @Entity
     @Table(name="STUDENT")
     public class Student {
         @Id
         @GeneratedValue(strategy=GenerationType.AUTO)
         private Long id;
         
         @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
         private String name;
         
         // other fields, getters and setters
     }
     ```

   -  **@Transient**: Sometimes, we may want to make a field non-persistent. We can use this annotation to do so. It specifies that the field won't be persisted. For instance, we can calculate the age of a student from the date of birth. The field *age* won't be persisted to the table.

     ```java
     @Entity
     @Table(name="STUDENT")
     public class Student {
         @Id
         @GeneratedValue(strategy=GenerationType.AUTO)
         private Long id;
         
         @Column(name="STUDENT_NAME", length=50, nullable=false)
         private String name;
         
         @Transient
         private Integer age;
         
         // other fields, getters and setters
     }
     ```

   -  **@Temporal**:  save temporal values in our table.

   - **@Enumerated**:  specify whether the *enum* should be persisted by name or by ordinal (default).

     

6. **What is the JPA Naming convention? (check below pictures)**

   - Always name your JPA objects explicitly, so that no Implicit Naming Strategy affects your code.
   - Use the snake_case for columns, tables, indexes and other JPA objects names in order to avoid their transformation by any implementation of the Physical Naming Strategy.

   

7. **How many JPA methods you know, list all. (check below pictures)**

   | Modifier and Type      | Method and Description                                       |
   | :--------------------- | ------------------------------------------------------------ |
   | `void`                 | `deleteAllByIdInBatch(Iterable<ID> ids)`Deletes the entities identified by the given ids using a single query. |
   | `void`                 | `deleteAllInBatch()`Deletes all entities in a batch call.    |
   | `void`                 | `deleteAllInBatch(Iterable<T> entities)`Deletes the given entities in a batch which means it will create a single query. |
   | `default void`         | `deleteInBatch(Iterable<T> entities)`**Deprecated.** Use [`deleteAllInBatch(Iterable)`](https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html#deleteAllInBatch-java.lang.Iterable-) instead. |
   | `List<T>`              | `findAll()`                                                  |
   | `<S extends T>List<S>` | `findAll(Example<S> example)`                                |
   | `<S extends T>List<S>` | `findAll(Example<S> example, Sort sort)`                     |
   | `List<T>`              | `findAll(Sort sort)`                                         |
   | `List<T>`              | `findAllById(Iterable<ID> ids)`                              |
   | `void`                 | `flush()`Flushes all pending changes to the database.        |
   | `T`                    | `getById(ID id)`Returns a reference to the entity with the given identifier. |
   | `T`                    | `getOne(ID id)`**Deprecated.** use `JpaRepository#getById(ID)` instead. |
   | `<S extends T>List<S>` | `saveAll(Iterable<S> entities)`                              |
   | `<S extends T>List<S>` | `saveAllAndFlush(Iterable<S> entities)`Saves all entities and flushes changes instantly. |
   | `<S extends T>S`       | `saveAndFlush(S entity)`Saves an entity and flushes changes instantly. |

   

8. **How to write your own query with parameter?**

   JPA specifies two different ways to write parameterized queries by using:

   a. **Positional parameters**

   Within the previous example, we declare these parameters within the query by typing a question mark followed by a positive integer number. We'll start with 1 and move forward, incrementing it by one each time. We may use the same parameter more than once within the same query which makes these parameters more similar to named parameters.

   ```java
   TypedQuery<Employee> query = em.createQuery(
     "SELECT e FROM Employee e WHERE e.empNumber = ?1", Employee.class);
   String empNumber = "A123";
   Employee employee = query.setParameter(1, empNumber).getSingleResult();
   ```

   b. **Collection-Valued Positional Parameters**

   ```java
   TypedQuery<Employee> query = entityManager.createQuery(
     "SELECT e FROM Employee e WHERE e.empNumber IN (?1)" , Employee.class);
   List<String> empNumbers = Arrays.asList("A123", "A124");
   List<Employee> employees = query.setParameter(1, empNumbers).getResultList();
   ```

   c. **Named parameters** 

   Named parameters are quite similar to positional parameters; however, by using them, we make the parameters more explicit and the query becomes more readable.

   ```java
   TypedQuery<Employee> query = em.createQuery(
     "SELECT e FROM Employee e WHERE e.empNumber = :number" , Employee.class);
   String empNumber = "A123";
   Employee employee = query.setParameter("number", empNumber).getSingleResult();
   ```

   

9. **What is pagination? (check below pictures)**

   Pagination is often helpful when we have a large dataset and we want to present it to the user in smaller chunks.

   Also, we often need to sort that data by some criteria while paging.

   

10. **Design two entities and the repository**.

    a. Employee(you can add more fields)

    - id
    - firstname
    - lastname
    - title
    - join_date
    - create_date
    - update_date

    ```java
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "Employees")
    public class Emloyee() {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      
      @Column(name = "first_name", nullable = false)
      private String firstName;
      
      @Column(name = "last_name")
      private Strinng lastName;
      
      @Column(name = "title")
      private String title;
      
      @Column(name = "join_date")
      private LocalDateTime join_date;
      
      @Column(name = "create_date")
      @CreationTimestamp
      private LocalDateTime create_date;
      
      @Column(name = "update_date")
      @UpdateTimestamp
      private LocalDateTime update_date;
    } 
    ```

    b. Order

    ```java
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "orders")
    public class Order() {
      
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      
      @Column
      priavte boolean active;
      
      @Column(name = "num of items")
      private int num_items;
      
      @Column
      private float price;
      
      @Column
      @CreationTimestamp
      private LocalDateTime create_date;
      
      
      @Column
      @UpdateTimestamp
      private LocalDateTime update_date;
      
    }
    ```

    c. EmployeeRepository

    ```java
    public interface EmployeeRepository extends JpaRepository<Employee, Long> {
      void addEmployee(Long id); 
      void deleteEmployee(Long id);
      void updateEmployee(Long id);
      List<Employee> listAll();
    }
    ```

    d. OrderRepository

    ```java
    public interface OrderRepository extends JpaRepository<Order, Long> {
      void addOrder(Long id);
      void deleteOrder(Long id);
      void changeOrder(Long id);
      List<Employee> listAll();
       
    }
    ```

    

    e. In your repository code, list all of the CRUD methods from JPA for EmployeeRepository and OrderRepository

    