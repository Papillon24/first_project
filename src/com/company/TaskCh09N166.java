package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskCh09N166 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String[] splitResult = text.split(" ");
        System.out.println(Arrays.toString(splitResult));
        String start = splitResult[0];
        String last = splitResult[splitResult.length - 1];
        splitResult[splitResult.length - 1] = splitResult[0];
        splitResult[0] = last;
        text = Arrays.stream(splitResult).collect(Collectors.joining(" "));
        System.out.println(text);
    }
}
