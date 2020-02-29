package com.company.ClassworkLesson3.Anon;

public class DemoTest {

    private static Demo demo;
    private static DemoChild demoChild;
    private static Demo demoChild2 = new Demo() {
        @Override
        public void show() {
            super.show();
            System.out.println("Show anonymous");
        }

    };

    public static void main(String[] args) {

        Demo demo = new Demo();
        demo.show();

        System.out.println("__________");

        DemoChild demoChild = new DemoChild();
        demoChild.show();

        System.out.println("__________");

        demoChild2.show();

        final int showCount = 0;

        Demo demoChild3 = new Demo() {

            @Override
            public void show() {

                System.out.println(showCount);

                System.out.println("demoChild3");
            }
        };
        System.out.println("__________");

        demoChild3.show();
    }
}
