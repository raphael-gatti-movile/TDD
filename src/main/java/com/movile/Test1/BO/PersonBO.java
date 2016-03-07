package com.movile.Test1.BO;

import com.movile.Test1.WS.PersonWS;
import com.movile.Test1.bean.Person;

/**
 * Created by raphael on 3/7/16.
 */
public class PersonBO {

    private PersonWS personWS;

    public PersonBO() {
        personWS = new PersonWS();
    }

    public Person findById(int id) {

        return personWS.findById(id);

    }

}
