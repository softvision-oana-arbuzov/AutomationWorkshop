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
        for (Employee person : employee) {
            System.out.println(person);
        }
    }

//    public void printEmployeeDetails(int i) {
//        for (i = 0; i < this.employee.size(); i++) {
//            System.out.println("Employee details:");
//            System.out.println("First name: " + this.employee.get(i).getFirstName());
//            System.out.println("Last name: " + this.employee.get(i).getLastName());
//            System.out.println("Age: " + this.employee.get(i).getAge());
//            System.out.println("Sex: " + this.employee.get(i).getGender());
//            System.out.println("Department: " + this.employee.get(i).getDepartment());
//            System.out.println();
//            i++;
//        }
//    }

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
            found = true;
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
            found = true;
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
            found = true;
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
            found = true;
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
            found = true;
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
            found = true;
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
            found = true;
        }
    }

    public void changeFirstName(Employee person, String firstName) {
        for (Employee empl : employee) {
            if (person == empl) {
                person.this.employee.setFirstName(firstName);
            }
        }
    }
//
//    public void setLastName(String newLastName) {
//        this.lastName = newLastName;
//        System.out.print("Last name was changed for: ");
//    }
//
//    public void setAge(int newAge) {
//        this.age = newAge;
//        System.out.print("Age was changed for: ");
//    }
//
//    public void setSex(String newSex) {
//        this.sex = newSex;
//        System.out.print("Sex was changed for: ");
//    }
//
//    public void setDepartment(String newDepartment) {
//        this.department = newDepartment;
//        System.out.print("Department was changed for: ");
//    }

}