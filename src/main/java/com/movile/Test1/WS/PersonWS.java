package com.movile.Test1.WS;

import com.movile.Test1.bean.Person;

/**
 * Created by raphael on 3/6/16.
 */
public class PersonWS {

    public Person findById(int id) {
        return new Person(10, "Sara");
    }

    public static Person staticFindById(int id) {
        return new Person(10, "Sara");
    }

}
