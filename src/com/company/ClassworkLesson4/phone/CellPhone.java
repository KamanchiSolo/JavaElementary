package com.company.ClassworkLesson4.phone;

public class CellPhone extends WirelessPhone {

    public CellPhone(int year, int hours) {
        super(year, hours);
    }

    @Override
    public void call(int number) {
        System.out.println("Набрать номер " + number);
    }

    @Override
    public void ring(int number) {
        System.out.println("Звонит телефон, с номером " + number);

    }
}
