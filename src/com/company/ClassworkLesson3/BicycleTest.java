package com.company.ClassworkLesson3;

public class BicycleTest {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();

        Bicycle.Seat seat = bicycle.new Seat();

        Bicycle.Steeringwheel steeringwheel = bicycle.new Steeringwheel();

        seat.down();
        seat.up();
        seat.up();

        bicycle.ride();

        steeringwheel.left();
        steeringwheel.right();

    }

    public static class Cat {

    }
}
