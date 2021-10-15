package sef.FinalActivity;

import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Series till n terms:");
        System.out.print("Enter n : ");
        int n = sc.nextInt(), firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

}
