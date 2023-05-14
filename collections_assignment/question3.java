package collections_assignment;

import java.util.*;

class Employee {
    int empId;
    String name, department;
    double salary;

    public Employee(int empId, String name, double salary, String department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmpId : ").append(empId);
        sb.append(",  Name : ").append(name);
        sb.append(",  Department : ").append(department);
        sb.append(",  Salary : ").append(salary);

        return sb.toString();
    }
}

public class question3 {
    public static void main(String[] args) {

        // TreeSet is sorted by ID
        TreeSet<Employee> set = new TreeSet<Employee>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.empId == o2.empId) {
                    return 0;
                }
                if (o1.empId > o2.empId) {
                    return 1;
                }
                return -1;
            }
        });

        set.add(new Employee(105, "Ram", 750000, "Finance"));
        set.add(new Employee(104, "Shyam", 1000000, "Human Resource"));
        set.add(new Employee(103, "Alan", 1500000, "Engineering"));
        set.add(new Employee(102, "Max", 750000, "Sales"));
        set.add(new Employee(107, "Jane", 1500000, "Engineering"));
        set.add(new Employee(106, "Emma", 1200000, "Engineering"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Select any one option to display Employee data");
        System.out.println("a) ID");
        System.out.println("b) Name");
        System.out.println("c) Department");
        System.out.println("d) Salary");
        System.out.print("Choice : ");

        String choice = sc.nextLine();

        ArrayList<Employee> list = new ArrayList<Employee>(set);

        switch (choice) {
            case "a": {
                for (Employee e : set) {
                    System.out.println(e.toString());
                }
                break;
            }

            case "b": {
                list.sort(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.name.compareTo(o2.name);
                    }
                });

                for (Employee e : list) {
                    System.out.println(e.toString());
                }
                break;
            }

            case "c": {
                list.sort(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.department.compareTo(o2.department);
                    }
                });

                for (Employee e : list) {
                    System.out.println(e.toString());
                }
                break;
            }

            case "d": {
                list.sort(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        if (o1.salary > o2.salary) {
                            return 1;
                        }
                        if (o1.salary == o2.salary) {
                            return 0;
                        }
                        return -1;
                    }
                });

                for (Employee e : list) {
                    System.out.println(e.toString());
                }
                break;

            }

            default: {
                System.out.println("Invalid Choice");
            }
        }

    }
}
