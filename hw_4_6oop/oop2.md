### 1.	What is IOC?
spring IoC is the mechanism to achieve loose-coupling between Objects dependencies.
To achieve loose coupling and dynamic binding of the objects at runtime, objects dependencies are injected
by other assembler objects. Spring IoC container is the program that injects dependencies into
an object and make it ready for our use

### 2.	What is DI?
Dependency Injection is a fundamental aspect of the Spring framework, through which the Spring container “injects”
objects into other objects or “dependencies”. Simply put, this allows for loose coupling of components
and moves the responsibility of managing components onto the container

### 3.	how many DI injections in Spring Boot? please also give me code example.
Setter Dependency Injection (SDI): This is the simpler of the two DI methods. In this, the DI will be injected with the help of setter and/or getter methods. Now to set the DI as SDI in the bean, it is done through the bean-configuration file For this, the property to be set with the SDI is declared under the <property> tag in the bean-config file.
Example: Let us say there is class GFG that uses SDI and sets the property geeks. The code for it is given below.
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
<beans
XML:
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

Constructor Dependency Injection (CDI): In this, the DI will be injected with the help of constructors. Now to set the DI as CDI in bean, it is done through the bean-configuration file For this, the property to be set with the CDI is declared under the <constructor-arg> tag in the bean-config file.
Example: Let us take the same example as of SDI

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

<beans>

XML:
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

### 4.	Which DI Injection is better way to use?
1. Constructor Injection
   Constructor injection is the process of using the constructor to pass in the dependencies of a class.
   The dependencies are declared as parameters of the constructor. As a result, you cannot create a new instance of the class
   without passing in a variable of the type required by the constructor

2. Property Injection
   we use constructor injection when we want to declare required dependencies. But what to do when a dependency
   isn’t required? Sometimes a class has a dependency that isn’t strictly required but is indeed used by the class.
   An example might be a document class that may or may not have a grammar checker installed. If there is one, great; the class can use it. If there isn’t one, great — the class can include a default implementation as a placeholder

3. Method Injection
   What if the dependency that your class needs is going to be different much of the time?
   What if the dependency is an interface, and you have several implementations that you may want to
   pass into the class? You could use property injection, but then you’d be setting the property all
   the time before calling the method that utilized the frequently changing dependency, setting up the possibility of temporal coupling.

### 5. What are HTTP request methods?
1. GET
The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.
2. HEAD
The HEAD method asks for a response identical to a GET request, but without the response body
3. POST
The POST method submits an entity to the specified resource, often causing a change in state or side effects on the server.
4. PUT
The PUT method replaces all current representations of the target resource with the request payload.
5.	DELETE
The DELETE method deletes the specified resource.
6.	CONNECT
The CONNECT method establishes a tunnel to the server identified by the target resource.

### 6.	What are differences between POST and PUT?
1.PUT method is called when you have to modify a single resource while POST method is called when you have to add a child resource.
2.PUT method response can be cached but you cannot cache POST method responses.
3.You can use UPDATE query in PUT whereas you can use create query in POST.
4.In PUT method, the client decides which URI resource should have, and in POST method, the server decides which URI resource should have.
5.PUT works as specific while POST work as abstract.
6.If you send the same PUT request multiple times, the result will remain the same but if you send the same POST request multiple times, you will receive different results.
7.PUT method is idempotent whereas POST method is not idempotent

### 7. What is URL and What is URI?
URL : URL is used to describe the identity of an item
URL links a web page, a component of a web page or a program on a web page with the help of accessing methods like protocols.
URL provides the details about what type of protocol is to be used.
URL is a type of URI.
URI: URI provides a technique for defining the identity of an item
URI is used to distinguish one resource from other regardless of the method used.
URI it dosen't contains the protocol specification
URI is the superset of URL.

### 8. What is path variable? and what is Request Parameter?
Path variables allow for defining variables within a URL that are part of the URL path. Path variables are required because the path must be valid in order to be a valid URL. Path variables are useful for defining IDs or UUIDs that are part of the URL, which is a common pattern seen in many HTTP APIs
API Parameters are options that can be passed with the endpoint to influence the response. In GET requests, they're found in strings at the end of the API URL path. In POST requests, they're found in the POST body

### 9. What are HTTP Response Status Codes?
HTTP response status codes indicate whether a specific HTTP request has been successfully completed. Responses are grouped in five classes:
1. Informational responses (100–199)
2. Successful responses (200–299)
3. Redirection messages (300–399)
4. Client error responses (400–499)
5. Server error responses (500–599)

### 10. Design a collect of APIs for simple YouTube contains below modules
1. This is channel list api code
      {
      "kind": "youtube#channelListResponse",
      "etag": etag,
      "nextPageToken": string,
      "prevPageToken": string,
      "pageInfo": {
      "totalResults": integer,
      "resultsPerPage": integer
      },
      "items": [
      channel Resource
      ]

2. This is channel overview code
   {
   "kind": "youtube#channel",
   "etag": etag,
   "id": string,
   "snippet": {
   "title": string,
   "description": string,
   "customUrl": string,
   "publishedAt": datetime,
   "thumbnails": {
   (key): {
   "url": string,
   "width": unsigned integer,
   "height": unsigned integer
   }
   },
   "defaultLanguage": string,
   "localized": {
   "title": string,
   "description": string
   },
   "country": string
   },
   "contentDetails": {
   "relatedPlaylists": {
   "likes": string,
   "favorites": string,
   "uploads": string
   }
   },
   "statistics": {
   "viewCount": unsigned long,
   "subscriberCount": unsigned long,  // this value is rounded to three significant figures
   "hiddenSubscriberCount": boolean,
   "videoCount": unsigned long
   },
   "topicDetails": {
   "topicIds": [
   string
   ],
   "topicCategories": [
   string
   ]
   },
   "status": {
   "privacyStatus": string,
   "isLinked": boolean,
   "longUploadsStatus": string,
   "madeForKids": boolean,
   "selfDeclaredMadeForKids": boolean
   },
   "brandingSettings": {
   "channel": {
   "title": string,
   "description": string,
   "keywords": string,
   "trackingAnalyticsAccountId": string,
   "moderateComments": boolean,
   "unsubscribedTrailer": string,
   "defaultLanguage": string,
   "country": string
   },
   "watch": {
   "textColor": string,
   "backgroundColor": string,
   "featuredPlaylistId": string
   }
   },
   "auditDetails": {
   "overallGoodStanding": boolean,
   "communityGuidelinesGoodStanding": boolean,
   "copyrightStrikesGoodStanding": boolean,
   "contentIdClaimsGoodStanding": boolean
   },
   "contentOwnerDetails": {
   "contentOwner": string,
   "timeLinked": datetime
   },
   "localizations": {
   (key): {
   "title": string,
   "description": string
   }
   }
   }

3. This is search code
      {
      "kind": "youtube#searchResult",
      "etag": etag,
      "id": {
      "kind": string,
      "videoId": string,
      "channelId": string,
      "playlistId": string
      },
      "snippet": {
      "publishedAt": datetime,
      "channelId": string,
      "title": string,
      "description": string,
      "thumbnails": {
      (key): {
      "url": string,
      "width": unsigned integer,
      "height": unsigned integer
      }
      },
      "channelTitle": string,
      "liveBroadcastContent": string
      }
}
