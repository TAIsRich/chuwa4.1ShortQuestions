##### Tianyi Zhang
##### Assignment 8

**1. What is POJO and what is Java Bean? What are the differences?**
 *POJO: POJO stands for Plain Old Java Object. It is an ordinary Java object, not bound by any special restriction other than those forced by the Java Language Specification and not requiring any classpath. POJOs are used for increasing the readability and re-usability of a program.*
 *Beans are special type of Pojos. There are some restrictions on POJO to be a bean. All JavaBeans are POJOs but not all POJOs are JavaBeans.*
 | POJO | JavaBean |
| ------ | ------ |
| It doesn’t have special restrictions other than those forced by Java language. | It is a special POJO which have some restrictions. |
| It doesn’t provide much control on members. | It provides complete control on members.|
| It can implement Serializable interface. | It should implement serializable interface. |
| Fields can be accessed by their names. | Fields are accessed only by getters and setters. |
| Fields can have any visibility. | Fields have only private visibility. |
| There may/may-not be a no-arg constructor. | It must have a no-arg constructor. |
| It is used when you don’t want to give restriction on your members and give user complete access of your entity | It is used when you want to provide user your entity but only some part of your entity. |


**2. What is Hibernate and why we need Hibernate?**
* What is Hibernate?
>Hibernate is a framework in Java which comes with an abstraction layer and handles the implementations internally. The implementations include tasks like writing a query for CRUD operations or establishing a connection with the databases, etc. A framework is basically a software that provides abstraction on multiple technologies like JDBC, servlet, etc. Hibernate develops persistence logic, which stores and processes the data for longer use. It is lightweight and an ORM tool, and most importantly open-source which gives it an edge over other frameworks..
* Why we need it?
>Hibernate eliminates the shortcomings of other technologies like JDBC. Let’s take a look at how it optimizes the tasks better than JDBC.
Hibernate overcomes the database dependency faced in the JDBC.
Changing of the databases cost a lot working on JDBC, hibernate overcomes this problem with flying colors.
Code portability is not an option while working on JDBC, which is handled by hibernate easily.
Hibernate strengthens the object level relationship.
It overcomes the exception-handling part which is mandatory while working on JDBC.
Hibernate overcomes the object level relationship.
It reduces the length of code with increased readability by overcoming the boiler plate problem.
Hibernate provides optimal and efficient solutions for any task by overcoming all the shortcomings of JDBC. Let us take a look at various operations along with technologies and databases we can work on while using the hibernate framework in Java.   

**3. What is ORM? Why it is helpful?**
- ORM: Object-relational mapping (ORM) is a programming technique in which a metadata descriptor is used to connect object code to a relational database. Object code is written in object-oriented programming (OOP) languages such as Java or C#. ORM converts data between type systems that are unable to coexist within relational databases and OOP languages
- Why it's useful? 
    -  first of all you get to write in the language you are already using. 
    -  Second, it hides the SQL or any other database query away from your application logic.
    -  Third, for heavy database usage like creating 10+ tables and using many queries in them, then it is good to use ORM as it reduce the code and give better understanding of the code to you and as well as to your team mates and it makes your application faster and easier to maintain.



**4.What is Connection Pool? what is the advantage?***
- what is Connection Pool?
    - Connection pooling means that connections are reused rather than created each time a connection is requested. To facilitate connection reuse, a memory cache of database connections, called a connection pool, is maintained by a connection pooling module as a layer on top of any standard JDBC driver product.
- Advantages
    -   The main advantage of using database connection pooling is that it is very fast.
    -  It is very easy to examine and diagnose the database connection. 




**5. List all of the annotations about Entity.**
1. Define an Entity Class
    1.1 @Entity
    1.2 @Table
2. Basic Column Mappings
    2.1 @Column
    2.2 @Id
    2.3 @GeneratedValue
    2.4 @Enumerated
    2.5 @Temporal
    2.6 @Lob
3. Association Mappings
    3.1 @ManyToMany
    3.2 @ManyToOne and @OneToMany
    3.3 @ManyToOne
    3.4 @OneToMany
    3.5 @OneToOne

**6. What is the JPA Naming conversation?**
*Spring data JPA has its own naming conventions for methods. Following these conventions we can build sophisticated queries. These conventions are called also called as method name strategies. These strategies have defined set of keyword to use in method names. Based on the formed method name, method performs predefined operations.*


**7. How many JPA methods you know, list all.**

- save: Pass an Entity Bean or a subclass to Entity Bean and it will be persisted. The persisted entity will be returned. Any auto-generated field or default fields will be initialised and returned with the entity.
- saveAll: Pass an iterable of the Entities and will be saved.
- findById: Pass the ID field and the matching entity will be returned. It returns an Entity wrapped in an Optional object.
- existsById: Checks if the given ID exists into the table and returns boolean.
- findAll: This method returns all the entities from table.
- findAllById: Returns iterable of all the entities that match the given ID.
- count: The count of entities.
- deleteById: Find an entity by given ID and delete.
- delete: Find an entity matching to the given entity and delete.
- deleteAll: If given an iterable of entities all those entities are removed. If called without any argument, all the entities are deleted.


**8. How to write your own query with parameter?**
*Let's start by explaining what query parameters are.Query parameters are a way to build and execute parameterized queries. So, for example, instead of:*
`SELECT * FROM employees e WHERE e.emp_number = '123';`
*We do:*
`SELECT * FROM employees e WHERE e.emp_number = ?;`
*By using a JDBC prepared statement, we need to set the parameter before executing the query:*
`pStatement.setString(1, 123);`

	
**9.What is pagination?**
Pagination concept is applied for moving among the pages with First Page, Second Page, Third Page, Fourth Page etc. Buttons or Links. Pagination main motto is to move among the content immediately by clicking links or buttons. 


