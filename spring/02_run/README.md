# Run

Run a simple Spring application

## Learning Objectives

1. Create a REST endpoint in a Spring application
1. Name one way to start a Spring application from IntelliJ
1. Stretch: Describe IntelliJ Intention Actions 
1. Stretch: Distinguish between the Rest Controller annotation and the Request Mapping annotation

## Instructions

- If you completed `01_setup`, you may use the `demo` directory created in your workspace

- If you're starting here, use the `02_run/demo` directory and complete the following:

    - **Import the Maven Project**
    
        Before beginning, IntelliJ needs to recognize demo as a Maven project. 
        
        To check if the project has been added, click `Maven Projects` in the right hand menu. You should see demo as a dropdown option.
        
        If you do not, do the following:
        - In the project directory panel (left), note the location of the pom.xml file
                    (`demo/pom.xml`)
                - In the right panel menu, click maven projects
                - Drag and drop the pom.xml file into the space
                - Demo should now register as a Maven project
     
     - **Set the SDK:**
     
         - In the Maven Projects panel on the right, select the Wrench Icon (Maven Settings)
         - Go to `Build, Execute, Deployment > Build Tools > Maven > Runner`
         - In the JRE dropdown, select `1.8`
         
    _All of this is setup automatically if you open the project via the pom.xml file as done in 01_setup_ 
          
------------------------


### Add a REST endpoint

1. Add the [Rest Controller](https://www.baeldung.com/spring-controller-vs-restcontroller) annotation
    - Open `demo/src/main/java/com.setup.demo/DemoApplication.java` 
    - Above `@SpringBootApplication`, add the annotation `@RestController`
    - Import the annotation by placing your cursor in the @RestController annotation, and use [Intention Actions](https://www.jetbrains.com/help/idea/intention-actions.html): 
        - Mac OS: type `option+enter`, select `import class`
        - If using a different operating system, visit the above website and select your operating system from the dropdown located in the top right corner of the page
    
    code snippet:
    ```
    @RestController
    @SpringBootApplication
    public class DemoApplication { ...
    ```

1. Add a [Request Mapping](https://www.baeldung.com/spring-requestmapping)
    - In the DemoApplication class, before main, add a request mapping for the '/' endpoint
    - Return a string from that mapping that says 'Hello Demo App'  
    - Import using [Intention Actions](https://www.jetbrains.com/help/idea/intention-actions.html) 
       
    code snippet:   
    ```
    public class DemoApplication {
    
        @RequestMapping("/")
        String home() {
            return "Hello Demo App";
        }
    
        public static void main(String[] args) { ...
    ```

_Learning Objective Check Point: Create a REST endpoint in a Spring application_

_Learning Objective Stretch: Describe IntelliJ Intention Actions_\
_Learning Objective Stretch: Distinguish between the Rest Controller annotation and the Request Mapping annotation_

### Run the application

1. Run Demo Application
    - There are many ways to run the application
        - In the DemoApplication.java file
            - click the play icon in the gutter, select `Run DemoApplication`
            - right click the DemoApplication class, select `Run DemoApplication`
            - ctrl+shift+r  
        - In the project directory panel
            - right click DemoApplication, select `Run DemoApplication`

2. View endpoint in the Browser
    
    The application should be running on port: [8080](http://localhost:8080/), the logs will show `Tomcat started on port(s): 8080 (http) with context path ''`
    - Visit localhost:8080
    - You should see `Hello Demo App` in the browser
    - _To stop running the app, click the red square `Stop DemoApplication` in the run dashboard_
    
_Learning Objective Check Point: Name one way to start a Spring application from IntelliJ_    
 
## Additional Resources
- [Spring Docs: Developing Your First Spring Boot Application](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-first-application.html)
- [Spring Guides: Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/)
- [Learn Spring Boot (Baeldung)](https://www.baeldung.com/spring-boot)
- [REST with Spring Tutorial (Baeldung)](https://www.baeldung.com/rest-with-spring-series/)

