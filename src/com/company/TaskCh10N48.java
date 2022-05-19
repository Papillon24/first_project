package com.company;

import java.util.Scanner;

public class TaskCh10N48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int index = 0;
        double arr[] = new double[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextDouble();
        }
        System.out.println("The maximum element of the array = " + maxArrElemCalc(arr, index));
        System.out.println("Index:" + indexElemCalc(arr, index, maxArrElemCalc(arr,index)));
    }

    private static double maxArrElemCalc(double[] arr, int index) {
        if (index < arr.length) {
            double next = maxArrElemCalc(arr, index + 1);
            if (arr[index] > next) {
//                System.out.println("Индекс : " + indexElemCalc(arr, index, arr[index]));
                return arr[index];
            } else
//                System.out.println("Индекс равен: " + indexElemCalc(arr, index, next));
                return next;
        }
        return arr[index - 1];
    }

    private static int indexElemCalc(double[] arr, int index, double val) {
        if (index < arr.length) {
            int next = indexElemCalc(arr, index + 1, val);
            if (arr[index] == val) {
                return index;
            } else
                return next;
        }
        return index - 1;
    }
}