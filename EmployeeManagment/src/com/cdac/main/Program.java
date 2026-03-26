package com.cdac.main;

import java.util.Scanner;

import com.cdac.manager.EmployeeManager;
import com.cdac.model.Employee;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeManager manager = new EmployeeManager();

        while(true)
        {
            System.out.println("\n1 Add Employee");
            System.out.println("2 Display Employee");
            System.out.println("3 Update Employee");
            System.out.println("4 Delete Employee");
            System.out.println("5 Sort By Salary");
            System.out.println("6 Filter Salary");
            System.out.println("7 Exit");

            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            try
            {
                switch(ch)
                {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    manager.addEmployee(new Employee(id,name,salary));
                    break;


                case 2:
                    manager.displayEmployee();
                    break;


                case 3:

                    System.out.print("Enter ID: ");
                    int uid = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String uname = sc.next();

                    System.out.print("Enter Salary: ");
                    double usal = sc.nextDouble();

                    manager.updateEmployee(uid,uname,usal);
                    break;


                case 4:

                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();

                    manager.deleteEmployee(did);
                    break;


                case 5:
                    manager.sortBySalary();
                    break;


                case 6:

                    System.out.print("Enter Salary Value: ");
                    double s = sc.nextDouble();

                    manager.filterSalary(s);
                    break;


                case 7:
                    System.exit(0);
                }

            }

            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }

        }

    }

}