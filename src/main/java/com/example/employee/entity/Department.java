package com.example.employee.entity;

public class Department {
    //fields
    private Long id;
    private String name;

    //constructors
    public Department() {
    }

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    //Getter and setter
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

    //ToString
    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
