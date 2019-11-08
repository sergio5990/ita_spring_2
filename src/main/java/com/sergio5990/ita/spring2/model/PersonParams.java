package com.sergio5990.ita.spring2.model;

public class PersonParams {
    private Long id;
    private String name;

    public PersonParams() {
    }

    public PersonParams(Long id, String name) {
        this.id = id;
        this.name = name;
    }

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

    public void perform(){
        System.out.println("id: " + id + ",name: "+ name);
    }
}
