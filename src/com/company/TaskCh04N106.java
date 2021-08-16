package com.company;

import java.util.Scanner;

public class TaskCh04N106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        switch (m) {
            case 12:
            case 1:
            case 2:
                System.out.println(m+" месяц относиться к зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(m+" месяц относиться к весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(m+" месяц относиться к лету");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(m+" месяц относиться к осени");
                break;
            default:
                System.out.println("Вымышленный месяц");
        }
    }
}
