package com.sergio5990.ita.spring2.model;

public class PersonConstr {

    private final String name;

    public PersonConstr(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void perform() {
        System.out.println("Hello:" + name);
    }
}
