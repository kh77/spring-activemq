package com.sm.model;

import lombok.Data;

import java.io.Serializable;

public class Employee implements Serializable {
    private Long id;
    private String name;

    public Employee(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
