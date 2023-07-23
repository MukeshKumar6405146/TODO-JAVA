package com.geekster.TodoApp.controller;

import com.geekster.TodoApp.entity.Todo;
import com.geekster.TodoApp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class TodoController {

    @Autowired
    TodoService todoService;



    public TodoController() {

    }
  @GetMapping("todos")
    public List<Todo> getAllTodos() {

        return todoService.getAllTodos();
    }
    @GetMapping("todo/done")
    public List<Todo> getDoneTodos() {
       return todoService.getDoneTodos();
    }
    @GetMapping("todo/undone")
    public List<Todo> getNotDoneTodos() {
        return todoService.getNotDoneTodos();
    }

    @PostMapping("todo")
    public String addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }
@PutMapping("todo/{todoId}/{status}")
    public String markTodo(@PathVariable Integer todoId, @PathVariable boolean status){
      return todoService.markTodo(todoId, status);

    }
@DeleteMapping("todo")
    public String removeTodo(@RequestParam Integer todoId){
       return todoService.removeTodo(todoId);
    }
}
