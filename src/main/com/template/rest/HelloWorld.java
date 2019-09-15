package com.template.rest;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping(value = "/message", produces = "application/json")
    public @ResponseBody ResponseEntity message(){
        JSONObject json = new JSONObject();
        json.put("message","Hello World");
        return ResponseEntity.status(HttpStatus.OK).body(json.toString());
    }
}
