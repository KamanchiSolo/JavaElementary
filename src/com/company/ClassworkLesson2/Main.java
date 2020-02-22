package com.company.ClassworkLesson2;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat cat1 = new Cat();

        cat.age = 3;
        cat.name = "Piterbilt";

        System.out.println(cat);
        System.out.println(cat1);

        System.out.println(cat.age);
        System.out.println(cat.name);

        cat.run();

        cat1 = cat;

        System.out.println(cat);
        System.out.println(cat1);
    }
}
