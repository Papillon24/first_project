package com.company;

import java.util.Scanner;

public class TaskCh02N43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a%b)*(b%a)+1;
        System.out.println(c);


    }
}
