package javaLoopPart1;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reversed=0;

        while(n>0){
            reversed = reversed*10 + n%10;
            n=n/10;
        }

        System.out.println(reversed);
    }
}
