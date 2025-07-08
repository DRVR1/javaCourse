package com.example.springbootproject;

import org.springframework.stereotype.Component;

@Component
public class DesktopComputer implements Computer {
    public void compile() {
        System.out.println("Compiling as a desktop computer");
    }

}
