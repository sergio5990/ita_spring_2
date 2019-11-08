package com.sergio5990.ita.spring2.model;

public class PersonInitDestroy {
    private final String name;

    public PersonInitDestroy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void perform() {
        System.out.println("Hello:" + name);
    }

    public void init(){
        System.out.println("я  создался");
    }

    public void destroy(){
        System.out.println("я  умер");
    }
}
