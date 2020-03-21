package com.jys.almacen.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="home", produces="application/json")
public class HomeController {

    @GetMapping("")
    public ResponseEntity<String> index() {
        return new ResponseEntity<String>("{\"lorem\": \"ipsum\"}", HttpStatus.OK);
    }

}
