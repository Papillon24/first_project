package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskCh09N166 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String[] splitText = text.split(" ");
        System.out.println(Arrays.toString(splitText));
        String start = splitText[0];
        String last = splitText[splitText.length - 1];
        splitText[splitText.length - 1] = start;
        splitText[0] = last;
        text = Arrays.stream(splitText).collect(Collectors.joining(" "));
        System.out.println(text);
    }
}
