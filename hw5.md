* ```
  What is IOC?
  ```
  
  IoC is a framework used to create and inject dependencies automatically and manages its lifecycle.
  Explanation:
  To put this in a more understandable concept, let’s say a developer is trying to create a new object, you would need “new ThisNewObject” inside of the code, which creates a rigid bond between classes. What IoC does is that it creates this new object for the developer so that the previously mentioned step is avoided which results to your code being less rigid.
* ```
  What is DI?
  ```
  
  DI is a way of making hard coded dependencies, loosely coupled. This could be done in a couple different methods: by using  parameter in a constructor  or through a **setter method**.
* ```
  how many DI injections in Spring Boot? please also give me code example.(只给你能展示这几种方法的例子就行，不用写完整的代码)
  ```

** Field or Property-based Dependency Injection**

```
@RestController
public class StudentContoller {

    @Autowired
    private StudentInfo studentInfo;

@GetMapping（"/print"）
    public String print(){
        return studentInfo.print();
```

**Constuctor Injection**

```
@RestController
public class StudentContoller {
private StudentInfo studentInfo;

@Autowired
public StudentContoller(StudentInfo studentInfo){
this.studentInfo=studentInfo;
}

@GetMapping（"/print"）
public String print(){
return studentInfo.print();
}
````

**Setter Injection**

```
@RestController
public class StudentContoller {

    private StudentInfo studentInfo;

    @Autowired
    public void setStudentInfo(StudentInfo studentInfo){
        this.studentInfo=studentInfo;
    }

    @GetMapping（"/print"）
    public String print(){
        return studentInfo.print();
    }
}
````

```

```

```
Which DI Injection is better way to use?
```

**Constructor Injection**

```
What are HTTP request methods?
```

**GET**
**POST**
**DELETE**
**PUT**
**CONNECT**
**HEAD**
**OPTIONS**
**TRACE**

```
What are differences between POST and PUT?
```

* PUT method is called when you have to modify a single resource while POST method is called when you have to add a child resource.
* PUT method response can be cached but you cannot cache POST method responses.
* You can use UPDATE query in PUT whereas you can use create query in POST.
* In PUT method, the client decides which URI resource should have, and in POST method, the server decides which URI resource should have.
* PUT works as specific while POST work as abstract.
* If you send the same PUT request multiple times, the result will remain the same but if you send the same POST request multiple times, you will receive different results.
* PUT method is idempotent whereas POST method is not idempotent.

```
13. What is URL and What is URI?
```

A `URI` *identifies a resource by name, location, or both*. URIs have two specializations known as Uniform Resource Locator (URL), and Uniform Resource Name (`URI`).

A Uniform Resource Locator (`URL`) is a type of URI that specifies not only a resource, *but how to reach it on the internet—like `http://`, `ftp://`, or `mailto://`*.
*

```
What is path variable? and what is Request Parameter?
```

@RequestParam is used to get the request parameters from URL, also known as query parameters,
@PathVariable are used to extract values from the HTTP request,

```
What are HTTP Response Status Codes?
```

1. [Informational responses](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status#information_responses) (`100`–`199`)
2. [Successful responses](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status#successful_responses) (`200`–`299`)
3. [Redirection messages](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status#redirection_messages) (`300`–`399`)
4. [Client error responses](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status#client_error_responses) (`400`–`499`)
5. [Server error responses](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status#server_error_responses) (`500`–`599`)

```

