package assignment_1;

import java.util.ArrayList;

class ArmstrongNumBetweenRange {
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

    public int[] armstrongNumbersInRange(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num = min; num <= max; num++) {
            if (armstrongCheck(num)) {
                list.add(num);
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}

public class question2 {
    public static void main(String[] args) {
        int min = 100;
        int max = 999;

        ArmstrongNumBetweenRange obj = new ArmstrongNumBetweenRange();
        int[] result = obj.armstrongNumbersInRange(min, max);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
