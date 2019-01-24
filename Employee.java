import java.util.ArrayList;

public class Employee extends Organization{
    private String firstName;
    private String lastName;
    private int age;
    private Gender sex;
    private Department department;

    public Employee(String firstName, String lastName, int age, Gender sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Employee(String firstName, String lastName, int age, Gender sex, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.department = department;
    }

    public enum Gender {
        FEMALE, MALE, OTHER;
    }

    public enum Department {
        HR, IT, DEV, QA , NONE;
    }

    // When printing employee list method it sets the input to display as below
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.age + " " + this.sex + " " + this.department;
    }

    public void printEmployeeNoDepartment() {
        System.out.println("Employee details:");
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("Sex: " + this.sex);
        System.out.println("Department: " + Department.NONE);
        System.out.println();
    }

    public void printEmployeeDetails() {
        System.out.println("Employee details:");
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("Sex: " + this.sex);
        System.out.println("Department: " + this.department);
        System.out.println();
    }

    public void printEmployee() {
        System.out.println(this.firstName + " " + this.lastName + " " + this.age + " " + this.sex + " " + this.department);
        System.out.println();
    }

    //Getters and Setters
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge() {
        this.age = age;
    }

    public Gender getGender() {return this.sex;}

    public void setGender(){this.sex = sex;}

    public Department getDepartment() {return this.department;}

    public void setDepartment(){this.department = department;}

}

