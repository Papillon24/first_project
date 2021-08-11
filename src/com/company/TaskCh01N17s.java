package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class TaskCh01N17s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x =");
        int x = sc.nextInt();
        System.out.println("Выражение равно:"+ (abs(x)+abs(x+1)));
    }
}
