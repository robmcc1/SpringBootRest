/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccurdy.robert.model;

/**
 *
 * @author robert.mccurdy
 */
public class Endpoints {

    private final String greeting;
    private final String visitor;
    private final String owner;


    public Endpoints(String greeting, String visitor) {
        this.greeting = greeting;
        this.visitor = visitor;
        this.owner ="robert.mccurdy@fairwarning.com";
    }

    public String getGreeting() {
        return greeting;
    }
    public String getVisitor() {
        return visitor;
    }
    public String getOwner() {
        return owner;
    }

}