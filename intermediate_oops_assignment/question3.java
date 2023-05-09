package intermediate_oops_assignment;

import java.util.ArrayList;

class CurrentAccount extends question3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;

    @Override
    public int getCash() {
        return totalDeposits + creditLimit;
    }
}

class SavingsAccount extends question3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;

    @Override
    public int getCash() {
        return totalDeposits + fixedDepositAmount;
    }
}

public class question3 {
    public int totalCashInBank(ArrayList<Integer> cash) {
        int totalCash = 0;
        for (int num : cash) {
            totalCash += num;
        }
        return totalCash;
    }

    public int getCash() {
        return 0;
    }

    public static void main(String[] args) {

        ArrayList<Integer> cash = new ArrayList<Integer>();

        CurrentAccount currObj = new CurrentAccount();
        cash.add(currObj.getCash());

        SavingsAccount savingsObj = new SavingsAccount();
        cash.add(savingsObj.getCash());

        question3 quesObj = new question3();
        System.out.println("Total Cash available in Bank : " + quesObj.totalCashInBank(cash));

    }
}
