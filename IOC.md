<font size = 5, color = black>
1.What is IOC? 
=
IOC is a container which creates the objects, configures and assembles their dependencies, manages their entire life cycle. The Container uses Dependency Injection(DI) to manage the components that make up the application.

2.What is DI?
=
DI allows objects get other required objects from outside.IOC container injects objects into other objects or dependencies

3.How many DI injections in Spring Boot? please also give me code example.(只给你能展示这几种方法的例子就行，不用写完整的代码)
=
public class Student{    
private String name;    
private int    ID;  }  

1)Constructor based Dependency Injection:  
public class School{    
private Student student;    
@Autowired  
  public School(Student student){  
this.student = student;}}

2)Setter based Dependency Injection:  
public class School{    
private Student student;    
@Autowired  
  public void setStudent(Student student){  
this.student = student;}}

3)Field or Property-based Dependency Injection:  
public class School{    
 @Autowired  
private Student student;   
  }
4.Which DI Injection is better way to use?
=
Use Setter injection when a number of dependencies are more or you need readability. Use Constructor Injection when Object must be created with all of its dependency.
5.What are HTTP request methods?
=
GET:GET is used to request data from a specified resource.  
POST:POST is used to send data to a server to create/update a resource.  
PUT:PUT is used to send data to a server to create/update a resource.  
HEAD:HEAD is almost identical to GET, but without the response body.  
DELETE:The DELETE method deletes the specified resource.  
PATCH:The PATCH method is used to apply partial modifications to a resource.  
OPTIONS:The OPTIONS method describes the communication options for the target resource.  
CONNECT:The CONNECT method is used to start a two-way communications (a tunnel) with the requested resource.  
TRACE:The TRACE method method is used to perform a message loop-back test that tests the path for the target resource (useful for debugging purposes).  

6.What are differences between POST and PUT?
=
The difference between POST and PUT is that PUT requests are idempotent. That is, calling the same PUT request multiple times will always produce the same result. In contrast, calling a POST request repeatedly have side effects of creating the same resource multiple times.  
7.What is URL and What is URI?
=
URL:URL stands for Uniform Resource Locator. A URL is nothing more than the address of a given unique resource on the Web. In theory, each valid URL points to a unique resource.   
URI:URI is a unique sequence of characters that identifies a logical or physical resource used by web technologies.  

read this article again and again and again PLEASE (https://danielmiessler.com/study/difference-between-uri-url/)

8.What is path variable? and what is Request Parameter?
=
Path Variable is a Spring annotation which indicates that a method parameter should be bound to a URI template variable.  

Request parameters are used to send additional information to the server. A URL contains these parameters.
  
9.What are HTTP Response Status Codes?
=
An HTTP status code is a server response to a browser’s request. When you visit a website, your browser sends a request to the site’s server, and the server then responds to the browser’s request with a three-digit code.    

 Here are some common codes:   
1xxs – Informational responses: The server is thinking through the request.  
2xxs – Success! The request was successfully completed and the server gave the browser the expected response.  
3xxs – Redirection: You got redirected somewhere else. The request was received, but there’s a redirect of some kind.  
4xxs – Client errors: Page not found. The site or page couldn’t be reached. (The request was made, but the page isn’t valid — this is an error on the website’s side of the conversation and often appears when a page doesn’t exist on the site.)  
5xxs – Server errors: Failure. A valid request was made by the client but the server failed to complete the request.

10.Design a collect of APIs for simple YouTube contains below modules
=
Search. we have v1 and v2 two versions.  
https://Youtube.com/v1/search  
https://Youtube.com/v2/search    

use keyword to search   
https://Youtube.com/search/videos?name=keyword%  

search one video between 04/01/2022 to now  

search apple in category Tech or Fruit  
https://Youtube.com/search/items?category=tech&category=fruit

pagination. if we got 100 results, we split it to 10 each page.  
https://Youtube.com/search/items?limit=20&offset=20  

members  
https://Youtube.com/search/members  

playlist  
https://Youtube.com/search/members/{memberId}/playlists  

add new one to playlist  
HTTP POST https://Youtube.com/search/members/{memberId}/playlists/item?video  

remove  
HTTP DELETE https://Youtube.com/search/members/{memberId}/playlists/item?video  

comments  
https://Youtube.com/search/members/{memberId}/playlists/comments   

add new  
HTTP POST https://Youtube.com/search/members/{memberId}/playlists/item?comment    

update old  
HTTP PUT  https://Youtube.com/search/members/{memberId}/playlists/item?comment  

delete  
HTTP DELETE https://Youtube.com/search/members/{memberId}/playlists/item?comment