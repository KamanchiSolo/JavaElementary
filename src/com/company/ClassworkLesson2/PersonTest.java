package com.company.ClassworkLesson2;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person();

        System.out.println(person.name);
        System.out.println(person.age);

        Person person1 = new Person("With name");
        System.out.println(person1.name);
        System.out.println(person1.age);

        Person person2 = new Person(12);
        System.out.println(person2.name);
        System.out.println(person2.age);

        Person person3 = new Person("With name", 12);
        System.out.println(person3.name);
        System.out.println(person3.age);

        String someName = "Some name";
        int someAge = 12;
        Person person4 = new Person(someName,someAge);
        System.out.println(person4.name);
        System.out.println(person4.age);

    }
}
