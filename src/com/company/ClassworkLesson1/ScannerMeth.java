package com.company.ClassworkLesson1;

import java.util.Scanner;

public class ScannerMeth {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean stop = false;
        String input = scanner.next();

        if (input.equals("stop")) {
            stop = true;
        }
        while (!stop) {
            sum += Integer.parseInt(input);

            input = scanner.next();

            if (input.equals("stop")) {
                System.out.println(sum);
                break;
            }
        }

    }
}
