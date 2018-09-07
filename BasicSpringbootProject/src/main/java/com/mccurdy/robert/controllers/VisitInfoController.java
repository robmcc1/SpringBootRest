/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccurdy.robert.controllers;
import static com.mccurdy.robert.RestServiceApplication.visitors;
import com.mccurdy.robert.model.VisitInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author robert.mccurdy
 */
@RestController
public class VisitInfoController {

    @RequestMapping("/visitors")
    public VisitInfo visitors(){
        return new VisitInfo(visitors);
    }

}