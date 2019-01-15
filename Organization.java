import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Scanner;

public class Organization {

    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private String department;
    private ArrayList<Organization> employees;

    public Organization(String firstName, String lastName, int age, String sex, String department) {
        this.firstName = lastName;
        this.lastName = firstName;
        this.age = age;
        this.sex = sex;
        this.department = department;
        this.employees = new ArrayList<Organization>();
    }

    public String toString() {
        return firstName + " " + lastName + " " + age + " " + sex + " " + department;
    }

    //Add employee
    public void addEmployee(Organization employee) {
        if (!this.employees.contains(employee)) {
            this.employees.add(employee);
        }
    }

    //Print employee
    public void printEmployee() {
        for (Organization employee : employees) {
            System.out.println(employee);
        }
    }

    public void printListEmployees() {
        System.out.println(this.employees);
    }

    //Remove employee
    public void removeEmployee(Organization employee) {
        if (!this.employees.isEmpty()) {
            this.employees.remove(employee);
            System.out.println(employee + " - was removed");
        }
    }

    //Search employee
    public boolean searchEmployee(Organization searchedEmployee) {
         if (this.employees.contains(searchedEmployee)) {
            System.out.println(searchedEmployee + " - is available");
            return true;
        }
        System.out.println(searchedEmployee + " - is not available");
        return false;
    }

    //Edit employee info
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
        System.out.print("First name was changed for: ");
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
        System.out.print("Last name was changed for: ");
    }

    public void setAge(int newAge) {
        this.age = newAge;
        System.out.print("Age was changed for: ");
    }

    public void setSex(String newSex) {
        this.sex = newSex;
        System.out.print("Sex was changed for: ");
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
        System.out.print("Department was changed for: ");
    }

}