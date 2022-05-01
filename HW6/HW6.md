##### Tianyi Zhang
##### Assignment 6

**1. What is IOC?**
 *Inversion of Control (IoC) is a design principle that allows classes to be loosely coupled and, therefore, easier to test and maintain. IoC refers to transferring the control of objects and their dependencies from the main program to a container or framework.*


**2. What is DI?**
*Dependency Injection (DI) is a design pattern used to implement IoC. It allows the creation of dependent objects outside of a class and provides those objects to a class through different ways. Using DI, we move the creation and binding of the dependent objects outside of the class that depends on them.*

**3. how many DI injections in Spring Boot? please also give me code example.**
 There are two types of Spring Dependency Injection. They are: 
 1. Constructor-based DI is accomplished by the container invoking a constructor with a number of arguments, each representing a dependency.

2. Setter-based DI is accomplished by the container calling setter methods on your beans after invoking a no-argument constructor or no-argument static factory method to instantiate your bean.



**4.Which DI is better way to use?***
>Use Setter injection when a number of dependencies are more or you need readability. Use Constructor Injection when Object must be created with all of its dependency.

| Overriding | Overloading |
| ------ | ------ |
| Method overriding is a run-time polymorphism. | Method overloading is a compile-time polymorphism. |
| It is used to grant the specific implementation of the method which is already provided by its parent class or superclass. | It helps to increase the readability of the program.|
| It is performed in two classes with inheritance relationships. | It occurs within the class. |
| Method overriding always needs inheritance. | Method overloading may or may not require inheritance. |
| In method overriding, methods must have the same name and same signature. | In method overloading, methods must have the same name and different signatures |
| In method overriding, the return type must be the same or co-variant. | In method overloading, the return type can or can not be the same, but we just have to change the parameter. |



In Java, the `final` keyword can be used while declaring an entity. Using the final keyword means that the value can’t be modified in the future. This entity can be - but is not limited to - a variable, a class or a method.
- method: A method, declared with the final keyword, cannot​ be overridden or hidden by subclasses.
- class: A class​ declared as a final class, cannot be subclassed
- 



**5. What are HTTP request methods**
HTTP requests work as the intermediary transportation method between a client/application and a server. The client submits an HTTP request to the server, and after internalizing the message, the server sends back a response. The response contains status information about the request.

**6. What are differences between POST and PUT?**
Both PUT and POST request methods are used to facilitate data transmission between a client and a server, and despite having a similar role of sending data to create and update resources, they have their subtle differences as shown in the following table.

| PUT | POST | 
| ------ | ------ | 
|It is idempotent, meaning that putting a resource twice will have no effect|	It is not idempotent, and thus calling a POST request repeatedly is discouraged.|	
|Identity is selected by the client|	Identity is returned by the server|	
|Operates as specific|	Operates as abstract|


**7. What is URL and What is URI?**
- URL: URL (Uniform Resource Locator) is often defined as a string of characters that is directed to an address. It is a very commonly used way to locate resources on the web. It provides a way to retrieve the presentation of the physical location by describing its network location or primary access mechanism. The protocol is described within the URL which is employed to retrieve the resource and resource name. The URL contains http/https at the start if the resource may be a web type resource. Similarly, it begins with ftp if the resource may be a file and mailto if the resource is an email address.
- Similar to URL, URI (Uniform Resource Identifier) is also a string of characters that identifies a resource on the web either by using location, name or both. It allows uniform identification of the resources. A URI is additionally grouped as a locator, a name or both which suggests it can describe a URL, URN or both. The term identifier within the URI refers to the prominence of the resources, despite the technique used.


**8. What is path variable? and what is Request Parameter?**
- Path variable: As the name implies, it lets you specify a variable as part of the URL path. It's a great choice for paths that include IDs. 
- Request parameters are used to send additional information to the server. A URL contains these parameters. There are two types of parameters: Query Parameter and Path Parameters.


	
**9.What are HTTP Response Status Codes?**
HTTP response status codes indicate whether a specific HTTP request has been successfully completed. Responses are grouped in five classes:
1. Informational responses (100–199)
2. Successful responses (200–299)
3. Redirection messages (300–399)
4. Client error responses (400–499)
5. Server error responses (500–599)


