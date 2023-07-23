package com.geekster.TodoApp.service;

import com.geekster.TodoApp.entity.Todo;
import com.geekster.TodoApp.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

   @Autowired
    TodoRepo todoRepo;
    public List<Todo> getAllTodos(){
        return todoRepo.getMyTodos();
    }

    public List<Todo> getDoneTodos(){
        List<Todo> doneTodos = new ArrayList<>();
        for(Todo myTodo: todoRepo.getMyTodos()){
            if(myTodo.isTodoDoneStatus()){
                doneTodos.add(myTodo);
            }
        }

        return doneTodos;
    }

    public List<Todo> getNotDoneTodos(){
        List<Todo> unDoneTodos = new ArrayList<>();
        for(Todo myTodo: todoRepo.getMyTodos()){
            if(!myTodo.isTodoDoneStatus()){
                unDoneTodos.add(myTodo);
            }
        }

        return unDoneTodos;
    }

    public String addTodo(Todo todo){
        todoRepo.add(todo);
        return "Todo added";
    }

    public String markTodo(Integer todoId, boolean status){
        for(Todo myTodo : todoRepo.getMyTodos()){
            if(myTodo.getTodoId().equals(todoId)){
                myTodo.setTodoDoneStatus(status);
                return "todo updated for todo ID::" + todoId;
            }
        }
        return "todo not found for todo ID::" + todoId;
    }

    public String removeTodo(Integer todoId){
        for(Todo myTodo : todoRepo.getMyTodos()){
            if(myTodo.getTodoId().equals(todoId)){
                todoRepo.delete(myTodo);
                return "todo removed for todo id::" +todoId;
            }
        }
        return "todo is not deleted  for todo id::" +todoId;
    }
}
