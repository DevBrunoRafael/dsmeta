package com.devbrunorafael.dsmeta.controllers;

import com.devbrunorafael.dsmeta.components.emails.EmailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/{id}/notification")
public class EmailController {

    @Autowired
    private EmailsService service;

    @GetMapping
    public void sendMail(@PathVariable Long id){
        this.service.sendMail(id);
    }

}
