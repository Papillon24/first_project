package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskCh09N017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String a = scanner.nextLine();
        if (a.charAt(0)==a.charAt(a.length()-1)) {
            System.out.println(" слово начинается и заканчивается на одну и ту же букву");
        }
        else {
            System.out.println(" слово начинается и заканчивается на разные буквы");
        }
    }
}
