package com.company;

import java.util.Scanner;

public class TaskCh02N13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x%10;
        int b = x%100/10;
        int c = x/100;
        if (x>100 && x<200){
            System.out.println(100*a+10*b+c);}
        else {
            System.out.println ("Введен неверный диапазон");
        }
    }
}