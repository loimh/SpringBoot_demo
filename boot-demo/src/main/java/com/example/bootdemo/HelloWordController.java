package com.example.bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
@Autowired Test test;
    @RequestMapping("/")
    public String index() {
        test.div(4,1);
        return "李婉萌,我爱你!";
    }
}
