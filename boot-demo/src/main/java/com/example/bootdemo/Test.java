package com.example.bootdemo;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class Test {
    public int div(int i,int j){
        System.out.println("运行的结果："+i/j);
        return  i/j;
    }
}
