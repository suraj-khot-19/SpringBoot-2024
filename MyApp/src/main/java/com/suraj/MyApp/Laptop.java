package com.suraj.MyApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {

    public void hello() {
        System.out.println("With help of laptop. I love laptop");
    }

    public void compile() {
        System.out.println("compiling a code using Laptop...");
    }
}
