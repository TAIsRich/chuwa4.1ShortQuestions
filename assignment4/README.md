## What is IOC?
IoC is a framework used to create and inject dependencies automatically and manages its lifecycle.
Explanation: To put this in a more understandable concept, let’s say a developer is trying to create a new object, you would need “new ThisNewObject” inside of the code, which creates a rigid bond between classes. What IoC does is that it creates this new object for the developer so that the previously mentioned step is avoided which results to your code being less rigid.

## What is DI?
DI is a way of making hard coded dependencies, loosely coupled. This could be done in a couple different methods: by using parameter in a constructor or through a setter method.

## how many DI injections in Spring Boot? please also give me code example.
**Field or Property-based Dependency Injection**

```
public class HelloController {
    @Autowired
    private Lisi lisi;
    @GetMapping("/hello")
    public String getHello(){
        lisi.say();
        return "hello world;";
    }
}
```

**Constuctor Injection**

```
public class HelloController {
    private Lisi lisi;
    @Autowired
    public HelloController(Lisi lisi){
        this.lisi = lisi;
    }
    @GetMapping("/hello")
    public String getHello(){
        lisi.say();
        return "hello world;";
    }
}
```

**Setter Injection**

```
public class HelloController {
//    @Autowired
    private Lisi lisi;
    @Autowired
    public void setLisi(Lisi lisi) {
        this.lisi = lisi;
    }

    @GetMapping("/hello")
    public String getHello(){
        lisi.say();
        return "hello world;";
    }
}
```

## Which DI Injection is better way to use?
Constructor Injection

## What are HTTP request methods?
HTTP defines a set of request methods to indicate the desired action to be performed for a given resource. Although they can also be nouns, these request methods are sometimes referred to as HTTP verbs. Each of them implements a different semantic, but some common features are shared by a group of them: e.g. a request method can be safe, idempotent, or cacheable.

## What are differences between POST and PUT?
PUT method is called when you have to modify a single resource while POST method is called when you have to add a child resource.
PUT method response can be cached but you cannot cache POST method responses.
You can use UPDATE query in PUT whereas you can use create query in POST.
In PUT method, the client decides which URI resource should have, and in POST method, the server decides which URI resource should have.
PUT works as specific while POST work as abstract.
If you send the same PUT request multiple times, the result will remain the same but if you send the same POST request multiple times, you will receive different results.
PUT method is idempotent whereas POST method is not idempotent.

## What is URL and What is URI?
URL: A Uniform Resource Locator (URL) is a type of URI that specifies not only a resource, but how to reach it on the internet—like http://, ftp://, or mailto://. *

URI: A URI identifies a resource by name, location, or both. URIs have two specializations known as Uniform Resource Locator (URL), and Uniform Resource Name (URI).

a. read this article again and again and again PLEASE (https://danielmiessler.com/study/difference-between-uri-url/)


## What is path variable? and what is Request Parameter?
@RequestParam is used to get the request parameters from URL, also known as query parameters, @PathVariable are used to extract values from the HTTP request.

## What are HTTP Response Status Codes?

Informational responses (100–199)

Successful responses (200–299)

Redirection messages (300–399)

Client error responses (400–499)

Server error responses (500–599)

## Design a collect of APIs for simple YouTube contains below modules
c.ii.1: www.youtube.com/search=lady_gaga
