package com.nestdigital.xyzbackendnew.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @PostMapping("/studententry")
    public String Studententry(){
        return "Test";
    }
}
