package org.application.manager.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class TestEJB {

    public String helloWorld() {
        return "hello world";
    }
}