package com.example;

public class Alien {
    private String name;
    private int age;

    public void code() {
        System.out.println("Coding...");
    }

    public Alien(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
