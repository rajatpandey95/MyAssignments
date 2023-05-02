package basic_data_structure_assignment;

import java.util.Scanner;

class Student {
    private int subjectA, subjectB, subjectC;

    public Student() {
    }

    public Student(int subjectA, int subjectB, int subjectC) {
        this.subjectA = subjectA;
        this.subjectB = subjectB;
        this.subjectC = subjectC;
    }

    public int studentsTotalMarksInAllSubjects(Student[] students) {
        int sum = 0;
        for (Student stu : students) {
            sum += stu.subjectA;
            sum += stu.subjectB;
            sum += stu.subjectC;
        }
        return sum;
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
        int totalMarks = studentsTotalMarksInAllSubjects(students);
        return totalMarks / 3.0;
    }

    public int[] subjectWiseMarks(Student[] students, String subjectName) {
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            if (subjectName.equals("subjectA")) {
                arr[i] = students[i].subjectA;
            } else if (subjectName.equals("subjectB")) {
                arr[i] = students[i].subjectB;
            } else if (subjectName.equals("subjectC")) {
                arr[i] = students[i].subjectC;
            }
        }

        return arr;
    }

    public int subjectATotalByStudents(int[] marks) {
        return subjectTotalByStudents(marks);
    }

    public int subjectBTotalByStudents(int[] marks) {
        return subjectTotalByStudents(marks);
    }

    public int subjectCTotalByStudents(int[] marks) {
        return subjectTotalByStudents(marks);
    }

    public int subjectTotalByStudents(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public double subjectAAverageByStudents(int[] marks) {
        return subjectATotalByStudents(marks) / 3.0;
    }

    public double subjectBAverageByStudents(int[] marks) {
        return subjectBTotalByStudents(marks) / 3.0;
    }

    public double subjectCAverageByStudents(int[] marks) {
        return subjectCTotalByStudents(marks) / 3.0;
    }

}

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student obj = new Student();

        System.out.println("marks of Student 1 in subjects A,B,C");
        int marksA1 = sc.nextInt();
        int marksA2 = sc.nextInt();
        int marksA3 = sc.nextInt();
        Student stu1 = new Student(marksA1, marksA2, marksA3);

        System.out.println("marks of Student 2 in subjects A,B,C");
        int marksB1 = sc.nextInt();
        int marksB2 = sc.nextInt();
        int marksB3 = sc.nextInt();
        Student stu2 = new Student(marksB1, marksB2, marksB3);

        System.out.println("marks of Student 3 in subjects A,B,C");
        int marksC1 = sc.nextInt();
        int marksC2 = sc.nextInt();
        int marksC3 = sc.nextInt();
        Student stu3 = new Student(marksC1, marksC2, marksC3);

        Student[] stuArray = { stu1, stu2, stu3 };

        System.out.println(obj.studentsTotalMarksInAllSubjects(stuArray));
        System.out.println(obj.studentsAverageMarksInAllSubjects(stuArray));

        int[] totalMarksInA = obj.subjectWiseMarks(stuArray, "subjectA");
        int[] totalMarksInB = obj.subjectWiseMarks(stuArray, "subjectB");
        int[] totalMarksInC = obj.subjectWiseMarks(stuArray, "subjectC");

        System.out.println(obj.subjectATotalByStudents(totalMarksInA));
        System.out.println(obj.subjectAAverageByStudents(totalMarksInA));

        System.out.println(obj.subjectBTotalByStudents(totalMarksInB));
        System.out.println(obj.subjectBAverageByStudents(totalMarksInB));

        System.out.println(obj.subjectCTotalByStudents(totalMarksInC));
        System.out.println(obj.subjectCAverageByStudents(totalMarksInC));

    }
}
