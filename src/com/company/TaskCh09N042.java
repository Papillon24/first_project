package com.company;

import java.util.Scanner;

public class TaskCh09N042 {
    public static void main(String[] args) {
        System.out.println("Введите слово");
        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder(sc.nextLine());
        a.reverse();
        System.out.println(a);
    }
}
