package basic_data_structure_assignment;

import java.util.Scanner;

class TaxAmount {
    public double calculateTaxAmount(int ctc) {
        if (ctc <= 1_80_000) {
            return 0;
        }
        if (ctc <= 3_00_000) {
            return ctc * 0.1;
        }
        if (ctc <= 5_00_000) {
            return ctc * 0.2;
        }
        return ctc * 0.3;
    }
}

public class question5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaxAmount obj = new TaxAmount();
        System.out.print("Enter your CTC: ");
        int ctc = sc.nextInt();

        double result = obj.calculateTaxAmount(ctc);
        System.out.println("Your tax : " + result);

    }
}
