package com.company;

import java.util.Scanner;

public class TaskCh02N31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3х-значное число в диапазоне [100-999]");
        int n = sc.nextInt();
        int a = n/100;
        int b = n%100/10;
        int c = n%10;
        if (n >= 100 && n <= 999)
        System.out.println("x="+(100*a+10*c+b));
        else
        System.out.println("Введен неверный диаазон");
    }
}
// x=abc; n=acb;
