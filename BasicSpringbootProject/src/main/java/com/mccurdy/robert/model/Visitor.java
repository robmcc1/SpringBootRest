/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccurdy.robert.model;

import static com.mccurdy.robert.RestServiceApplication.visitors;
import java.util.List;

/**
 * Data model for a visitor
 * @author robert.mccurdy
 */
public class Visitor {

    private int id;
    private String firstName;
    private String lastName;
    private long visitCount;


    public Visitor(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
        this.visitCount = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(long visitCount) {
        this.visitCount = visitCount;
    }
    public void incrementVisitCount(Visitor v) {
        v.visitCount += 1;
    }

    public void addVisitor(Visitor visitor) {
       visitors.add(visitor);
    }

    public void displayVisitor(Visitor v) {
        System.out.println(v.firstName);
        System.out.println(v.lastName);
        System.out.println(v.visitCount);
    }

    public void displayVisitors(List<Visitor> visitors) {
        for (Visitor visitor : visitors) {
           displayVisitor(visitor);
        }
    }

}

