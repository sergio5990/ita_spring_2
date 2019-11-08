package com.sergio5990.ita.spring2.model;

public class PersonParamsBean {
    private PersonParams personParams;


    public PersonParamsBean(PersonParams personParams) {
        this.personParams = personParams;
    }

    public PersonParamsBean() {
    }

    public PersonParams getPersonParams() {
        return personParams;
    }

    public void setPersonParams(PersonParams personParams) {
        this.personParams = personParams;
    }

    public void perform() {
        System.out.println("personParams: id: " + personParams.getId() + ",name: " + personParams.getName());
    }
}
