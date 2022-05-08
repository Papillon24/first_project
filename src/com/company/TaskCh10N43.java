package com.company;

public class TaskCh10N43 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    private static int sum(int n){
        if (n==1)
            return 1;
        return n+sum(n-1);

    }
}
