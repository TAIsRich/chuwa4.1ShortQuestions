**What is POJO and what is Java Bean? What are the differences?** 

**pojo:**It is an ordinary Java object, not bound by any special restriction other than those forced by the Java Language Specification and not requiring any classpath. POJOs are used for increasing the readability and re-usability of a program. POJOs have gained the most acceptance because they are easy to write and understand  Beans are special type of Pojos. 

  **POJO**:

- It doesn’t have special restrictions other than those forced by Java language.
-  It doesn’t provide much control on members.
-  It can implement Serializable interface.
-  Fields can be accessed by their names. 
- Fields can have any visibility.
- There may/may-not be a no-arg constructor. 
- It is used when you don’t want to give restriction on your members and give user complete access of your entity 

 **JAVA BEAN:**

-  It is a special POJO which have some restrictions.
-  It provides complete control on members. 
- It should implement serializable interface.
-  Fields are accessed only by getters and setters.
-  Fields have only private visibility.
-  It must have a no-arg constructor.
- It is used when you want to provide user your entity but only some part of your entity. 





###### 		**What is Hibernate and why we need Hibernate?** 

**Definition**:Hibernate is an open source object relational mapping (ORM) tool that provides a framework to map object-oriented domain models to relational databases for web applications. 

**Reason**: Hibernate reduces lines of code by maintaining object-table mapping itself and returns result to application in form of Java objects. It relieves programmer from manual handling of persistent data, hence reducing the development time and maintenance cost.  



###### What is ORM? Why it is helpful? 

An object-relational mapper provides an object-oriented layer between relational databases and object-oriented programming languages without having to write SQL queries. It standardizes interfaces reducing boilerplate and speeding development time.  

###### What is Connection Pool? what is the advantage? 

A connection pool is a cache of database connection objects. The objects represent physical database connections that can be used by an application to connect to a database. At run time, the application requests a connection from the pool. If the pool contains a connection that can satisfy the request, it returns the connection to the application. If no connections are found, a new connection is created and returned to the application. The application uses the connection to perform some work on the database and then returns the object back to the pool. The connection is then available for the next connection request.

  **Benefit** Connection pools promote the reuse of connection objects and reduce the number of times that connection objects are created. Connection pools significantly improve performance for database-intensive applications because creating connection objects is costly both in terms of time and resources.  



###### List all of the annotations about Entity. 

- @Entity
-  @Table
-  @Id
-  @GeneratedValue
-  @Column
-  @Transient 



