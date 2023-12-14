package com.angel.library.model;

import com.angel.library.enums.GenderType;

public class Person {

    private String id;
    private String name;
    private String surname;
    private GenderType genderType;

    public Person(String id, String name, String surname, GenderType genderType) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.genderType = genderType;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public GenderType getGenderType() {
        return genderType;
    }

}
