/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccurdy.robert.controllers;

import static com.mccurdy.robert.RestServiceApplication.visitors;
import com.mccurdy.robert.model.Greeting;
import com.mccurdy.robert.model.Visitor;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author robert.mccurdy
 */
@RestController
public class GreetingController {
    private final AtomicLong counter = new AtomicLong();
    private final String TEMPLATE = "Hello, %s %s!";
    
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "firstname") String firstName) {
        return new Greeting(counter.incrementAndGet(),
                String.format(TEMPLATE, firstName,""));
    }

    @RequestMapping(
            value = "/greeting",
            params = {"firstname", "lastname"},
            method = GET)
    @ResponseBody
    public Greeting greeting(@RequestParam("firstname") String firstName, 
                             @RequestParam("lastname") String lastName) {
        Visitor v = new Visitor(firstName, lastName);
        visitors.add(v);
        v.incrementVisitCount(v);
        return new Greeting(counter.get(),
                            String.format(TEMPLATE, firstName,lastName));
    }
}
