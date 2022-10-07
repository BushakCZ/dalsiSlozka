package com.company;

public class Cat extends Animal{
    public Cat(String name, int age, int numberOfLegs, String type) {
        super(name, age, numberOfLegs, type);
    }
    public void sound(){
        System.out.println("Meow");
    }
}
