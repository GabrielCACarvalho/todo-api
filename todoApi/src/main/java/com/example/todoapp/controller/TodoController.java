package com.example.todoapp.controller;

import com.example.todoapp.jpa.model.Todo;
import com.example.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@Transactional
public class TodoController {

    @Autowired
    private TodoRepository repository;

    @ResponseBody
    @GetMapping("/todos")
    public List<Todo> listTodos(){
        return repository.findAll();
    }

    @ResponseBody
    @PostMapping("/todos/save")
    public Todo salvar(@RequestBody Todo todo){
        return repository.save(todo);
    }
}
