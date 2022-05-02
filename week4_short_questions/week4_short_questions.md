
1. What is POJO and what is Java Bean? What are the differences?
   
   reference:https://www.geeksforgeeks.org/pojo-vs-java-beans/
   POJO stands for Plain Old Java Object. It is an ordinary Java object, not bound by any special restriction other than those forced by the Java Language Specification and not requiring any classpath.
   Beans are special type of Pojos. There are some restrictions on POJO to be a bean.
   POJO classes and Beans both are used to define java objects to increase their readability and reusability. POJOs don’t have other restrictions while beans are special POJOs with some restrictions.

2. What is Hibernate and why we need Hibernate?

   Hibernate is an open-source Object-relational mapper solution in Java. It is lightweight and overcomes all the shortcomings that we face while working with JDBC.
   Hibernate is a framework in Java which comes with an abstraction layer and handles the implementations internally. The implementations include tasks like writing a query for CRUD operations or establishing a connection with the databases, etc.
   reference: https://www.edureka.co/blog/what-is-hibernate-in-java/

3. What is ORM? Why it is helpful?

   It is a technique that maps the object stored in the database. An ORM tool simplifies data creation, manipulation, and access. It internally uses the Java API to interact with the databases.

4. What is Connection Pool? what is the advantage?

   A connection pool is a cache of database connection objects. The objects represent physical database connections that can be used by an application to connect to a database. At run time, the application requests a connection from the pool. If the pool contains a connection that can satisfy the request, it returns the connection to the application. If no connections are found, a new connection is created and returned to the application. The application uses the connection to perform some work on the database and then returns the object back to the pool. The connection is then available for the next connection request.

   Connection pools promote the reuse of connection objects and reduce the number of times that connection objects are created. Connection pools significantly improve performance for database-intensive applications because creating connection objects is costly both in terms of time and resources.
   reference: https://docs.oracle.com/en/database/oracle/oracle-database/12.2/jjucp/intro.html#GUID-82ACD002-4C5F-4BF7-99FF-46A2A97DD35D

5. List all of the annotations about Entity.
   The Id Annotation,The Table Annotation,The Column Annotation,The Transient Annotation
   reference: https://www.baeldung.com/jpa-entities
   
6. What is the JPA Naming conversation? (check below pictures)

   Spring Data JPA offers many features to use JPA in an application. Among those features, there’s the standardization of table and column names in both DDL and DML queries.

7. How many JPA methods you know, list all. (check below pictures)

   save: Pass an Entity Bean or a subclass to Entity Bean and it will be persisted. The persisted entity will be returned. Any auto-generated field or default fields will be initialised and returned with the entity.
   saveAll: Pass an iterable of the Entities and will be saved.
   findById: Pass the ID field and the matching entity will be returned. It returns an Entity wrapped in an Optional object.
   existsById: Checks if the given ID exists into the table and returns boolean.
   findAll: This method returns all the entities from table.
   findAllById: Returns iterable of all the entities that match the given ID.
   count: The count of entities.
   deleteById: Find an entity by given ID and delete.
   delete: Find an entity matching to the given entity and delete.
   deleteAll: If given an iterable of entities all those entities are removed. If called without any argument, all the entities are deleted.
   reference:https://www.amitph.com/spring-data-jpa-query-methods/

8. How to write your own query with parameter?

   You may be quite familiar with parameter queries with their use in SQL or Microsoft Query. However Power Query parameters have key differences:

   Parameters can be used in any query step. In addition to functioning as a data filter, parameters can be used to specify such things as a file path or a server name.

   Parameters don’t prompt for input. Instead, you can quickly change their value using Power Query. You can even store and retrieve the values from cells in Excel.

   Parameters are saved in a simple parameter query, but are separate from the data queries they are used in.  Once created, you can add a parameter to queries as needed.

9. What is pagination? (check below pictures)
   To divide a large number of records into multiple parts, we use pagination. It allows users to display a part of records only. Loading all records on a single page may take time, so it is always recommended to created pagination.

10. Design two entities and the repository
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