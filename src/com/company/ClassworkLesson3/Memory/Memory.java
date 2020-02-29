package com.company.ClassworkLesson3.Memory;

public class Memory {
    public static void main(String[] args) {
        int i = 1;
        Object object = new Object();
        Memory memory = new Memory();
        memory.exMethod(object);
    }

    private void exMethod(Object vilka) {
        String string = "String";
        System.out.println(string);
    }
}
