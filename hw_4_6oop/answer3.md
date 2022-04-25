	What is IOC?
The IoC pattern is a way of reversing the traditional approach to create and initialize Java objects. Rather than create objects directly within their code, developers ask a third party, such as the Spring container or the Java EE context, to provide instances instead. It allows objects to be centrally managed, easily configured and integrated into testing cycles, all while simplifying the life of the software developer introducing core functionality. No wonder the inversion of control principle is so omnipresent in the world of modern software development.
	What is DI?
Dependency injection (DI) is the concept in which objects get other required objects from outside. DI can be implemented in any programming language. The general concept behind dependency injection is called Inversion of Control. A Java class has a dependency on another class, if it uses an instance of this class.
	how many DI injections in Spring Boot? please also give me code example.(只给你能展示这几种方法的例子就行，不用写完整的代码)
Setter Dependency Injection (SDI):
public class GFG {
 
    IGeek geek;
 
    public void setGeek(IGeek geek)
    {
        this.geek = geek;
    }
}
Constructor Dependency Injection (CDI):
public class GFG {
 
    IGeek geek;
 
    GFG(IGeek geek)
    {
        this.geek = geek;
    }
}


	Which DI Injection is better way to use?
Setter-based DI helps us to inject the dependency only when it is required, as opposed to requiring it at construction time. Spring code generation library doesn't support constructor injection so it will not be able to create proxy. It will force you to use no-argument constructor.
	What are HTTP request methods?
GET
The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.
HEAD
The HEAD method asks for a response identical to a GET request, but without the response body.
POST
The POST method submits an entity to the specified resource, often causing a change in state or side effects on the server.
PUT
The PUT method replaces all current representations of the target resource with the request payload.
DELETE
The DELETE method deletes the specified resource.
CONNECT
The CONNECT method establishes a tunnel to the server identified by the target resource.
OPTIONS
The OPTIONS method describes the communication options for the target resource.
TRACE
The TRACE method performs a message loop-back test along the path to the target resource.
PATCH
The PATCH method applies partial modifications to a resource.

	What are differences between POST and PUT?
The difference between POST and PUT is that PUT requests are idempotent. That is, calling the same PUT request multiple times will always produce the same result. In contrast, calling a POST request repeatedly have side effects of creating the same resource multiple times.
	What is URL and What is URI?
URI is an acronym for Uniform Resource Identifier. URL is an acronym for Uniform Resource Locator. URI contains two subsets, URN, which tell the name, and URL, which tells the location. URL is the subset of URI, which tells the only location of the resource.

	What is path variable? and what is Request Parameter?
The @PathVariable annotation is used for data passed in the URI (e.g. RESTful web services) while @RequestParam is used to extract the data found in query parameters.
	What are HTTP Response Status Codes?
HTTP response status codes (or simply status codes) are three-digit codes issued by a server in response to a browser-side request from a client. These status codes serve as a means of quick and concise communication on how the server worked on and responded to the client's request.
	Design a collect of APIs for simple YouTube contains below modules
