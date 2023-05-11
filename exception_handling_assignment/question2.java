package exception_handling_assignment;

import java.util.Scanner;

public class question2 {

    public static void divide(int num1, int num2) throws UnsupportedOperationException {
        try {
            int res = num1 / num2;
            System.out.println("Result : " + res);
        } catch (ArithmeticException e) {
            throw new UnsupportedOperationException("ArithmeticException occurred");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {
            divide(num1, num2);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

    }
}
