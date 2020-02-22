package com.company.ClassworkLesson2;

public class Person {

    public static int PERSON_COUNT;

    public String name;
    public int age;

    public Person() {
        name = "Default name";
        age = 1;
        PERSON_COUNT++;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
        PERSON_COUNT++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        PERSON_COUNT++;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public static void printPersonCount() {
        System.out.println(PERSON_COUNT);
    }

    @Override
    public String toString() {
        return "Person: " + this.name + "," + age;
    }
}
