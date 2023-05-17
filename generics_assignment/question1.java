package generics_assignment;

import java.util.HashSet;

class Employee {
    private int id;
    private String name, department;
    private double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + department);
        System.out.println("----------------------------------------------");
    }
}

public class question1 {
    public static void main(String[] args) {

        // We cannot add Object of any other type except Employee
        HashSet<Employee> employees = new HashSet<Employee>();

        employees.add(new Employee(101, "Ram", 750000, "Finance"));
        employees.add(new Employee(102, "Shyam", 1000000, "Human Resource"));
        employees.add(new Employee(103, "Aman", 1500000, "Engineering"));
        employees.add(new Employee(104, "Max", 750000, "Sales"));
        employees.add(new Employee(105, "Rocky", 750000, "Operations"));

        for (Employee e : employees) {
            e.displayDetails();
        }

        // as we try to add object of class question1 it will give error
        // as it expect a Employee class object to be inserted in employees hashSet

        // employees.add(new question1());

    }
}
