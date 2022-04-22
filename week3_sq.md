1. What is IOC?

   Inversion of Control is a principle in software engineering which transfers the control of objects or portions of a program to a container or framework.
2. What is DI?

   Dependency injection is a pattern we can use to implement IoC, where the control being inverted is setting an object's dependencies.
3. how many DI injections in Spring Boot? please also give me code example.(只给你能展示这几种方法的例子就行，不用写完整的代码)

   [reference](https://www.geeksforgeeks.org/spring-dependency-injection-with-example/)

   There are two types of Spring Dependency Injection:
   1. Setter Dependency Injection (SDI)
      ```   
      public class GFG {

          // The object of the interface IGeek
          IGeek geek;

          // Setter method for property geek
          public void setGeek(IGeek geek) {
              this.geek = geek;
          }
      }
      ```

   2. Constructor Dependency Injection (CDI)
      ```
      public class GFG {

          // The object of the interface IGeek
          IGeek geek;

          // Constructor to set the CDI
          GFG(IGeek geek) {
              this.geek = geek;
          }
      }
      ```
5. Which DI Injection is better way to use?
   
   Setter DI - Preferred option when properties are less and mutable objects can be created.
   Constructor DI - Preferred option when properties on the bean are more and immutable objects (eg: financial processes) are important for application.

6. What are HTTP request methods?

   [reference1](https://doc.oroinc.com/api/http-methods/#:~:text=The%20primary%20or%20most%20commonly,or%20CRUD)%20operations%2C%20respectively).
   [reference2](https://rapidapi.com/blog/api-glossary/http-request-methods/)

   An HTTP request is an action to be performed on a resource identified by a given Request-URL.
   
   safe methods: GET, HEAD, OPTIONS, TRACE

   unsafe methods: POST, PUT, DELETE, CONNECT, PATCH
7. What are differences between POST and PUT?

   The difference between the two is that PUT requests are idempotent. This means that if you call the same PUT requests multiple times, the results will always be the same.
8. What is URL and What is URI? read this article again and again and again PLEASE (https://danielmiessler.com/study/difference-between-uri-url/)

   The difference between a URI and a URL is that a URI can be just a name by itself, or a name with a protocol that tells you how to reach it—which is a URL.

   
8. What is path variable? and what is Request Parameter?

   @PathVariable identifies the pattern that is used in the URI for the incoming request.

   @RequestParam annotation used for accessing the query parameter values from the request.

9. What are HTTP Response Status Codes?

   You should always use regular HTTP status codes in responses to requests made to your API. This will help your users to know what is going on – whether the request is successful, or if it fails, or something else.

10. Design a collect of APIs for simple YouTube contains below modules.
    1. https://restfulapi.net/resource-naming/
    2. https://www.freecodecamp.org/news/rest-api-best-practices-rest-endpoint-design-examples/
    3. Search. we have v1 and v2 two versions.
       1. v1, v2
       2. try to make it be powerful.
          1. use keyword to search
          2. search one video between 04/01/2022 to now
          3. search apple in category Tech or Fruit
          4. pagination. if we got 100 results, we split it to 10 each page.
          5. and more if you can think out.
       
       ```
       GET /v1/search
       GET /v2/search
       Params:
           keyword: the keyword to search
           startDate: search start date
           endDate: search end date
           category: the category to search
           pageToken: the page in the result should be returned
           maxResults: The maxResults parameter specifies the maximum number of items that should be returned in the result set
    
       Response Code:
           400: invalidVideoId
       Response Body:
           items[]: A list of results that match the search criteria.
           pageinfo: The pageInfo object encapsulates paging information for the result set.      
           pageInfo.totalResults: The total number of results in the result set
           pageInfo.resultsPerPage: The number of results included in the API response.
       ```
       
    4. members

       ```
       GET /members
       Params:
              
       Body:
               
       Response Code:
           400: The pageToken parameter value is invalid. This error can occur if the page token used in the request has expired or is not recognized.
       
       Response Body:
           items[]: list. A list of members that match the request criteria.
       ```
       
    5. playlist
       1. add new one to playlist
          
          ```
          PUT /playlists
          Params:
              
          Body:
              playlistId: the id parameter specifies the YouTube playlist ID for the playlist that is being added
              userId: the id of user who try update the playlist
              resourceId: the if of the resource which id being added 
          
          Response Code:
              200: The comment is updated successfully
              404: The comment ID does not exist
          ```
       
       3. remove

          ```
          DELETE /playlists
          Params:
             playlistId: the id parameter specifies the YouTube playlist ID for the playlist that is being deleted.
          Response Code:
             204: The playList is deleted successfully
             404: The playlist identified with the request's id parameter cannot be found
          ```
          
    6. comments
       1. add new
          ```
          POST /comments
          Params:
          Body:
               username: String, the name of user
               resourceId: the id of the resource which user want to comment
               content: the content of comment  
          Response Code:
             200: The comment is added successfully
             400: The comment is added unsuccessfully
             404: the resource not found
          Response Body:
             commentId: The ID of the comment. 
          ```
       2. update old
          ```
          PUT /comments/{commentId}
          Params:
              commentId: the ID of the comment
          Body:
              content: The comment content
          Response Code:
              200: The comment is updated successfully
              404: The comment ID does not exist
          ```
       3. delete
          ```
          DELETE /comments/{commentId}
          Params:
             commentId: the ID of the comment
          Response Code:
             200: The comment is deleted successfully
             404: The comment ID does not exist
          ```
    