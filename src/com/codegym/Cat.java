package com.codegym;

public class Cat extends Animal{
    private String name;

    @Override
    void eat() {
        System.out.println("Mèo ăn cá");
    }

    public void meow(){
        System.out.println("meow");
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
