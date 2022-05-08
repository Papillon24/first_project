package com.company;

public class TaskCh10N43b {
    public static void main(String[] args) {
        System.out.println(num(123456789,0));
    }
    private static int num(int n, int a){
        if ((n%10) <1)
            return a;
        return num(n/10, a+1);
    }
}

