package com.company;

import java.util.Scanner;

public class TaskCh03N26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите булево значение X");
        boolean X = sc.nextBoolean();
        System.out.println("Введите булево значение Y");
        boolean Y = sc.nextBoolean();
        System.out.println("Введите булево значение Z");
        boolean Z = sc.nextBoolean();
        boolean a = (X|Y)&(!X|!Z);
        boolean b = !(!X&Y)|(X&!Z);
        boolean c = X|!Y&!(X|!Z);
        System.out.println("(X|Y)&(!X|!Z) = "+a);
        System.out.println("!(!X&Y)|(X&!Z) = "+b);
        System.out.println("X|!Y&!(X|!Z) = "+c);
    }
}
