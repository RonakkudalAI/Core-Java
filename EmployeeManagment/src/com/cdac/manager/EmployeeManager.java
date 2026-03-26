package com.cdac.manager;

import java.util.ArrayList;

import com.cdac.model.Employee;

interface EmpService
{
    void addEmployee(Employee e);
    void displayEmployee();
    void updateEmployee(int id,String name,double salary) throws Exception;
    void deleteEmployee(int id) throws Exception;
    void sortBySalary();
    void filterSalary(double salary);
}

public class EmployeeManager implements EmpService
{

    ArrayList<Employee> elist = new ArrayList<>();


    // CREATE
    public void addEmployee(Employee e)
    {
        elist.add(e);
        System.out.println("Employee Added");
    }


    // READ
    public void displayEmployee()
    {
        elist.forEach(System.out::println);
    }


    // UPDATE
    public void updateEmployee(int id,String name,double salary) throws Exception
    {

        for(Employee e:elist)
        {
            if(e.getId()==id)
            {
                e.setName(name);
                e.setSalary(salary);
                System.out.println("Employee Updated");
                return;
            }
        }

        throw new Exception("Employee Not Found");
    }


    // DELETE
    public void deleteEmployee(int id) throws Exception
    {

        boolean removed = elist.removeIf(e -> e.getId()==id);

        if(!removed)
        {
            throw new Exception("Employee Not Found");
        }

        System.out.println("Employee Deleted");
    }


    // SORT USING LAMBDA
    public void sortBySalary()
    {
        elist.sort((e1,e2)-> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println("Sorted by Salary");
        displayEmployee();
    }


    // FILTER USING STREAM
    public void filterSalary(double salary)
    {
        elist.stream()
             .filter(e -> e.getSalary()>salary)
             .forEach(System.out::println);
    }

}