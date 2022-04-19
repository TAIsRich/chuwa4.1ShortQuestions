# What is IOC?



https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring


# What is DI?



# how many DI injections in Spring Boot? please also give me code example.(只给你能展示这几种方法的例子就行，不用写完整的代码)


## Constructor-Based Dependency Injection

In the case of constructor-based dependency injection, the container will invoke a constructor with arguments each representing a dependency we want to set.

Spring resolves each argument primarily by type, followed by name of the attribute, and index for disambiguation. Let's see the configuration of a bean and its dependencies using annotations:

```java 
@Configuration
public class AppConfig {

    @Bean
    public Item item1() {
        return new ItemImpl1();
    }

    @Bean
    public Store store() {
        return new Store(item1());
    }
}
```

The @Configuration annotation indicates that the class is a source of bean definitions. We can also add it to multiple configuration classes.

We use the @Bean annotation on a method to define a bean. If we don't specify a custom name, then the bean name will default to the method name.

For a bean with the default singleton scope, Spring first checks if a cached instance of the bean already exists, and only creates a new one if it doesn't. If we're using the prototype scope, the container returns a new bean instance for each method call.

Another way to create the configuration of the beans is through XML configuration:

```java
<bean id="item1" class="org.baeldung.store.ItemImpl1" /> 
<bean id="store" class="org.baeldung.store.Store"> 
    <constructor-arg type="ItemImpl1" index="0" name="item" ref="item1" /> 
</bean>
```

## Setter-Based Dependency Injection

For setter-based DI, the container will call setter methods of our class after invoking a no-argument constructor or no-argument static factory method to instantiate the bean. Let's create this configuration using annotations:

```java 
@Bean
public Store store() {
    Store store = new Store();
    store.setItem(item1());
    return store;
}
```

We can also use XML for the same configuration of beans:

```java 
<bean id="store" class="org.baeldung.store.Store">
    <property name="item" ref="item1" />
</bean>
```
We can combine constructor-based and setter-based types of injection for the same bean. The Spring documentation recommends using constructor-based injection for mandatory dependencies, and setter-based injection for optional ones.

## Field-Based Dependency Injection

In case of Field-Based DI, we can inject the dependencies by marking them with an @Autowired annotation:

```java 
public class Store {
    @Autowired
    private Item item; 
}
```
While constructing the Store object, if there's no constructor or setter method to inject the Item bean, the container will use reflection to inject Item into Store.

We can also achieve this using XML configuration.

This approach might look simpler and cleaner, but we don't recommend using it because it has a few drawbacks such as:

This method uses reflection to inject the dependencies, which is costlier than constructor-based or setter-based injection.
It's really easy to keep adding multiple dependencies using this approach. If we were using constructor injection, having multiple arguments would make us think that the class does more than one thing, which can violate the Single Responsibility Principle.
More information on the @Autowired annotation can be found in the Wiring In Spring article.




# Which DI Injection is better way to use?

Constructor injection should be the main way that you do dependency injection. It’s simple: A class needs something and thus asks for it before it can even be constructed. By using the guard pattern, you can use the class with confidence, knowing that the field variable storing that dependency will be a valid instance. Plus, it’s really simple and clear to do.

Constructor injection should be your go-to technique for clear, decoupled code. But it shouldn’t be the only tool in the toolbox.

https://betterprogramming.pub/the-3-types-of-dependency-injection-141b40d2cebc



# What are HTTP request methods?

The Hypertext Transfer Protocol (HTTP) is designed to enable communications between clients and servers.

HTTP works as a request-response protocol between a client and server.

Example: A client (browser) sends an HTTP request to the server; then the server returns a response to the client. The response contains status information about the request and may also contain the requested content.


GET

POST

PUT

HEAD

DELETE

PATCH

OPTIONS

CONNECT

TRACE


https://www.w3schools.com/tags/ref_httpmethods.asp

# What are differences between POST and PUT?

POST is used to send data to a server to create/update a resource.

The data sent to the server with POST is stored in the request body of the HTTP request:

POST /test/demo_form.php HTTP/1.1
Host: w3schools.com

name1=value1&name2=value2
Some notes on POST requests:

POST requests are never cached
POST requests do not remain in the browser history
POST requests cannot be bookmarked
POST requests have no restrictions on data length


PUT is used to send data to a server to create/update a resource.

The difference between POST and PUT is that PUT requests are idempotent. That is, calling the same PUT request multiple times will always produce the same result. In contrast, calling a POST request repeatedly have side effects of creating the same resource multiple times.

https://www.w3schools.com/tags/ref_httpmethods.asp#:~:text=The%20difference%20between%20POST%20and,the%20same%20resource%20multiple%20times.


# What is URL and What is URI?
read this article again and again and again PLEASE (https://danielmiessler.com/study/difference-between-uri-url/)

The difference between a URI and a URL is that a URI can be just a name by itself, or a name with a protocol that tells you how to reach it—which is a URL.


# What is path variable? and what is Request Parameter?

URLs have their own specific structure as well. In that structure you have the following components:

The Scheme, which is the protocol that you’re using to interact.

The Authority, which is the target you’re accessing. This breaks down into userinfo, host, and port.

The Path, which is the resource you’re requesting on the host.

The Query, which are the parameters being used within the web application.

The Fragment, which is the target to jump to within a given page.


Query parameters indicate an argument being passed into a web application, such as a search function for a webpage, like:

https://google.com/search?s=bing

This would search for the word “bing” on a function called search on Google.

# What are HTTP Response Status Codes?

HTTP response status codes indicate whether a specific HTTP request has been successfully completed. Responses are grouped in five classes:

Informational responses (100–199)

Successful responses (200–299)

Redirection messages (300–399)

Client error responses (400–499)

Server error responses (500–599)

The below status codes are defined by section 10 of RFC 2616. You can find an updated specification in RFC 7231.



https://developer.mozilla.org/en-US/docs/Web/HTTP/Status

# Design a collect of APIs for simple YouTube contains below modules(不求绝对最好，能力范围内做最好就行，哪怕写一行字，也要提交作业，只要交作业，就比不交强)

https://restfulapi.net/resource-naming/
https://www.freecodecamp.org/news/rest-api-best-practices-rest-endpoint-design-examples/
Search. we have v1 and v2 two versions.
v1, v2
try to make it be powerful.
use keyword to search
search one video between 04/01/2022 to now
search apple in category Tech or Fruit
pagination. if we got 100 results, we split it to 10 each page.
and more if you can think out.
members
playlist
add new one to playlist
remove
comments
add new
update old
delete
