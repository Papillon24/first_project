package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.*;

public class TaskCh01N17r {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x равно:");
        int x = sc.nextInt();
        System.out.println("Выражение равно:"+ (sqrt(x+1)+sqrt(x-1))/2*sqrt(x));

    }
}
