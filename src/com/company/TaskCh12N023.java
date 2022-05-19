package com.company;

public class TaskCh12N023 {
    public static void main(String[] args) {
        final int N = 7;
        int a[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                if (i == j) a[i][j] = 1;
            else if (i == a.length-1-j) a[i][j]=1;
                else a[i][j] = 0;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(a[i][j] + " ");

            System.out.println();
        }
    }
}
//    public static void main(String[] args) {
//       int[][] matrix = new int[7][7];
//       int x=0;
//        for (int i = 0; i < matrix.length; i++) {
//            x++;
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j]=x++;
//                if (x> matrix.length) x=1;
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
