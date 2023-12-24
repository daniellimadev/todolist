package com.github.daniellimadev.todolist;

import com.github.daniellimadev.todolist.entity.Todo;

import java.util.ArrayList;
import java.util.List;

public class TestConstants {
    public static final List<Todo> TODOS = new ArrayList<>() {
        {
            add(new Todo(9995L, "@daniellimadev", "Unit Testing", false, 1));
            add(new Todo(9996L, "@daniellimadev", "Code!!", false, 1));
            add(new Todo(9997L, "@daniellimadev", "Spring Boot", false, 1));
            add(new Todo(9998L, "@daniellimadev", "JPA", false, 1));
            add(new Todo(9999L, "@daniellimadev", "Java!!", false, 1));
        }
    };

    public static final Todo TODO = TODOS.get(0);
}
