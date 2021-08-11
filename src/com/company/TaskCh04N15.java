package com.company;

import java.util.Scanner;

public class TaskCh04N15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой сегодня месяц?");
        int tdm = sc.nextInt();
        System.out.println("Какой сегодня год?");
        int tdy = sc.nextInt();
        System.out.println("В каком месяце день рождения?");
        int bdm = sc.nextInt();
        System.out.println("В каком году вы родились?");
        int bdy = sc.nextInt();
        int a;
        if (tdm>=bdm) a=1;
        else a=0;
        int out = tdy-bdy-1+a;
        System.out.println("Ваш возраст "+out);
    }
}
