package com.company.ClassworkLesson4.phone;

public class Smartphone extends CellPhone {

    private String os;

    public Smartphone(String os, int year, int hours) {
        super(year, hours);
        this.os = os;
    }

    public void install(String app) {
        System.out.println("Устанавить приложение " + app);
        unpack();
        removeFiles();
    }

    private void unpack() {

    }

    private void removeFiles() {

    }
}
