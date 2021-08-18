package com.company;

import java.util.Scanner;
public class TaskCh05N010 {
    public static void main(String[] args) {
        int x=0;
        System.out.println("Введите курс доллара");
        Scanner sc = new Scanner(System.in);
        double y = sc.nextDouble();
        double s;
        while (++x<=20) {
            s=y*x;
            double scale = Math.pow(10, 2);
            double result = Math.ceil(s * scale) / scale;
            System.out.println(x+"$ = "+result+"рублей");
        }
    }
}