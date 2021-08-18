package com.company;

import java.util.Scanner;

public class TaskCh04N115a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        int n = sc.nextInt();
        int colour;
        if (n>=1984) {
            n = (n+1 - 1984)%12;
            colour = n%10;
            switch (n) {
                case 1:
                    System.out.print("Крыса, ");
                    break;
                case 2:
                    System.out.println("Корова, ");
                    break;
                case 3:
                    System.out.println("Тигр, ");
                    break;
                case 4:
                    System.out.println("Заяц, ");
                    break;
                case 5:
                    System.out.println("Дракон, ");
                    break;
                case 6:
                    System.out.println("Змея, ");
                    break;
                case 7:
                    System.out.println("Лошадь, ");
                    break;
                case 8:
                    System.out.println("Овца, ");
                    break;
                case 9:
                    System.out.println("Обезьяна, ");
                    break;
                case 10:
                    System.out.println("Петух, ");
                    break;
                case 11:
                    System.out.println("Собака, ");
                    break;
                case 12:
                    System.out.println("Свинья, ");
                    break;
            }
            switch (colour) {
                case 1, 2:
                    System.out.println("зеленый");
                    break;
                case 3, 4:
                    System.out.println("красный");
                    break;
                case 5, 6:
                    System.out.println("желтый");
                case 7, 8:
                    System.out.println("белый");
                    break;
                case 9, 0:
                    System.out.println("черный");
                    break;
            }
        }
    }
}
