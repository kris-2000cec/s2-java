//expt16

import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;

    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empid;
    String companyName;
    String qualification;
    double salary;

    public Employee(String name, String gender, String address, int age, int empid, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empid = empid;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject;
    String department;
    int teacherId;

    public Teacher(String name, String gender, String address, int age, int empid, String companyName, String qualification, double salary, String subject, String department, int teacherId) {
        super(name, gender, address, age, empid, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    void display() {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Emp ID: " + empid);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

public class person{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int n = s.nextInt();
        s.nextLine();  

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1));

            System.out.print("Enter Name: ");
            String name = s.nextLine();

            System.out.print("Enter Gender: ");
            String gender = s.nextLine();

            System.out.print("Enter Address: ");
            String address = s.nextLine();

            System.out.print("Enter Age: ");
            int age = s.nextInt();
            s.nextLine(); 

            System.out.print("Enter Emp ID: ");
            int empid = s.nextInt();
            s.nextLine(); 

            System.out.print("Enter Company Name: ");
            String companyName = s.nextLine();

            System.out.print("Enter Qualification: ");
            String qualification = s.nextLine();

            System.out.print("Enter Salary: ");
            double salary = s.nextDouble();
            s.nextLine(); 

            System.out.print("Enter Subject: ");
            String subject = s.nextLine();

            System.out.print("Enter Department: ");
            String department = s.nextLine();

            System.out.print("Enter Teacher ID: ");
            int teacherId = s.nextInt();
            s.nextLine();  

            teachers[i] = new Teacher(name, gender, address, age, empid, companyName, qualification, salary, subject, department, teacherId);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of Teacher " + (i + 1) + ":");
            teachers[i].display();
        }

        s.close();
    }
}




/*
s2mcabatch2@cscl6d07:~/Desktop/krishnaprasad_34$ javac person.java
s2mcabatch2@cscl6d07:~/Desktop/krishnaprasad_34$ java person
Enter the number of teachers: 2

Enter details for Teacher 1
Enter Name: meenu
Enter Gender: f
Enter Address: abc
Enter Age: 22
Enter Emp ID: 001
Enter Company Name: m
Enter Qualification: pg
Enter Salary: 600000
Enter Subject: dbms
Enter Department: cs
Enter Teacher ID: 0035

Enter details for Teacher 2
Enter Name: me
Enter Gender: f
Enter Address: aadd
Enter Age: 5
Enter Emp ID: 445
Enter Company Name: h
Enter Qualification: f
Enter Salary: 5555655
Enter Subject: cs
Enter Department: cs
Enter Teacher ID: 0005

Details of Teacher 1:
Teacher ID: 35
Name: meenu
Gender: f
Address: abc
Age: 22
Emp ID: 1
Company Name: m
Qualification: pg
Salary: 600000.0
Subject: dbms
Department: cs

Details of Teacher 2:
Teacher ID: 5
Name: me
Gender: f
Address: aadd
Age: 5
Emp ID: 445
Company Name: h
Qualification: f
Salary: 5555655.0
Subject: cs
Department: cs

*/
