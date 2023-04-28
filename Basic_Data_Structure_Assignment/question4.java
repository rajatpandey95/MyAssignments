package basic_data_structure_assignment;

import java.util.Scanner;

class ResultDeclaration {
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        if (subject1Marks > 60 && subject2Marks > 60 && subject3Marks > 60) {
            return "Promoted";
        }
        if ((subject1Marks > 60 && subject2Marks > 60) || (subject2Marks > 60 && subject3Marks > 60)
                || (subject1Marks > 60 && subject3Marks > 60)) {
            return "Passed";
        }

        return "failed";
    }
}

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sub1Marks = sc.nextInt(), sub2Marks = sc.nextInt(), sub3Marks = sc.nextInt();

        ResultDeclaration obj = new ResultDeclaration();
        System.out.println(obj.declareResults(sub1Marks, sub2Marks, sub3Marks));

        sc.close();
    }
}
