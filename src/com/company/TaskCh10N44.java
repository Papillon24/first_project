package com.company;

import java.util.Scanner;

public class TaskCh10N44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int c = sc.nextInt();
        System.out.println(sqrt(c));
    }
    private static int sqrt (int s){
        int sum = 0;
        while (s>0){
            sum += s%10;
            s=s/10;
        }
        if (sum>=10)
            sum=sqrt(sum);
            return sum;

    }
}
