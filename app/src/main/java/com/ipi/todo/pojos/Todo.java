package com.ipi.todo.pojos;

import java.io.Serializable;

public class Todo implements Serializable {

    private int id;
    private String name;
    private String urgency;

    //constructeurs
    public Todo() {
    }

    public Todo(String name, String urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    //getters setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }
}




