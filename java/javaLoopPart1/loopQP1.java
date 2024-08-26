package javaLoopPart1;

import java.util.Scanner;
class Q1{
// Count the number of digit for given number n
// n=3826 output: 4
// n = 4502643 output : 7
int countDigits(int n) {
    int counter = 0;
    while (n > 0) {
        n = n / 10; // Divide by 10 to remove the last digit
        counter++;
    }
    return counter;
}
}

public class loopQP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();

//        Q1 q = new Q1();
//        System.out.println("Number of digits: " + q.countDigits(n));
    }
}
