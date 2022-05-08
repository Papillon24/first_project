package com.company;

import java.util.Scanner;

public class TaskCh10N41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    private static int factorial(int s) {
        if (s==1)
            return 1;
        return s * factorial(s-1);

    }
}
