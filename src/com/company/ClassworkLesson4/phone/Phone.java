package com.company.ClassworkLesson4.phone;

public class Phone extends AbstractPhone {

    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(int number) {
        System.out.println("Введите номер " + number);
    }

    @Override
    public void ring(int number) {
        System.out.println("Телефон звонит");
    }
}
