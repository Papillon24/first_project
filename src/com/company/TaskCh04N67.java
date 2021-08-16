package com.company;

import java.util.Scanner;

public class TaskCh04N67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        k%=7;
        if (k>=1 && k<=5) {
            System.out.println("Рабочий день");
        }
        else if (k==6 || k==0) {
            System.out.println("Выходной день");
        }
    }
}
