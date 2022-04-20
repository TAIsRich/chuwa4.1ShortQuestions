#1
Inversion of control (IOC) is a **programming principle**, which inverts the flow of control as compared to traditional control flow. It is used to *increase modularity of the program and make it extensible*.
#2
Dependency injection (DI) is the concept in which objects get other required objects from outside.
#3
There are **two** types of Spring Dependency Injection.*Setter Dependency Injection (SDI) and Constructor Dependency Injection (CDI)*.
**SDI Example:**
public class Canine {
    // object 
    IDog dog;
    // Setter method for property dog
    public void setDog(Dog dog){
        this.dog = dog;
    }
}
**CDI Example:**
public class Canine {
    // object
    IDog dog;
    // Constructor to set the CDI
    Canine(IDog dog){
        this.dog = dog;
    }
}
#4
**SDI**. Because It's more *readable*, and has more *flexibility* in changing values.
#5
HTTP methods are POST, GET, PUT, PATCH, DELETE, HEAD, CONNECT, and TRACE.
#6
PUT requests are **idempotent**. That is, calling the same PUT request multiple times will always produce the same result. In contrast, calling a POST request repeatedly have side effects of creating the same resource multiple times.
#7
**URL** is an acronym for Uniform Resource ***Locator***. URI is an acronym for Uniform Resource ***Identifier***. URI contains two subsets, URN, which tell the name, and URL, which tells the location. URL is the subset of URI, which tells the only location of the resource.
#8
**Path Variable** used for accessing the values *from the URI template*.**Request Parametr** used for accessing the values *of the query parameters*.
#9
An HTTP status code is a **server** response to a **browser's request**. It ndicate whether a specific HTTP request has been successfully completed. 

Informational responses (100–199)

Successful responses (200–299)

Redirection messages (300–399)

Client error responses (400–499)

Server error responses (500–599)

#10
www.youtube.com/result?serach=gnash&date=after-2022-04-01&sort=upload-date&limit==10
