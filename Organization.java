import java.sql.SQLOutput;
import java.util.ArrayList;

public class Organization {

    private ArrayList<Employee> employee;

    public Organization() {
        this.employee = new ArrayList<Employee>();
    }

    //Add employee
    public void addEmployee(Employee person) {
        if (this.employee.contains(person)) {
            return;
        }
        this.employee.add(person);
    }

    //Print employees
    public void printEmployee() {
        System.out.println("All employees from the Organization: ");
        for (Employee person : employee) {
            System.out.println(person);
        }
    }

    public void printEmployeeDetails(Employee person) {
            System.out.println("Employee details:");
            System.out.println("First name: " + person.getFirstName());
            System.out.println("Last name: " + person.getLastName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Sex: " + person.getGender());
            System.out.println("Department: " + person.getDepartment());
            System.out.println();
    }

    public void printEmployeeNoDepartment(Employee person) {
        System.out.println("Employee details:");
        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Sex: " + person.getGender());
        System.out.println("Department: NONE");
        System.out.println();
    }

    //Remove employee by FirstName
    public void removeEmployeeByFirstName(String personFirstName) {
        boolean found = true;
        for (int i = 0; i < this.employee.size(); i++) {
            if (this.employee.get(i).getFirstName().equals(personFirstName)) {
                this.employee.remove(i);
                System.out.println("Employee with the first name - " + personFirstName + " - was removed.");
                i++;
                found = false;
            }
        }
        if (found) {
            System.out.println("Employee with the first name - " + personFirstName + " - was not found");
        }
    }

    //Remove employee by FirstName & LastName
    public void removeEmployeeByFirstName(String personFirstName, String personLastName) {
        boolean found = true;
        for (int i = 0; i < this.employee.size(); i++) {
            if (this.employee.get(i).getFirstName().equals(personFirstName) && this.employee.get(i).getLastName().equals(personLastName)) {
                this.employee.remove(i);
                System.out.println("Employee with the name - " + personFirstName + " " + personLastName + " - was removed.");
                i++;
                found = false;
            }
        }
        if (found) {
            System.out.println("Employee with the name - " + personFirstName + " " + personLastName + " - was not found.");
        }
    }

    //Search employee by FirstName
    public void searchByFirstName(String personFirstName) {
        boolean found = true;
        for (int i = 0; i < this.employee.size(); i++) {
            if (this.employee.get(i).getFirstName().equals(personFirstName)) {
                System.out.println("Employee with the first name - " + personFirstName + " - was found.");
                System.out.println(this.employee.get(i));
                i++;
                found = false;
            }
        }
        if (found) {
            System.out.println("Employee with the first name - " + personFirstName + " - was not found");
        }
    }

    //Search employee by LastName
    public void searchByLastName(String personLastName) {
        boolean found = true;
        for (int i = 0; i < this.employee.size(); i++) {
            if (this.employee.get(i).getLastName().equals(personLastName)) {
                System.out.println("Employee with the last name - " + personLastName + " - was found.");
                System.out.println(this.employee.get(i));
                i++;
                found = false;
            }
        }
        if (found) {
            System.out.println("Employee with the last name - " + personLastName + " - was not found");
        }
    }

    //Search employee by Age
    public void searchByAge(int personAge) {
        boolean found = true;
        for (int i = 0; i < this.employee.size(); i++) {
            if (this.employee.get(i).getAge() == personAge) {
                System.out.println("Employee with - " + personAge + " years - was found.");
                System.out.println(this.employee.get(i));
                i++;
                found = false;
            }
        }
        if (found) {
            System.out.println("Employee with - " + personAge + " years - was not found");
        }
    }

    //Search employee by Gender
    public void searchByGender(Employee.Gender personGender) {
        boolean found = true;
        for (int i = 0; i < this.employee.size(); i++) {
            if (this.employee.get(i).getGender().equals(personGender)) {
                System.out.println("Employee with - " + personGender + " gender - was found.");
                System.out.println(this.employee.get(i));
                i++;
                found = false;
            }
        }
        if (found) {
            System.out.println("Employee with - " + personGender + " gender - was not found");
        }
    }

    //Search employee by Department
    public void searchByDepartment(Employee.Department personDepartment) {
        boolean found = true;
        for (int i = 0; i < this.employee.size(); i++) {
            if (this.employee.get(i).getDepartment().equals(personDepartment)) {
                System.out.println("Employee from - " + personDepartment + " department - was found.");
                System.out.println(this.employee.get(i));
                i++;
                found = false;
            }
        }
        if (found) {
            System.out.println("Employee from - " + personDepartment + " department - was not found");
        }
    }

    public void changeFirstName(Employee person, String firstName) {
        for (Employee empl : employee) {
            if (person == empl) {
                System.out.println("First name was changed from - " + person.getFirstName() + " " + person.getLastName() + " - to - " + firstName + " " + person.getLastName());
                person.setFirstName(firstName);
            }
        }
    }

    public void changeLastName(Employee person, String lastName) {
        for (Employee empl : employee) {
            if (person == empl) {
                System.out.println("Last name was changed from - " + person.getFirstName() + " " + person.getLastName() + " - to - " + person.getFirstName() + " " + lastName);
                person.setLastName(lastName);
            }
        }
    }

    public void changeAge(Employee person, int age) {
        for (Employee empl : employee) {
            if (person == empl) {
                System.out.println("Age was changed for - " + person.getFirstName() + " " + person.getLastName() + " - from - " + person.getAge() + " - to - " + age);
                person.setAge(age);
            }
        }
    }

    public void changeGender(Employee person, Employee.Gender sex) {
        for (Employee empl : employee) {
            if (person == empl) {
                System.out.println("Gender was changed for - " + person.getFirstName() + " " + person.getLastName() + " - from - " + person.getGender() +  " - to - " + sex);
                person.setGender(sex);
            }
        }
    }

    public void changeDepartment(Employee person, Employee.Department department) {
        for (Employee empl : employee) {
            if (person == empl) {
                System.out.println("Department was changed for - " + person.getFirstName() + " " + person.getLastName() + " - from - " + person.getDepartment() + " - to - " + department);
                person.setDepartment(department);
            }
        }
    }
}