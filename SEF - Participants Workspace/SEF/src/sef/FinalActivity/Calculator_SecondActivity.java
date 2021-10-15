package sef.FinalActivity;

import java.util.Scanner;

public class Calculator_SecondActivity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selection;

        do {
            writeMenu();
            selection = sc.nextInt();
            doOperation(selection);
        } while (selection < 5);

    }

    public static void writeMenu() {
        System.out.println("****** Menu *******\n 1-Sum \n 2-Subtract \n 3-Multiply \n 4-Divide \n 5-Exit");
        System.out.print("Your Selection (Input Number) = ");
    }

    public static void doOperation(int selection) {
        Scanner scanner = new Scanner(System.in);

        // Take input from User
        int num1 = 0;
        int num2 = 0;
        switch (selection) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("1.Num = ");
                num1 = scanner.nextInt();
                System.out.print("2.Num = ");
                num2 = scanner.nextInt();
                break;

        }

        // operation part
        switch (selection) {
            case 1:
                sum(num1, num2);
                break;
            case 2:
                subtract(num1, num2);
                break;
            case 3:
                multiply(num1, num2);
                break;
            case 4:
                divide(num1, num2);
                break;
        }
    }

    public static int sum(int a, int b) {
        int result = a + b;
        System.out.println("result = " + result);
        return result;
    }

    public static int subtract(int a, int b) {
        int result = a - b;
        System.out.println("result = " + result);
        return result;
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        System.out.println("result = " + result);
        return result;
    }

    public static double divide(int a, int b) {
        double result = 0;

        result = (double) a / b;
        System.out.println("result " + result);
        return result;
    }
}
