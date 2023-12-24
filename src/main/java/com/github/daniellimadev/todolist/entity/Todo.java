package com.github.daniellimadev.todolist.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todos")
@Data
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    private boolean accomplished;

    private int priority;

    public Todo() {

    }

    public Todo(Long id, @NotBlank String name, @NotBlank String description, boolean accomplished, int priority) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.accomplished = accomplished;
        this.priority = priority;
    }


    public Todo(String name, String description, boolean accomplished, int priority) {
        this.name = name;
        this.description = description;
        this.accomplished = accomplished;
        this.priority = priority;
    }

}
