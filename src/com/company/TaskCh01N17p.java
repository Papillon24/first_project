package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class TaskCh01N17p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a равно:");
        int a = sc.nextInt();
        System.out.println("b равно:");
        int b = sc.nextInt();
        System.out.println("c равно:");
        int c = sc.nextInt();
        System.out.println("x равно:");
        int x = sc.nextInt();
        System.out.println("Выражение равно:"+ 1/sqrt(a*pow(x, 2)+b*x+c));
    }
}
