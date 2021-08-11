package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class TaskCh01N17o {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println(sqrt(1 - pow(sin(x), 2)));
    }
}
