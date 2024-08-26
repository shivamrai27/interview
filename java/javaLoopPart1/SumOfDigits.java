package javaLoopPart1;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfDigit = 0;
        while (n>0){
            sumOfDigit+=n%10;
            n=n/10;
        }
        System.out.println(sumOfDigit);
    }
}
