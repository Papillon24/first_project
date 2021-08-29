package com.company;

import java.util.Scanner;

public class TaskCh09N107 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int a = word.indexOf('a');
        int o = word.lastIndexOf('o');
        if (a>=0 && o>=0) {
        String word2 = word.replaceFirst(String.valueOf(word.charAt(word.indexOf('a'))), "o");
        int find = word2.lastIndexOf('o');
        String sub = word2.substring(find, word.length());
            String word3 = sub.replaceFirst(String.valueOf(sub.charAt(sub.lastIndexOf('o'))), "a");
            String sub2 = word2.substring(0, find);
            System.out.println(sub2+word3);
        }   
        else {
            System.out.println("В слове нет букв 'a' и 'o'");
        }
    }

}