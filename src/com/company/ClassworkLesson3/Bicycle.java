package com.company.ClassworkLesson3;

public class Bicycle {

    private int height;
    private String model;

    public void ride() {
        System.out.println("ride");
    }

    public class Steeringwheel {

        public void left() {
            System.out.println("left");
        }

        public void right() {
            System.out.println("right");
        }
    }

    public class Seat {

        public void up() {
            height++;
            System.out.println("bicycle height " + height);
            System.out.println("up");
        }

        public void down() {
            height--;
            System.out.println("bicycle height " + height);
            System.out.println("down");
        }
    }

}
