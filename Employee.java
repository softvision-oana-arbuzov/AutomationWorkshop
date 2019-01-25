import java.util.ArrayList;

public class Employee extends Organization {
    private String firstName;
    private String lastName;
    private Integer age;
    private Gender sex;
    private Department department;

    //Employee constructor - with no department
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

    //When printing employee list method it sets the input to display as below
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.age + " " + this.sex + " " + this.department;
    }

    //Getters and Setters
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return this.sex;
    }

    public void setGender(Gender sex) {
        this.sex = sex;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}

