1)What is IOC?

ans: spring ioc container(IOC) is the core of the spring framework, it creates the objects
, configures and assembles their dependencies, manages their entire life cycle.
IOC uses dependency injection(DI) to manage the componenets that make up the app.
it fetch info of objects from a configuration file called XML, or java code, or java nnotations, java pojo class.
these object are called beans. since you as developers are not in control of these object and lifecycle. hence the name
inversion of control

2)What is DI?

ans: Dependency injection is a through the Spring container it injects objects into other objects "dependencies".
simply put, this allows for loose coupling (not alot of dependency) of components and moves the responsibility of managing components onto the container.

3)how many DI injections in Spring Boot? please also give me code example.(只给你能展示这几种方法的例子就行，不用写完整的代码)

ans: there are two types:
Setter Dependency Injection vs Constructor Dependency Injection

ex1) SDI
public class GFG {

IGeek geek;
public void setGeek(IGeek geek)
{
this.geek = geek;
}
}

ex2)CDI

public class Store P
private Item item;
public Store (Item item){
this.item =item; //item here replaces new item();
}

4)Which DI Injection is better way to use?

based on initial observation, i think
CDI is slighter better to use, since it got good readibility
and dont need getter, setter, and best case use when you trying to
achieve loose coupling

5)What are HTTP request methods?

http request method in the context of springboot means:
Representational state transfer (REST), it has a style similar to encapsulation, which made to constrain what
developers used to create web services (REST web services). restful service allow developers to develop app with CRUD operations
:create, retrieve, update, delete (these are called CRUD). there are 5 commonly used HTTP verd in HTTP Methods which perform CRUD operations:
GET(Read), POST(Create), PUT(update/replace), PATCH(Partial Update), Delete(delete).

6)What are differences between POST and PUT?

POST is used to create, but wont replace, it ll notify you the resource already exists
PUT: it wont create, but if resource already exist it ll replaced it.

7)What is URL and What is URI?
a)read this article again and again and again PLEASE (https://danielmiessler.com/study/difference-between-uri-url/)

URI is a sequence of characters (name, ex google.com) that identify where the website is

URL is a child/subset of URI, it identify where the website is available (name + resource, ex http://google.com) and provide a mechanism for others to access it

URN is the ID number of the website

8)What is path variable? and what is Request Parameter?

ans: @RequestParam is used to get the request parameters from URL, also known as query parameters, while @PathVariable extracts values from URI

9)What are HTTP Response Status Codes?

ans: http response status code indicate whether a http request you made
is successfully completed or not. .
some of the most commons one ares:

-100 Continue

-200 OK
The request succeeded. The result meaning of "success" depends on the HTTP method:

GET: The resource has been fetched and transmitted in the message body.
HEAD: The representation headers are included in the response without any message body.
PUT or POST: The resource describing the result of the action is transmitted in the message body.
TRACE: The message body contains the request message as received by the server.

-201 Created
The request succeeded, and a new resource was created as a result. This is typically the response sent after POST requests, or some PUT requests.

10)Design a collect of APIs for simple YouTube contains below modules
