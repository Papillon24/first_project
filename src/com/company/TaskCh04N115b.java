package com.company;

import java.util.Scanner;

public class TaskCh04N115b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        int n = sc.nextInt();
        int colour;
            n = (n+1 - 1984%60)%12;
            colour = n%10;
            switch (n) {
                case 1:
                    System.out.print("Крыса, ");
                    break;
                case 2:
                    System.out.print("Корова, ");
                    break;
                case 3:
                    System.out.print("Тигр, ");
                    break;
                case 4:
                    System.out.print("Заяц, ");
                    break;
                case 5:
                    System.out.print("Дракон, ");
                    break;
                case 6:
                    System.out.print("Змея, ");
                    break;
                case 7:
                    System.out.print("Лошадь, ");
                    break;
                case 8:
                    System.out.print("Овца, ");
                    break;
                case 9:
                    System.out.print("Обезьяна, ");
                    break;
                case 10:
                    System.out.print("Петух, ");
                    break;
                case 11:
                    System.out.print("Собака, ");
                    break;
                case 12:
                    System.out.print("Свинья, ");
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
