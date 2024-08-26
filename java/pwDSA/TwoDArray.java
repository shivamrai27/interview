package pwDSA;

import java.util.Scanner;

public class TwoDArray {
    static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    static void sum(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("wrong dimension : addition not possible");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < r2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printArray(sum);

    }

    static void multiplication(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != c2) {
            System.out.println("multiplication not possible : wrong dimension");
            return;
        }

        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++) {
                    /*
                     * mul[i][j] = ith row of a * jth col of b
                     */
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        printArray(mul);
    }

    static void transpose(int[][]a, int r, int c){

        int [][]transpose = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                transpose[i][j] = a[j][i];
        }
    }
    printArray(transpose);
}
    public static void main(String[] args) {
        // int a[][]={ {1, 2, 3},
        // {4, 5, 6},
        // {7, 8, 9},
        // };

        Scanner sc = new Scanner(System.in);
        int r1, c1;
        int r2, c2;

        System.out.println("Enter the number of first array rows");
        r1 = sc.nextInt();
        System.out.println("Enter the number of first array columns");
        c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];

        // System.out.println("Enter the number of second array rows");
        // r2 = sc.nextInt();
        // System.out.println("Enter the number of second array columns");
        // c2 = sc.nextInt();

        // int[][] arr2 = new int[r2][c2];

        System.out.println("Enter the first array elements");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // System.out.println("Enter the second array elements");

        // for (int i = 0; i < r2; i++) {
        //     for (int j = 0; j < c2; j++) {
        //         arr2[i][j] = sc.nextInt();
        //     }
        // }

        // System.out.println("The sum of array 1 and 2 are :");
        // sum(arr1, r1, c1, arr2, r2, c2);
       
        // System.out.println("The multiplication of array 1 and 2 are :");
        // multiplication(arr1, r1, c1, arr2, r2, c2);

        System.out.println("The Transpose of array is :");
        transpose(arr1, r1, c1);
    }
}
