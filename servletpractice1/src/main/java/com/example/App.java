package com.example;

import org.apache.catalina.startup.Tomcat;
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        // Iniciar
        tomcat.start();
        tomcat.getServer().await();
    }
}
