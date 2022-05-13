package com.company;


public class TaskCh10N46a {
    public static void main(String[] args) {
        System.out.println(progression(2, 3, 10));
    }
    private static int progression (int b1, int q, int n){
        if (n == 1)
            return b1;
        return progression(b1*q,q,n-1);
    }
    }

