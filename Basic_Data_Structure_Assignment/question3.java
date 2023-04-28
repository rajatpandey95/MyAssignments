package basic_data_structure_assignment;

import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount, int time, double interestRate) {
        interestRate /= 100;
        return (principalAmount * time * interestRate);
    }

    public double compoundInterest(double principalAmount, int time, double interestRate) {
        interestRate /= 100;

        double rateInterestOverTime = Math.pow(1 + interestRate, time);

        return (principalAmount * rateInterestOverTime) - principalAmount;
    }
}

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SiCi obj = new SiCi();

        System.out.println("Calculate Simple Interest");
        System.out.println("Enter principle amount");
        double principleAmount = sc.nextDouble();

        System.out.println("Enter annual interest rate");
        double interestRate = sc.nextDouble();

        System.out.println("Enter term of loan, in years");
        int time = sc.nextInt();

        System.out.println("Simple Interest is : Rs " + obj.simpleInterest(principleAmount, time, interestRate));

        System.out.printf("Compound interest is : Rs " + obj.compoundInterest(principleAmount, time, interestRate));

        sc.close();
    }
}
