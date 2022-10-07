package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        Human myMan = new Man("Petr", 18, 3, "Nigger", 111);
        Human myWoman = new Woman("Adela", 12, 2, "Normal", 222);
        myMan.greetings();
        myWoman.greetings();
        myMan.cook();
        */
        Animal myCat = new Cat("Micka", 2, 4, "Cat");
        Animal myDog = new Dog("Ben", 5, 3, "Dog");
        myCat.sound();
        myDog.sound();
        myCat.walk();
        myDog.walk();
    }
}
