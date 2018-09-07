/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccurdy.robert.model;

import java.util.HashSet;

/**
 * Keeps track of visitors exposed at /visitors
 * @author robert.mccurdy
 * 
 */
public class VisitInfo {
    private long visits;
    private HashSet<String> visitorFirstNames;
    private HashSet<String> visitorLastNames;
    
    
    public VisitInfo(HashSet<Visitor> visitors) {
        this.visitorLastNames = new HashSet<>();
        this.visitorFirstNames = new HashSet<>();

        for (Visitor visitor : visitors) {
            this.visitorFirstNames.add(visitor.getFirstName());
            this.visitorLastNames.add(visitor.getLastName());
            this.visits = visitor.getVisitCount();
        }    
    }

    public void setVisits(long visits) {
        this.visits = visits;
    }

    public void setVisitorFirstNames(HashSet<String> visitorFirstNames) {
        this.visitorFirstNames = visitorFirstNames;
    }

    public void setVisitorLastNames(HashSet<String> visitorLastNames) {
        this.visitorLastNames = visitorLastNames;
    }

    public long getVisits() {
        return visits;
    }

    public HashSet<String> getVisitorFirstNames() {
        return visitorFirstNames;
    }

    public HashSet<String> getVisitorLastNames() {
        return visitorLastNames;
    }

}
