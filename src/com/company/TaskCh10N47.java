package com.company;

import java.util.Scanner;

public class TaskCh10N47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите k-ый член последовательности Фибоначчи");
        int scan = sc.nextInt();
        System.out.println(fab(scan));
    }
    private static int fab(int f){
        if (f==1) return 1;
        if (f==2) return 1;
        return fab (f-1)+fab(f-2);
    }
}
