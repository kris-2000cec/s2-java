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
    String[] subjects;

    public Teacher(int empid, String name, double salary, String address, String department, String[] subjects) {
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
        System.out.print("Subjects : ");
        for (String subject : subjects) {
            System.out.print(subject + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of teachers: ");
        int n = s.nextInt();
        s.nextLine();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Teacher " + (i + 1));

            System.out.print("Enter empid: ");
            int empid = s.nextInt();
            s.nextLine();

            System.out.print("Enter name: ");
            String name = s.nextLine();

            System.out.print("Enter salary: ");
            double salary = s.nextDouble();
            s.nextLine();

            System.out.print("Enter address: ");
            String address = s.nextLine();

            System.out.print("Enter department: ");
            String department = s.nextLine();

            System.out.print("Enter number of subjects: ");
            int numSubjects = s.nextInt();
            s.nextLine();

            String[] subjects = new String[numSubjects];
            System.out.println("Enter subjects: ");
            for (int j = 0; j < numSubjects; j++) {
                subjects[j] = s.nextLine();
            }

            teachers[i] = new Teacher(empid, name, salary, address, department, subjects);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nTeacher " + (i + 1) + " Details:");
            teachers[i].display();
        }
    }
}

