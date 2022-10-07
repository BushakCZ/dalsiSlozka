package com.company;

public class Woman extends Human{
    public Woman(String name, int age, int numberOfLegs, String skin, int idNumber) {
        super(name, age, numberOfLegs, skin, idNumber);
    }
    public void greetings() {
        System.out.println("Ahojky");
    }
    public void cook(){
        System.out.println("Uvarim vsechno");
    }
}
