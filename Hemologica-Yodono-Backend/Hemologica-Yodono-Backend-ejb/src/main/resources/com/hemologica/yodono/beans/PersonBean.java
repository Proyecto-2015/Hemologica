package com.hemologica.yodono.beans;

import com.hemologica.yodono.beans.impl.PersonBeanLocal;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class PersonBean
 */
@Stateless
@LocalBean
public class PersonBean implements PersonBeanLocal {

    /**
     * Default constructor. 
     */
    public PersonBean() {
        // TODO Auto-generated constructor stub
    }

}
