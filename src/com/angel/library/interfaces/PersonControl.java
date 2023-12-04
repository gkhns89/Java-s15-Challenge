package com.angel.library.interfaces;

import com.angel.library.model.Person;

public interface PersonControl {

    default String whoYouAre(Person user) {

        return user.getClass().getName();

        //TODO: tobe review!

    }

}
