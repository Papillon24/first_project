package com.company;

import java.util.Scanner;

public class TaskCh04N36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("t равно: ");
        double t = sc.nextDouble();
        t%=5;
        if (t>=0 && t<=3)
            System.out.println("Зеленый");
        else if (t>3 && t<=5)
            System.out.println("Красный");

    }
}
// 3 5 8 10         0 1 2 >3 - зел 3 4 >5 - красный
// 13 15 18 20