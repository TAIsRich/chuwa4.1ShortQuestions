### 1) What is IOC?
___
***IOC*** is Inversion of Control means to create instances of dependencies first and latter instance of a class (optionally injecting them through constructor), instead of creating an instance of the class first and then the class instance creating instances of dependencies. Thus, inversion of control inverts the flow of control of the program. Instead of the callee controlling the flow of control (while creating dependencies), the caller controls the flow of control of the program.

### 2) What is DI?
___
***DI*** - Dependency Injection is the main functionality provided by Spring IOC. The Spring-Core module is responsible for injecting dependencies through either Constructor or Setter methods. The design principle of Inversion of Control emphasizes keeping the Java classes independent of each other and the container frees them from object creation and maintenance. These classes, managed by Spring, must adhere to the standard definition of Java-Bean. Dependency Injection in Spring also ensures loose-coupling between the classes.

### 3) how many DI injections in Spring Boot? please also give me code example.(只给你能展示这几种方法的例子就行，不用写完整的代码)
___
There are two types of Spring Dependency Injection:
a) Setter Dependency Injection (SDI): This is the simpler of the two DI methods. In this, the DI will be injected with the help of setter and/or getter methods. Now to set the DI as SDI in the bean, it is done through the bean-configuration file For this, the property to be set with the SDI is declared under the <property> tag in the bean-config file.
```
package com.geeksforgeeks.org;

import com.geeksforgeeks.org.IGeek;

public class GFG {

	// The object of the interface IGeek
	IGeek geek;

	// Setter method for property geek
	public void setGeek(IGeek geek)
	{
		this.geek = geek;
	}
}
```
b) Constructor Dependency Injection (CDI): In this, the DI will be injected with the help of constructors. Now to set the DI as CDI in bean, it is done through the bean-configuration file For this, the property to be set with the CDI is declared under the <constructor-arg> tag in the bean-config file.
```
package com.geeksforgeeks.org;
 
import com.geeksforgeeks.org.IGeek;
 
public class GFG {
 
    // The object of the interface IGeek
    IGeek geek;
 
    // Constructor to set the CDI
    GFG(IGeek geek)
    {
        this.geek = geek;
    }
}
```

### 4) Which DI Injection is better way to use?
___
Constructor Dependency Injection. 

### 5) What are HTTP request methods?
___
The internet boasts a vast array of resources hosted on different servers. For you to access these resources, your browser needs to be able to send a request to the servers and display the resources for you. HTTP (Hypertext Transfer Protocol), is the underlying format that is used to structure request and responses for effective communication between a client and a server. The message that is sent by a client to a server is what is known as an HTTP request. When these requests are being sent, clients can use various methods.

### 6) What are differences between POST and PUT?
___
***POST*** requests are utilized to send data to a server to create or update a resource.  The information submitted to the server with POST request method is archived in the request body of the HTTP request. The HTTP POST method is often used to send user-generated data to a server. One example is when a user uploads a profile photo.

***PUT*** is similar to POST as it is used to send data to the server to create or update a resource. The difference between the two is that PUT requests are idempotent. This means that if you call the same PUT requests multiple times, the results will always be the same.

### 7) What is URL and What is URI?
a) read this article again and again and again PLEASE (https://danielmiessler.com/study/difference-between-uri-url/)
___
A Uniform Resource Identifier (URI) is a string of characters that uniquely identify a name or a resource on the internet. A URI identifies a resource by name, location, or both. URIs have two specializations known as Uniform Resource Locator (URL), and Uniform Resource Name (URI).

A Uniform Resource Locator (URL) is a type of URI that specifies not only a resource, but how to reach it on the internet—like http://, ftp://, or mailto://.


### 8) What is path variable? and what is Request Parameter?
___
The @PathVariable annotation is used for data passed in the URI (e.g. RESTful web services) while @RequestParam is used to extract the data found in query parameters.

### 9) What are HTTP Response Status Codes?
___
HTTP response status codes (or simply status codes) are three-digit codes issued by a server in response to a browser-side request from a client. These status codes serve as a means of quick and concise communication on how the server worked on and responded to the client’s request.

### 10) Design a collect of APIs for simple YouTube contains below modules
___
Search
1. Keyword search on videos
GET https://youtube.com/api/v1/videos?q={keyword}
GET https://youtube.com/api/v2/videos?q={keyword}

2. Search by date
GET https://youtube.com/api/v1/videos?after=2022-04-01

3. Search Apple in Tech or Fruit
GET https://youtube.com/api/v1/videos?q=apple&category=Tech,Fruit

4. Pagination
GET https://youtube.com/api/v1/videos?limit=10&offset=0 (Return first 10 records)
GET https://youtube.com/api/v1/videos?limit=10&offset=1 (Return second 10 records)

Members
1. Get all members
GET https://youtube.com/api/v1/members

2. Get member 789 contact info
GET https://youtube.com/api/v1/members/789/contacts

Playlist
1. Add new video to playlist
POST https://youtube.com/api/v1/playlists/{playlist_id}
POST BODY
```
{ "video_id": 1234 }
```

3. Remove video from playlist 
DELETE https://youtube.com/api/v1/playlists/{playlist_id}/{video_id}

Comments
1. Add new comment
POST https://youtube.com/api/v1/comments
POST BODY
```
{ "video_id": 1234 }
```

2. Update old comment
PUT https://youtube.com/api/v1/comments/{comment_id}
PUT BODY
```
{ "comment": "New comment" }
```

4. Delete comment
DELETE https://youtube.com/api/v1/comments/{comment_id}

