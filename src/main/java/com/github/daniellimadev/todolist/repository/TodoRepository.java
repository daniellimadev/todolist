package com.github.daniellimadev.todolist.repository;

import com.github.daniellimadev.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
