package com.movile.Test1.BO;

import com.movile.Test1.WS.CustomerWS;

/**
 * Created by raphael on 3/7/16.
 */
public class CustomerBO {

    private CustomerWS customerWS;

    public String findName(int id) {
        return customerWS.findName(id);
    }

}
