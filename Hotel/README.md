
# Hotel

Use Rest APIs in your API service to register, update, get, and delete user information.

With Postman, switch the method to POST, and enter the following url:

http://localhost:9191/addUser


then we must add the request body and select JSON over Text because the ID is automatically produced after input; only the name, age, and number must be provided in this format.
{
 
    "name":"Abhishek",
    "age":21,
    "number":7841037521
}

Instead of adding a single user, you may add a list of users by changing the address to 
http://localhost:9191/addUsers and providing it in the following format.
[
 {
 
    "name":"Abhishek",
    "age":21,
    "number":7841037521
},
{
 
    "name":"Mahajan",
    "age":21,
    "number":7841037521
}   
]


To view all the users available in database we can directly use  url. Change Postman as a GET http://localhost:9191/users

but if you want to fetch user by Id or name go to postman and give your Id or name
http://localhost:9191/usersById/1
For name
http://localhost:9191/user/Abhishek

For delete choose method type Delete in postman
http://localhost:9191/user/1

the output will be User removed !! 1

For update the user Use method type PUT 
http://localhost:9191/update and send it the database will update  the user

{
    "id":3,
    "name":"john",
    "age":21,
    "number":212780456
}






# Database
1. In Mysql Workbench, create a schema in accordance with your preferences. I've selected the 'hotels' database, which is located at localhost:3306 
spring.datasource.url = jdbc:mysql://localhost:3306/hotels
spring.datasource.username = root

Your MySQL server password should be noted in the password field.
spring.datasource.password = Password

By default, the server will be using port 8080. It was changed to 9191
Server.port=9191

# gRPC server
Open the proto file in a terminal and type "mvn clean install" to generate the necessary sources.

Be sure to mark the generated-sources directory in the target folder as the source root after a successful compilation.
