package com.company;

public class TaskCh12N023b {
    public static void main(String[] args) {
        final int N = 7;
        int b[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                if (i == j) b[i][j] = 1;
                else if (i == b.length-1-j) b[i][j]=1;
                else b[i][j] = 0;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                b[i][3] = 1;
            b[3][i] = 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(b[i][j] + " ");

            System.out.println();
        }
    }
}
