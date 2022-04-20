1. **What is IoC?**

   IoC is short for inversion of control, which is a programming principle. It transfers the control of objects or portions of a program to a container or framework. In contrast with traditional programming, in which our custom code makes calls to a library, IoC enables a framework to take control of the flow of a program and make calls to our custom code. The design principle of IoC emphasizes keeping the Java classes independent of each other and the container frees them from object creation and maintenance. 

   Advantages of this architecture:

   - decoupling the execution of a task from its implementation

   - making it easier to switch between different implementations

   - greater modularity of a program 

   - greater ease in testing a program by isolating a component or mocking its dependencies, and allowing components to communicate through contracts

     

2. **What is DI?**

   DI is short for dependence injection. It is a pattern used to implement IoC. The control can be inverted by setting an object's dependencies. Dependency Injection in Spring also ensures loose-coupling between the classes. Using DI, connecting objects with other objects, or "injecting" objects into other objects, is done by an assembler rather than by the objects themselves.

   In traditional programming, an object dependency can be created by instantiating an implementation of the *Item* interface within the *Store* class itself : 

   ```java
   public class Store {
     private Item item;
     
     public Store() {
       item = new ItemImpl();
     }
   }
   ```

   By using DI, the above example can be rewritten without specifying the implementation of the *Item*.

   ```java
   public class Store {
     private Item item;
     public Store(Item item) {
       this.item = item;
     }
   }
   ```

   

3. **How many DI injections in Spring Boot? Please also give me code example.**

   - Setter Dependency Injection

     - Annotation: 

       ```java
       @Component
       public class Car {
         private Engine engine;
       
         public void start() {
             engine.turnOn();
         }
         
         public Engine getEngine() {
             return engine;
         }
       
         @Autowired
         public void setEngine(Engine engine) {
             this.engine = engine;
         }
       }
       ```

     - XML

       ```xml
       <bean id="car" class="com.xxx.yyy.Car">
               <property name="engine">
                   <ref bean="engine" />
               </property>
       </bean>
       
       <bean id="engine" class="com.xxx.yyy.CombustionEngine"/>
       
       ```

       

   - Constructor Dependency Injection

     - Annotation: 

       ```java
       @Component
       public class Car {
         private Engine engine;
       
         @Autowired
         public Car(Engine engine) {
             this.engine = engine;
         }
         public void start() {
             engine.turnOn();
         }
       }
       ```

     - XML

       ```xml
       <bean id="car" class="com.xxx.yyy.Car">
             <constructor-arg ref="engine" />
       </bean>
       
       <bean id="engine" class="com.xxx.yyy.CombustionEngine"/>
       
       ```

       

4. **Which DI Injection is better way to use?**

   Constructor injection is better way to use, because it makes code more robust. It allows us to create immutable objects, preventing ```NullPointerException``` and other errors.

   

5. **What are HTTP request methods?**

   The primary HTTP methods are POST, GET, PUT, PATCH, and DELETE. 

   | HTTP Method | CRUD operation | Details                                                      |
   | ----------- | -------------- | ------------------------------------------------------------ |
   | POST        | Create         | The POST method is used to *create* subordinate resources. That is subordinate to some other (e.g. parent) resource. On successful creation, HTTP response code 201 is returned. |
   | GET         | Read           | The HTTP GET method is used to *read* (or retrieve) a representation of a resource. In case of success (or non-error), GET returns a representation in JSON and an HTTP response status code of 200 (OK). In an error case, it most often returns a 404 (NOT FOUND) or 400 (BAD REQUEST) |
   | PUT         | Update/Replace | PUT *creates* a new resource or *replaces* a representation of the target resource with the request payload. |
   | PATCH       | Update         | PATCH is used to *modify* resources. The PATCH request only needs to contain the changes to the resource, not the complete resource. In other words, the body should contain a set of instructions describing how a resource currently residing on the server should be modified to produce a new version. |
   | DELETE      | Delete         | DELETE is used to *delete* a resource identified by filters or ID. On successful deletion, the HTTP response status code 204 (No Content) returns with no response body. |

   

6. **What are differences between POST and PUT?**

   | POST                                                         | PUT                                                          |
   | ------------------------------------------------------------ | ------------------------------------------------------------ |
   | Successive identical POST may have additional effects.       | PUT is idempotent, that calling it once or several times successively has the same effect (no side effect). |
   | POST method response can't be cached.                        | PUT method response can be cached .                          |
   | The server decides which URI resource should have.           | The client decides which URI resource should have.           |
   | POST work as abstract.                                       | PUT works as specific .                                      |
   | POST method is called when you have to add a child resource. | PUT method is called when you have to modify a single resource |
   | Always use POST for create operations.                       | Generally, use PUT for update operations                     |

   

7. **What is URL and What is URI?**

   A Uniform Resource Identifier (URI) is a string of characters that uniquely identify a name or a resource on the internet. A URI identifies a resource by name, location, or both.

   A Uniform Resource Locator (URL) is a type of URI that specifies not only a resource, but how to reach it on the internet—*like http://, ftp://, or mailto://*.

   

8. **What is path variable? What is Request Parameter?**

   Request parameters are used to send additional information to the server. A URL contains these parameters. There are two types of parameters: query parameters and path parameters.

   - Query parameters are NOT a part of the URL. They are appended to the end of the request URL, following '?' and listed in **Key=Value** pairs, separated by '&' Syntax.

     ```http
     https://www.bing.com/search?q=ToolsQA
     ```

     In this URL Request parameter is represented by the "***q=ToolsQA***" part of the URL. ***"q"*** is the Key and ***"ToolsQA"*** is the value. The server reads the Request parameter from the URL and sends a Response based on the Request Parameter. In our example, Bing will return search results for ToolsQA.   

     

   - Path parameters are part of the request URL, which are accessed using the placeholders preceded by ':'. Path parameters can't be null. If you don't append the path parameter, you will get 404 error. So you can use path parameter if you want to send the data as mandatory.

     ```HTTP
     /customer/:id
     ```

   

9. **What are HTTP Response Status Codes?** 

   HTTP response status codes indicate whether a specific HTTP request has been successfully completed. Responses are grouped in five classes: informational responses (100-199); successful responses (200-299); redirection messages(300-399); client error responses (400-499); server error responses(500-599).

10. **Design a collect of APIs for simple YouTube contains below modules**.

    - Search. we have v1 and v2 two versions

      - v1, v2

        ```http
        GET https://www.googleapis.com/youtube/v3/search
        ```

      - try to make it be powerful

        a. use keyword to search

        ```http
        GET https://www.googleapis.com/youtube/v3/search?part=snippet&key=[YOUR_API_KEY]&q=keyword
        ```

        b. search one video between 04/01/2022 to now

        ```http
        GET https://www.googleapis.com/youtube/v3/search?part=snippet&key=[YOUR_API_KEY]&q=keyword&publishedAfter=2022-04-01T00:00:00Z
        ```

        c. search apple in category Tech or Fruit

        ```http
        GET https://www.googleapis.com/youtube/v3/search?part=snippet&key=[YOUR_API_KEY]&q=apple&type=video&videoCategoryId=Tech
        ```

        ```http
        GET https://www.googleapis.com/youtube/v3/search?part=snippet&key=[YOUR_API_KEY]&q=apple&type=video&videoCategoryId=Fruit
        ```

        d. pagination if we got 100 results, we split it to 10 each page.

        ```http
        GET https://www.googleapis.com/youtube/v3/search?part=snippet&key=[YOUR_API_KEY]&q=keyword&maxResults=10
        ```

    - Members

      ```http
      GET https://www.googleapis.com/youtube/v3/members?part=snippet
      ```

    - playlist

      - add new one to playlist

        ```http
        POST https://www.googleapis.com/youtube/v3/playlistItems
        ```

      - remove

        ```http
        DELETE https://www.googleapis.com/youtube/v3/playlistItems
        ```

    - Comments

      - add new

        ```http
        POST https://www.googleapis.com/youtube/v3/commentThreads
        ```

      - update old

        ```http
        PUT https://www.googleapis.com/youtube/v3/comments
        ```

      - delete

        ```http
        DELETE https://www.googleapis.com/youtube/v3/comments
        ```

        

    

    

    

    ## 

    