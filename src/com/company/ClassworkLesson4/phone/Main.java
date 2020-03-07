package com.company.ClassworkLesson4.phone;

public class Main {

    public static void main(String[] args) {

        AbstractPhone thomasEdisonPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone smartphone = new Smartphone("ios", 2000, 12);

        User user = new User("Piterbilt");

        user.callAnotherUser(102,thomasEdisonPhone);
        user.callAnotherUser(103,phone);
        user.callAnotherUser(101,smartphone);

    }
}
