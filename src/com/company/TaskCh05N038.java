package com.company;

public class TaskCh05N038 {
    public static void main(String[] args) {
        int n;
        double sum=0, d=0;
        for (n = 1; n <= 100; n++) {
            if (n%2==0) {
                sum = sum - (1.0/n);
                d = d + (1.0/n);
            }
            else {
                sum = sum + (1.0/n);
                d = d + (1.0/n);
            }
        }
        System.out.println("Расстояние от дома после 100-го этапа равно " + sum);
        System.out.println("Общий путь при этом равен " + d);
    }
}
