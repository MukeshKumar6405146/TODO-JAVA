# TODO-JAVA
Creating TODO app using java spring boot 
Where User can create a todo list according to his or her schedule. 
User can
* create a Todo
* mark as done or not done
* delete a Todo
* Check the status of Todo

  #### our project is having following endpoints
   * createTodos 
   * getAllDoneTodos
   * getAllUndoneTodos
   * getAllTodos
   * statusOfTodo
   * deleteTdod

## Frameworks and languages used
* Spring
* java
* Hibernate-validation
* Regex for validating patterns

## Data Flow
 * Controller
       ** It is just containg Api endPoint and logic for 
           what should this api do.
* Services
      ** It has actual logic(business logic) for method. 
          It is also called Model.
       
 * Repository
        ** It is having data source

 ## Data Structure
   * Here we are using List(ArrayList) datastructure.
