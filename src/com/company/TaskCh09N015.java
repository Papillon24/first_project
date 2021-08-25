package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TaskCh09N015 {
    public static void main(String[] args) {
        String a = "Hello, World!";
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индекс");
        int b = sc.nextInt();
        System.out.println("Символ с индексом "+b+" "+a.charAt(b));
    }
}
