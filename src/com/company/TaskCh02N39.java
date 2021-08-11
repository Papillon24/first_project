package com.company;

import java.util.Scanner;

public class TaskCh02N39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько часов?");
        int h = sc.nextInt();
        System.out.println("Сколько минут?");
        int m = sc.nextInt();
        System.out.println("Сколько секунд?");
        int s = sc.nextInt();
        if (h>0 && m>=0 && s>=0 && h<=23 && m<=59 && s<=59) {
            int gr = 30 * h + m * 30 / 60 + s * 30 / 3600;
            System.out.println("Между начальным положением часовой стрелки и заданным " + gr + " градусов");
        }
        else {
            System.out.println("Задано неверное значениие");
        }
    }
}
