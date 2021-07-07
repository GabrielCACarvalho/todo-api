package com.example.todoapp.repository;

import com.example.todoapp.jpa.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
