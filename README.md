# RestLi API with simple servlet authentication

NOTE : I have not used DB yet and all the data is being fetched from a static Map

     : Hard coded username : mukeshSir
     : Hard coded password : admin



**Build info**

STEP 1 : clone project in a folder and open the folder in IDE

STEP 2 : Navigate to --> /rest-li/employee-app/

run command : "gradle build" on terminal

STEP 3 : Navigate to --> /rest-li/employee-app/server/

run command : "gradle build" on terminal

STEP 4 : open --> /rest-li/employee-app/server/build.gradle

run gradle task : startNettyServer - To start application on Netty(No login implemented)

OR

run gradle task : startJettyServer - To start application on Jetty(login Implemented )





**URL Mapping (For jetty Server)**

GET -> /api/employees -> Get all employee data

GET -> /api/employees/{id} -> Get employee data with specific id 

POST -> /api/employees -> Add new Employee

PUT -> /api/employees -> Update Employee

DELETE ->/api/employees/{id} -> Delete Employee data with specific id


**URL Mapping (For netty Server)**

GET -> /employees 

GET -> /employees/{id} 

POST -> /employees 

PUT -> /employees 

DELETE ->/employees/{id} 


