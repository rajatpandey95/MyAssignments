package exception_handling_assignment;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {
            int res = num1 / num2;
            System.out.println("Result : " + res);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}
