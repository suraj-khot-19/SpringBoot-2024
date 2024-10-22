package com.suraj.MyApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile(){
        System.out.println("compiling a code using Desktop...");
    }
}

