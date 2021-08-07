package com.sreejith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/name/{name}")
    public ResponseEntity<String> hello(@PathVariable("name") String input)
    {
        return ResponseEntity.status(HttpStatus.OK).body("Hello - "+myService.makeUpper(input));
    }
}
