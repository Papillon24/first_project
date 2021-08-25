package com.company;

import java.util.Scanner;

public class TaskCh09N022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int beginIndex = 0;
        int endIndex = (a.length()+1)/2;
        System.out.println(a.substring(beginIndex, endIndex));
    }
}
