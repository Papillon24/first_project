package com.company;

import java.util.Scanner;

public class TaskCh04N33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        if ((a%2)==0) {
            System.out.println(a+" - Четное число");
        }
        else {
            System.out.println(a+" - Нечетное число");
        }
    }
}
