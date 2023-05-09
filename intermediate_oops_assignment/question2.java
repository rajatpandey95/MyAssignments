package intermediate_oops_assignment;

import java.util.ArrayList;

class Employee {

    public Employee() {
    }

    int salary = 10000;

    public int getSalary(int salary) {
        return salary;
    }
}

class Manager extends Employee {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary + incentive;
    }
}

class Labour extends Employee {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary + overtime;
    }
}

public class question2 {

    public int totalEmployeeSalary(ArrayList<Integer> employeeSalaries) {
        int totalSalary = 0;
        for (int salary : employeeSalaries) {
            totalSalary += salary;
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        ArrayList<Integer> employees = new ArrayList<Integer>();

        Employee empObj = new Employee();
        question2 quesObj = new question2();

        employees.add(new Manager().getSalary(empObj.salary));
        employees.add(new Labour().getSalary(empObj.salary));
        employees.add(new Manager().getSalary(empObj.salary));
        employees.add(new Labour().getSalary(empObj.salary));

        System.out.println("Total Salaries of all Employee : " + quesObj.totalEmployeeSalary(employees));
    }
}
