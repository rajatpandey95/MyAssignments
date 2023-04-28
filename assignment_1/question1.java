package assignment_1;

import java.util.Scanner;

class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
        int len = Integer.toString(num).length();

        int temp = num, sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            temp /= 10;
            sum += Math.pow(rem, len);
        }

        return sum == num;
    }
}

public class question1 {
    public static void main(String[] args) {

        ArmstrongOrNot obj = new ArmstrongOrNot();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        boolean result = obj.armstrongCheck(number);

        if (result) {
            System.out.println(number + " is an armstrong number");
        } else {
            System.out.println(number + " is not an armstrong number");

        }

    }
}
