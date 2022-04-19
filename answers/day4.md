# Ass 4

## 1. What is IOC?

In software engineering, inversion of control (IoC) is a programming principle. IoC inverts the flow of control as compared to traditional control flow. In IoC, custom-written portions of a computer program receive the flow of control from a generic framework. A software architecture with this design inverts control as compared to traditional procedural programming: in traditional programming, the custom code that expresses the purpose of the program calls into reusable libraries to take care of generic tasks, but with inversion of control, it is the framework that calls into the custom, or task-specific, code.

## 2. What is DI?

Dependency injection is a technique in which an object receives other objects that it depends on, called dependencies. Typically, the receiving object is called a client and the passed-in ('injected') object is called a service. The code that passes the service to the client is called the injector. Instead of the client specifying which service it will use, the injector tells the client what service to use. The 'injection' refers to the passing of a dependency (a service) into the client that uses it.

## 3. how many DI injections in Spring Boot? please also give me code example.

There are two types of Spring Dependency Injection. They are:

- 1. Setter Dependency Injection (SDI): This is the simpler of the two DI methods. In this, the DI will be injected with the help of setter and/or getter methods. Now to set the DI as SDI in the bean, it is done through the bean-configuration file For this, the property to be set with the SDI is declared under the <property> tag in the bean-config file.
     '''
     {
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
}

{
<beans
xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

    <bean id="GFG" class="com.geeksforgeeks.org.GFG">
    	<property name="geek">
    		<ref bean="CsvGFG" />
    	</property>
    </bean>

<bean id="CsvGFG" class="com.geeksforgeeks.org.impl.CsvGFG" />
<bean id="JsonGFG" class="com.geeksforgeeks.org.impl.JsonGFG" />
		
</beans>

}
'''

- 2. Constructor Dependency Injection (CDI): In this, the DI will be injected with the help of constructors. Now to set the DI as CDI in bean, it is done through the bean-configuration file For this, the property to be set with the CDI is declared under the <constructor-arg> tag in the bean-config file.

'''
{
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

}

{
<beans
xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

    <bean id="GFG" class="com.geeksforgeeks.org.GFG">
    	<constructor-arg>
    		<bean class="com.geeksforgeeks.org.impl.CsvGFG" />
    	</constructor-arg>
    </bean>

<bean id="CsvGFG" class="com.geeksforgeeks.org.impl.CsvGFG" />
<bean id="JsonGFG" class="com.geeksforgeeks.org.impl.JsonGFG" />
		
</beans>

}
'''

## 4. Which DI Injection is better way to use?

Setter and constructor injections have their own pros and cons as discussed above. So we should use the combination of both which is also suggested by the Spring community itself.
Use constructor injection for the mandatory dependencies and setter injection for optional dependencies. (Here mandatory dependency is the one without which the main business logic wouldn’t work and optional dependencies are the ones which if null doesn’t hamper the main business logic.)

## 5. What are HTTP request methods?

HTTP defines a set of request methods to indicate the desired action to be performed for a given resource.

- _GET_
  The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.

- _HEAD_
  The HEAD method asks for a response identical to a GET request, but without the response body.

- _POST_
  The POST method submits an entity to the specified resource, often causing a change in state or side effects on the server.

- _PUT_
  The PUT method replaces all current representations of the target resource with the request payload.

- _DELETE_
  The DELETE method deletes the specified resource.

- _CONNECT_
  The CONNECT method establishes a tunnel to the server identified by the target resource.

- _OPTIONS_
  The OPTIONS method describes the communication options for the target resource.

- _TRACE_
  The TRACE method performs a message loop-back test along the path to the target resource.

- _PATCH_
  The PATCH method applies partial modifications to a resource.

## 6. What are differences between POST and PUT?

The difference between POST and PUT is that PUT requests are idempotent. That is, calling the same PUT request multiple times will always produce the same result. In contrast, calling a POST request repeatedly have side effects of creating the same resource multiple times.

## 7. What is URL and What is URI?

A URL provides the location of the resource.
A URI identifies the resource by name at the specified location or URL.

## 8. What is path variable? and what is Request Parameter?

Path variables allow for defining variables within a URL that are part of the URL path. Path variables are required because the path must be valid in order to be a valid URL. Path variables are useful for defining IDs or UUIDs that are part of the URL, which is a common pattern seen in many HTTP APIs.

Query parameters indicate an argument being passed into a web application, such as a search function for a webpage

## 9. What are HTTP Response Status Codes?

HTTP response status codes indicate whether a specific HTTP request has been successfully completed. Responses are grouped in five classes:

Informational responses (100–199)
Successful responses (200–299)
Redirection messages (300–399)
Client error responses (400–499)
Server error responses (500–599)

## 10. Design a collect of APIs for simple YouTube contains below modules

    public static YouTube getService() throws GeneralSecurityException, IOException {
        final NetHttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
        Credential credential = authorize(httpTransport);
        return new YouTube.Builder(httpTransport, JSON_FACTORY, credential)
            .setApplicationName(APPLICATION_NAME)
            .build();
    }

List:
YouTube youtubeService = getService();
// Define and execute the API request
YouTube.ChannelSections.List request = youtubeService.channelSections()
.list("");
ChannelSectionListResponse response = request.execute();
System.out.println(response);

Insert:

    YouTube youtubeService = getService();

        // Define the ChannelSection object, which will be uploaded as the request body.
        ChannelSection channelSection = new ChannelSection();

        // Define and execute the API request
        YouTube.ChannelSections.Insert request = youtubeService.channelSections()
            .insert("", channelSection);
        ChannelSection response = request.execute();
        System.out.println(response);
    }

Update:

      YouTube youtubeService = getService();

        // Define the ChannelSection object, which will be uploaded as the request body.
        ChannelSection channelSection = new ChannelSection();

        // Define and execute the API request
        YouTube.ChannelSections.Update request = youtubeService.channelSections()
            .update("", channelSection);
        ChannelSection response = request.execute();

Delete:
YouTube youtubeService = getService();
// Define and execute the API request
YouTube.ChannelSections.Delete request = youtubeService.channelSections()
.delete("");
request.execute();
