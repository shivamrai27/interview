package pwDSA;

import java.util.Scanner;

public class TransposeMatrix {
    static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

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


        Scanner sc = new Scanner(System.in);
        int r, c;
        

        System.out.println("Enter the number of rows");
        r = sc.nextInt();
        System.out.println("Enter the number of columns");
        c = sc.nextInt();
        int[][] arr1 = new int[r][c];

        System.out.println("Enter the matrix elements");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Transpose of matrix is :");
        transpose(arr1, r, c);
    }
}
