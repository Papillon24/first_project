package com.company;

public class TaskCh12N023c {
    public static void main(String[] args) {
        final int N = 7;
        int c[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                if (j>=i && j<=N-1-i) c[i][j] = 1;
                    else if (j<=i && j>=N-1-i) c[i][j] = 1;
                else c[i][j] = 0;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}
