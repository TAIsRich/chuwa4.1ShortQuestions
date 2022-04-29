# What is POJO and what is Java Bean? What are the differences?
As we know that in Java POJO refers to the Plain old Java object.POJO and Bean class in Java shares some common features which are as follows −

Both classes must be public i.e accessible to all.

Properties or variables defined in both classes must be private i.e. can't be accessed directly.

Both classes must have default constructor i.e no argument constructor.

Public Getter and Setter must be present in both the classes in order to access the variables/properties.

The only difference between both the classes is Java make java beans objects serialized so that the state of a bean class could be preserved in case required.So due to this a Java Bean class must either implements Serializable or Externalizable interface.

Due to this it is stated that all JavaBeans are POJOs but not all POJOs are JavaBeans.

## java bean 
```java 
public class Employee implements java.io.Serializable {
   private int id;
   private String name;
   public Employee(){}
   public void setId(int id){this.id=id;}
   public int getId(){return id;}
   public void setName(String name){this.name=name;}
   public String getName(){return name;}
}
```

## POJO
```java
public class Employee {
   String name;
   public String id;
   private double salary;
   public Employee(String name, String id,double salary) {
      this.name = name;
      this.id = id;
      this.salary = salary;
   }
   public String getName() {
      return name;
   }
   public String getId() {
      return id;
   }
   public Double getSalary() {
      return salary;
   }
}
```

https://www.geeksforgeeks.org/pojo-vs-java-beans/

https://www.tutorialspoint.com/pojo-vs-java-beans

https://www.baeldung.com/java-pojo-javabeans-dto-vo
# What is Hibernate and why we need Hibernate?

What is Hibernate?
Hibernate is an open source object relational mapping (ORM) tool that provides a framework to map object-oriented domain models to relational databases for web applications.

Object relational mapping is based on the containerization of objects and the abstraction that provides that capacity. Abstraction makes it possible to address, access and manipulate objects without having to consider how they are related to their data sources.

The Hibernate ORM framework guides mapping Java classes to database tables and Java data types to SQL data types and provides querying and retrieval.


## Benefits of Hibernate
Any changes made are encapsulated in the data source itself, so that when those sources or their application programming interfaces (APIs) change, the applications that use ORM don't have to make changes or even be aware of that information. Similarly, programmers can have a consistent view of objects over time, although the sources that deliver them, the sinks that receive them and the applications that access them may change.

Hibernate is freely available to download and is licensed under the open source GNU Lesser General Public License (LGPL).


https://www.theserverside.com/definition/Hibernate


# What is ORM? Why it is helpful?

ORM Object Relational Mapping sets the mapping between the set of objects which are written in the preferred programming language like JavaScript and relational database like SQL. It hides and encapsulates the SQL queries into objects and instead of SQL queries we can use directly the objects to implement the SQL query. 

## Benifit of using ORM: 
So, first of all you get to write in the language you are already using. It is sometime tough to write SQL queries directly as they are complicated in some cases. So, to maintain the fluency we use ORM, so that we can write in the language we know.
Second, it hides the SQL or any other database query away from your application logic.
Third, for heavy database usage like creating 10+ tables and using many queries in them, then it is good to use ORM as it reduce the code and give better understanding of the code to you and as well as to your team mates and it makes your application faster and easier to maintain.

https://medium.com/@grover.vinayak0611/what-is-orm-why-to-use-it-and-brief-introduction-of-orm-frameworks-b61b16d02a3c
# What is Connection Pool? what is the advantage?


1.1 Overview of Connection Pool
A connection pool is a cache of database connection objects. The objects represent physical database connections that can be used by an application to connect to a database. At run time, the application requests a connection from the pool. If the pool contains a connection that can satisfy the request, it returns the connection to the application. If no connections are found, a new connection is created and returned to the application. The application uses the connection to perform some work on the database and then returns the object back to the pool. The connection is then available for the next connection request.

Connection pools promote the reuse of connection objects and reduce the number of times that connection objects are created. Connection pools significantly improve performance for database-intensive applications because creating connection objects is costly both in terms of time and resources. Tasks such as network communication, reading connection strings, authentication, transaction enlistment, and memory allocation all contribute to the amount of time and resources it takes to create a connection object. In addition, because the connections are already created, the application waits less time to get the connection.

Connection pools often provide properties that are used to optimize the performance of a pool. The properties control behaviors such as the minimum and maximum number of connections allowed in the pool or the amount of time a connection can remain idle before it is returned to the pool. The best configured connection pools balance quick response times with the memory spent maintaining connections in the pool. It is often necessary to try different settings until the best balance is achieved for a specific application.

1.2 Benefits of Using a Connection Pool
Applications that are database-intensive, generally benefit the most from connection pools. As a policy, applications should use a connection pool whenever database usage is known to affect application performance.

A connection pool provides the following benefits:

Reduces the number of times new connection objects are created.

Promotes connection object reuse.

Quickens the process of getting a connection.

Reduces the amount of effort required to manually manage connection objects.

Minimizes the number of stale connections.

Controls the amount of resources spent on maintaining connections.




https://docs.oracle.com/en/database/oracle/oracle-database/12.2/jjucp/intro.html#GUID-82ACD002-4C5F-4BF7-99FF-46A2A97DD35D
https://www.cockroachlabs.com/blog/what-is-connection-pooling/


# List all of the annotations about Entity.

You can fine tune some of the actions done by Hibernate on entities beyond what the EJB3 spec offers.

@org.hibernate.annotations.Entity adds additional metadata that may be needed beyond what is defined in the standard @Entity

mutable: whether this entity is mutable or not

dynamicInsert: allow dynamic SQL for inserts

dynamicUpdate: allow dynamic SQL for updates

selectBeforeUpdate: Specifies that Hibernate should never perform an SQL UPDATE unless it is certain that an object is actually modified.

polymorphism: whether the entity polymorphism is of PolymorphismType.IMPLICIT (default) or PolymorphismType.EXPLICIT

optimisticLock: optimistic locking strategy (OptimisticLockType.VERSION, OptimisticLockType.NONE, OptimisticLockType.DIRTY or OptimisticLockType.ALL)


https://docs.jboss.org/hibernate/annotations/3.5/reference/en/html/entity.html#entity-hibspec-entity


# What is the JPA Naming conversation? (check below pictures)

![jpa_naming_convetion](https://github.com/HuanWangGATECH/chuwa4.1ShortQuestions/blob/huan_wang/assignment5/jpa_naming_convention.png)

https://www.java4coding.com/contents/spring/springdatajpa/spring-data-jpa-method-naming-conventions

# How many JPA methods you know, list all. (check below pictures)

![jpa_methods](https://github.com/HuanWangGATECH/chuwa4.1ShortQuestions/blob/huan_wang/assignment5/jpa_methods.png)


https://www.amitph.com/spring-data-jpa-query-methods/


# How to write your own query with parameter?

![query_parameter](https://github.com/HuanWangGATECH/chuwa4.1ShortQuestions/blob/huan_wang/assignment5/query_with_parameter.png)
https://nullbeans.com/how-to-configure-query-parameters-in-spring-controllers/
https://www.baeldung.com/spring-request-param



# What is pagination? (check below pictures)

![repository](https://github.com/HuanWangGATECH/chuwa4.1ShortQuestions/blob/huan_wang/assignment5/repository.png)
![pagination](https://github.com/HuanWangGATECH/chuwa4.1ShortQuestions/blob/huan_wang/assignment5/pagination.png)


https://howtodoinjava.com/spring-boot2/pagination-sorting-example/#:~:text=Paging%20and%20sorting%20is%20mostly,multiple%20fields%20in%20the%20table.


# Design two entities and the repository
Employee(you can add more fields)
id
firstname
lastname
title
join_date
create_date
update_date



order
id
product_name
amount
unit_price
create_date
update_date
EmployeeRepository
OrderRepository
In your repository code, list all of the CRUD methods from JPA for EmployeeRepository and OrderRepository


```java
package com.example.demo.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="TITLE")
    private String title;


    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_date")
    private Date modifyDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //id firstname lastname title



}

```


```
package com.example.demo.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ORDER_ID")
    private Long orderId;
    @Column(name="PRODUCT_NAME")
    private String product_name;
    @Column(name="AMOUNT")
    private Double amount;
    @Column(name="UNIT_PRICE")
    private Double unit_price;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_date")
    private Date modifyDate;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}

```

```
package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long > {
    @Override
    List<Employee> findAll();

    @Override
    List<Employee> findAll(Sort sort);

    @Override
    List<Employee> findAllById(Iterable<Long> longs);

    @Override
    <S extends Employee> List<S> saveAll(Iterable<S> entities);

    @Override
    void flush();

    @Override
    <S extends Employee> S saveAndFlush(S entity);

    @Override
    <S extends Employee> List<S> saveAllAndFlush(Iterable<S> entities);

    @Override
    default void deleteInBatch(Iterable<Employee> entities) {
        JpaRepository.super.deleteInBatch(entities);
    }

    @Override
    void deleteAllInBatch(Iterable<Employee> entities);

    @Override
    void deleteAllByIdInBatch(Iterable<Long> longs);

    @Override
    void deleteAllInBatch();

    @Override
    Employee getOne(Long aLong);

    @Override
    Employee getById(Long aLong);

    @Override
    <S extends Employee> List<S> findAll(Example<S> example);

    @Override
    <S extends Employee> List<S> findAll(Example<S> example, Sort sort);
}

```


```
package com.example.demo.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository {

    @Override
    List findAll();

    @Override
    List findAll(Sort sort);

    @Override
    List findAllById(Iterable iterable);

    @Override
    List saveAll(Iterable entities);

    @Override
    void flush();

    @Override
    Object saveAndFlush(Object entity);

    @Override
    List saveAllAndFlush(Iterable entities);

    @Override
    default void deleteInBatch(Iterable entities) {
        JpaRepository.super.deleteInBatch(entities);
    }

    @Override
    void deleteAllInBatch(Iterable entities);

    @Override
    void deleteAllByIdInBatch(Iterable iterable);

    @Override
    void deleteAllInBatch();

    @Override
    Object getOne(Object o);

    @Override
    Object getById(Object o);

    @Override
    List findAll(Example example);

    @Override
    List findAll(Example example, Sort sort);
}

```
