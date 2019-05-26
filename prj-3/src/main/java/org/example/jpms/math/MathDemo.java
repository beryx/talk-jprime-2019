package org.example.jpms.math;

import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = new Scanner(System.in).nextInt();
        System.out.printf("%d is%s prime\n", n, MathLib.isPrime(n) ? "" : " NOT");
    }
}
