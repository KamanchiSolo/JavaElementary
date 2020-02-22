package com.company.ClassworkLesson2;

public class DogTest {

    public static void main(String[] args) {
        Dog dog = new Dog("black", "mastiff", 14,50);
        System.out.println(dog.getBreed());
        System.out.println(dog.getColor());
        dog.setColor("White");
    }
}
