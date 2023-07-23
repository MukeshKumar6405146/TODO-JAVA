package com.geekster.TodoApp.repository;

import com.geekster.TodoApp.entity.Todo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TodoRepo {

    private List<Todo> myTodos;
    public List<Todo> getMyTodos() {
        return myTodos;
    }



    public TodoRepo() {
        myTodos = new ArrayList<>();
    }

    public void add (Todo todo){
        myTodos.add(todo);
    }

    public void delete(Todo todo){
        myTodos.remove(todo);
    }
}
