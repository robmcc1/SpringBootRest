/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccurdy.robert.controllers;
import com.mccurdy.robert.model.Endpoints;
import com.mccurdy.robert.RestServiceApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Displays the endpoints as objects
 * @author robert.mccurdy
 */
@RestController
public class EndpointsController {

    @RequestMapping("/")
    public Endpoints endpoints(){
        return new Endpoints("http://localhost:" + RestServiceApplication.startupPort + "/greeting?firstname=Robert&lastname=Mccurdy",
                             "http://localhost:" + RestServiceApplication.startupPort + "/visitors");
    }
}