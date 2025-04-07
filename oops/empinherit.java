import java.util.*;

class Employee {
    int empid;
    String name;
    double salary;
    String address;

    public Employee(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {
    String department;
    String subjects;

    public Teacher(int empid, String name, double salary, String address, String department, String subjects) {
        super(empid, name, salary, address);
        this.department = department;
        this.subjects = subjects;
    }

    void display() {
        System.out.println("Empid : " + empid);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Address : " + address);
        System.out.println("Department : " + department);
        System.out.println("Subjects : " + subjects);
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(101, "abce", 50000.0, "1234 ddaSt", "Mathematics", "Algebra, Geometry");
        teacher.display();
    }
}


