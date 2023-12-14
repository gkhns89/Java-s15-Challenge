package com.angel.library.interfaces;

import com.angel.library.model.Person;

public interface PersonControl {

    default String whoYouAre(Person person) {

        return person.getClass().getName();

        //TODO: tobe review!

    }

}
