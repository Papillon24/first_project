package com.company;

import java.util.Scanner;

public class TaskCh09N107 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int a = word.indexOf('a');
        int o = word.lastIndexOf('o');
        if (a>=0 && o>=0) {
        int find1 = word.indexOf("a");
        int find2 = word.lastIndexOf("o");
        String word2 = word.replaceFirst(String.valueOf(word.charAt(find2)), "a");
        String word3 = word2.replaceFirst(String.valueOf(word2.charAt(word2.indexOf("a"))), "o");
            System.out.println(word3);
        }
        else {
            System.out.println("В слове нет букв 'a' и 'o'");
        }
    }

}