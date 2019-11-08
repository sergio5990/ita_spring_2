package com.sergio5990.ita.spring2.model;

public class Person {
    private static Person person = new Person();

    public static Person getInstance() {
        return person;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void perform() {
        System.out.println("Hello:" + name);
    }
}
