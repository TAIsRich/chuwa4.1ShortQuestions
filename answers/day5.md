# Day5

## 1. What is POJO and what is Java Bean? What are the differences?

POJO stands for Plain Old Java Object. It is an ordinary Java object, not bound by any special restriction other than those forced by the Java Language Specification and not requiring any classpath. POJOs are used for increasing the readability and re-usability of a program. POJOs have gained the most acceptance because they are easy to write and understand. They were introduced in EJB 3.0 by Sun microsystems.

A POJO should not:

1. Extend prespecified classes, Ex: public class GFG extends javax.servlet.http.HttpServlet { … } is not a POJO class.
2. Implement prespecified interfaces, Ex: public class Bar implements javax.ejb.EntityBean { … } is not a POJO class.
3. Contain prespecified annotations, Ex: @javax.persistence.Entity public class Baz { … } is not a POJO class.

POJOs basically define an entity. Like in your program, if you want an Employee class, then you can create a POJO as follows:

```java
// Employee POJO class to represent entity Employee
public class Employee
{
	// default field
	String name;

	// public field
	public String id;

	// private salary
	private double salary;

	//arg-constructor to initialize fields
	public Employee(String name, String id,
							double salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	// getter method for name
	public String getName()
	{
		return name;
	}

	// getter method for id
	public String getId()
	{
		return id;
	}

	// getter method for salary
	public Double getSalary()
	{
		return salary;
	}
}
```

A JavaBean is still a POJO but introduces a strict set of rules around how we implement it:

- Access levels – our properties are private and we expose getters and setters.
Method names – our getters and setters follow the getX and setX convention (in the case of a boolean, isX can be used for a getter)
- Default Constructor – a no-argument constructor must be present so an instance can be created without providing arguments, for example during deserialization
- Serializable – implementing the Serializable interface allows us to store the state.

## 2. What is Hibernate and why we need Hibernate?

Hibernate is a high-performance Object/Relational persistence and query service, which is licensed under the open source GNU Lesser General Public License (LGPL) and is free to download. Hibernate not only takes care of the mapping from Java classes to database tables (and from Java data types to SQL data types), but also provides data query and retrieval facilities. 

**Hibernate Advantages**

- Hibernate takes care of mapping Java classes to database tables using XML files and without writing any line of code.

- Provides simple APIs for storing and retrieving Java objects directly to and from the database.

- If there is change in the database or in any table, then you need to change the XML file properties only.

- Abstracts away the unfamiliar SQL types and provides a way to work around familiar Java Objects.

- Hibernate does not require an application server to operate.

- Manipulates Complex associations of objects of your database.

- Minimizes database access with smart fetching strategies.

- Provides simple querying of data.

## 3. What is ORM? Why it is helpful?

Object-Relational Mapping or ORM is a technique for converting data between Java objects and relational databases. ORM converts data between two incompatible type systems (Java and MySQL), such that each model class becomes a table in our database and each instance a row of the table.

## 4. What is Connection Pool? what is the advantage?

In software engineering, a connection pool is a cache of database connections maintained so that the connections can be reused when future requests to the database are required. 

**Advantage**

Connection pools are used to enhance the performance of executing commands on a database. Opening and maintaining a database connection for each user, especially requests made to a dynamic database-driven website application, is costly and wastes resources. In connection pooling, after a connection is created, it is placed in the pool and it is used again so that a new connection does not have to be established. If all the connections are being used, a new connection is made and is added to the pool. Connection pooling also cuts down on the amount of time a user must wait to establish a connection to the database.

## 5. List all of the annotations about Entity.

In most cases, you only need to annotate your entity class with @Entity and your primary key attribute with @Id and @GeneratedValue.

If the names of your entity class or one of its attributes don’t match the table or column names, you can adjust the mapping using a @Table or @Column annotation. You can also change the type mappings using an @Enumerated, @Temporal, or @Lob annotation.

## 6. What is the JPA Naming conversation? (check below pictures)

Spring data JPA has its own naming conventions for methods. Following these conventions we can build sophisticated queries. These conventions are called also called as method name strategies. These strategies have defined set of keyword to use in method names. Based on the formed method name, method performs predefined operations.

## 7. How many JPA methods you know, list all. (check below pictures)

| Keyword           | Sample                                                | JPQL snippet                                                  |
|-------------------|-------------------------------------------------------|---------------------------------------------------------------|
| And               | findByLastnameAndFirstname                            | … where x.lastname = ?1 and x.firstname = ?2                  |
| Or                | findByLastnameOrFirstname                             | … where x.lastname = ?1 or x.firstname = ?2                   |
| IsEquals          | findByFirstnamefindByFirstnameIsfindByFirstnameEquals | … where x.firstname = ?1                                      |
| Between           | findByStartDateBetween                                | … where x.startDate between ?1 and ?2                         |
| LessThan          | findByAgeLessThan                                     | … where x.age <1                                         |
| LessThanEqual     | findByAgeLessThanEqual                                | … where x.age <= ?1                                        |
| GreaterThan       | findByAgeGreaterThan                                  | … where x.age > ?1                                         |
| GreaterThanEqual  | findByAgeGreaterThanEqual                             | … where x.age >= ?1                                        |
| After             | findByStartDateAfter                                  | … where x.startDate > ?1                                   |
| Before            | findByStartDateBefore                                 | … where x.startDate < ?1                                   |
| IsNull            | findByAgeIsNull                                       | … where x.age is null                                         |
| IsNotNull,NotNull | findByAge(Is)NotNull                                  | … where x.age not null                                        |
| Like              | findByFirstnameLike                                   | … where x.firstname like ?1                                   |
| NotLike           | findByFirstnameNotLike                                | … where x.firstname not like ?1                               |
| StartingWith      | findByFirstnameStartingWith                           | … where x.firstname like ?1(parameter bound with appended %)  |
| EndingWith        | findByFirstnameEndingWith                             | … where x.firstname like ?1(parameter bound with prepended %) |
| Containing        | findByFirstnameContaining                             | … where x.firstname like ?1(parameter bound wrapped in %)     |
| OrderBy           | findByAgeOrderByLastnameDesc                          | … where x.age = ?1 order by x.lastname desc                   |
| Not               | findByLastnameNot                                     | … where x.lastname <> ?1                                |
| In                | findByAgeIn(Collection<Age> ages)               | … where x.age in ?1                                           |
| NotIn             | findByAgeNotIn(Collection<Age> ages)            | … where x.age not in ?1                                       |
| True              | findByActiveTrue()                                    | … where x.active = true                                       |
| False             | findByActiveFalse()                                   | … where x.active = false                                      |
| IgnoreCase        | findByFirstnameIgnoreCase                             | … where UPPER(x.firstame) = UPPER(?1)                         |


## 8. How to write your own query with parameter?

Database script (MySQL)
```SQL
CREATE TABLE STUDENT (

       STUDENTID INT NOT NULL AUTO_INCREMENT,
       FIRSTNAME VARCHAR(20) DEFAULT NULL,
       LASTNAME VARCHAR(20) DEFAULT NULL,
       MARKS INT(20) DEFAULT NULL,
       PRIMARY KEY (STUDENTID)

);
 
INSERT INTO STUDENT (FIRSTNAME,LASTNAME,MARKS) VALUES ('Manu','Manjunatha', 100);
INSERT INTO STUDENT (FIRSTNAME,LASTNAME,MARKS) VALUES('Advith','Tyagraj', 100);
INSERT INTO STUDENT (FIRSTNAME,LASTNAME,MARKS) VALUES('Likitha','Tyagraj', 98);

```

COMMIT;
```xml
pom.xml
<project xmlns="https://maven.apache.org/POM/4.0.0"

        xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"

        xsi:schemaLocation="https://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">

        <modelVersion>4.0.0</modelVersion>

        <groupId>com.java4coding</groupId>

        <artifactId>QueryCreationFromMethodNames</artifactId>

        <version>0.0.1-SNAPSHOT</version>

 

        <dependencies>

                <dependency>

                        <groupId>org.springframework</groupId>

                        <artifactId>spring-context</artifactId>

                        <version>5.1.4.RELEASE</version>

                </dependency>

                <dependency>

                        <groupId>org.springframework</groupId>

                        <artifactId>spring-orm</artifactId>

                        <version>5.1.4.RELEASE</version>

                </dependency>

                <dependency>

                        <groupId>org.hibernate</groupId>

                        <artifactId>hibernate-core</artifactId>

                        <version>5.4.1.Final</version>

                </dependency>

                <dependency>

                        <groupId>org.springframework.data</groupId>

                        <artifactId>spring-data-jpa</artifactId>

                        <version>2.1.4.RELEASE</version>

                </dependency>

                <dependency>

                        <groupId>mysql</groupId>

                        <artifactId>mysql-connector-java</artifactId>

                        <version>8.0.14</version>

                </dependency>

        </dependencies>

 

        <build>

                <plugins>

                        <plugin>

                                <groupId>org.apache.maven.plugins</groupId>

                                <artifactId>maven-compiler-plugin</artifactId>

                                <version>3.8.1</version>

                                <configuration>

                                        <source>1.8</source>

                                        <target>1.8</target>

                                </configuration>

                        </plugin>

                </plugins>

        </build>

</project>
```
```xml
persistence.xml
<?xml version="1.0" encoding="UTF-8"?>

<persistence xmlns="https://java.sun.com/xml/ns/persistence"

        xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"

        xsi:schemaLocation="https://java.sun.com/xml/ns/persistence

             https://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"

        version="2.0">

 

        <persistence-unit name="StudentPU">

                <provider>org.hibernate.ejb.HibernatePersistence</provider>

                <properties>

                        <property name="hibernate.connection.url" value="jdbc:mysql://localhost:3306/study" />

                        <property name="hibernate.connection.driver_class" value="com.mysql.cj.jdbc.Driver" />

                        <property name="hibernate.connection.username" value="root" />

                        <property name="hibernate.connection.password" value="root" />

                        <property name="hibernate.archive.autodetection" value="class" />

                        <property name="hibernate.show_sql" value="true" />

                        <property name="hibernate.format_sql" value="true" />

                        <property name="hbm2ddl.auto" value="update" />

                </properties>

        </persistence-unit>

</persistence>
```
```java
Student.java
package com.java4coding;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Student {
        @Id

        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long studentId;
        private String firstName;
        private String lastName;
        private Long marks;

        public Student() {
                super();
        }

        public Student(String firstName, String lastName, Long marks) {
                super();
                this.firstName = firstName;
                this.lastName = lastName;
                this.marks = marks;

        }

       

        //Setters and getters
        public Long getId() {
                return studentId;
        }

        public void setId(Long id) {
                this.studentId = id;
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

        public Long getMarks() {
                return marks;
        }

        public void setMarks(Long marks) {
                this.marks = marks;
        }

 

        @Override
        public String toString() {
                return "Student [firstName=" + firstName + ", lastName=" + lastName + ", Marks= " + marks + "]";
        }

}

AppConfig.java
package com.java4coding;
import javax.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;


@Configuration
@EnableJpaRepositories(basePackages = {"com.java4coding"})

public class AppConfig {
      @Bean
        public LocalEntityManagerFactoryBean entityManagerFactory() {
                LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
                factoryBean.setPersistenceUnitName("StudentPU");
                return factoryBean;

        }

        @Bean
        public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
               JpaTransactionManager transactionManager = new JpaTransactionManager();
                transactionManager.setEntityManagerFactory(entityManagerFactory);
                return transactionManager;

        }       

}

StudentRepository.java
package com.java4coding;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface  StudentRepository extends CrudRepository<Student, Long>{
        List<Student> findByStudentId(Long studentId);
        List<Student> findByStudentIdLessThanAndMarksGreaterThan(Long studentId, Long marks);

}

StudentService.java
package com.java4coding;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentService {
        @Autowired
        private StudentRepository repository;
        public void test() {

                // Find students by studentId

                List<Student> students1 = repository.findByStudentId(1L);

                students1.forEach(student1 -> System.out.println(student1));

                // List all students whose studentId is less than and marks greater than
                List<Student> students2 = repository.findByStudentIdLessThanAndMarksGreaterThan(3L, 99L);
                students2.forEach(student2 -> System.out.println(student2));
                // Count number of customer
                long count = repository.count();
                System.out.println("Number of students: " + count);
        }

}

Test.java
package com.java4coding;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
        public static void main(String[] args) {
                AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
                appContext.scan("com.java4coding");
                appContext.refresh();

                StudentService studentService = (StudentService) appContext.getBean("studentService");
                studentService.test();
                appContext.close();

        }

}
```

## 9. What is pagination? (check below pictures)

To divide a large number of records into multiple parts, we use pagination. It allows users to display a part of records only. Loading all records on a single page may take time, so it is always recommended to created pagination. 

## 10. Design two entities and the repository
```java

package com.example.mysql.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String title;
    private String join_date;
    private String create_data;
    private String update_date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getJoin_date() {
        return join_date;
    }

    public void setJoin_date(String join_date) {
        this.join_date = join_date;
    }

    public String getCreate_data() {
        return create_data;
    }

    public void setCreate_data(String create_data) {
        this.create_data = create_data;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public Employee() {
        super();
    }

    public Employee(Long id, String firstName, String lastName, String title, String join_date, String create_data, String update_date) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.join_date = join_date;
        this.create_data = create_data;
        this.update_date = update_date;
    }

}

package com.example.mysql.demo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    void addEmployee(Long id);
    void deleteEmployee(Long id);
    void changeEmployee(Long id);
    List<Employee> listAll();
}


package com.example.mysql.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product_name;
    private Integer amount;
    private Integer unit_price;
    private String create_data;
    private String update_date;

    public Order() {
        super();
    }

    public Order(Long id, String product_name, Integer amount, Integer unit_price, String create_data, String update_date) {
        this.id = id;
        this.product_name = product_name;
        this.amount = amount;
        this.unit_price = unit_price;
        this.create_data = create_data;
        this.update_date = update_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Integer unit_price) {
        this.unit_price = unit_price;
    }

    public String getCreate_data() {
        return create_data;
    }

    public void setCreate_data(String create_data) {
        this.create_data = create_data;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }
}

package com.example.mysql.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    void addOrder(Long id);
    void deleteOrder(Long id);
    void changeOrder(Long id);
    List<Employee> listAll();
}


```
