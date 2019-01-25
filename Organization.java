import java.util.ArrayList;

public class Organization {

    private ArrayList<Employee> employees;

    public Organization() {
        this.employees = new ArrayList<Employee>();
    }

    //Add employee
    public void addEmployee(Employee employee) {
        if (this.employees.contains(employee)) {
            return;
        }
        this.employees.add(employee);
    }

    //Print employees
    public void printEmployees() {
        System.out.println("All employees from the Organization: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    //Print employee details
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee details:");
        System.out.println("First name: " + employee.getFirstName());
        System.out.println("Last name: " + employee.getLastName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Sex: " + employee.getGender());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println();
    }

    //Print employee details without department
    public void printEmployeeNoDepartment(Employee employee) {
        System.out.println("Employee details:");
        System.out.println("First name: " + employee.getFirstName());
        System.out.println("Last name: " + employee.getLastName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Sex: " + employee.getGender());
        System.out.println("Department: NONE");
        System.out.println();
    }

    //Remove employee by FirstName
    public void removeEmployeeByFirstName(String employeeFirstName) {
        boolean found = true;
        for (int i = 0; i < this.employees.size(); i++) {
            if (this.employees.get(i).getFirstName().equals(employeeFirstName)) {
                this.employees.remove(i);
                System.out.println("Employee with the first name - " + employeeFirstName + " - was removed.");
                i++;
                found = false;
            }
        }
        if (found) {
            System.out.println("Employee with the first name - " + employeeFirstName + " - was not found");
        }
    }

    //Remove employee by FirstName & LastName
    public void removeEmployeeByFirstName(String employeeFirstName, String employeeLastName) {
        boolean found = true;
        for (int i = 0; i < this.employees.size(); i++) {
            if (this.employees.get(i).getFirstName().equals(employeeFirstName) && this.employees.get(i).getLastName().equals(employeeLastName)) {
                this.employees.remove(i);
                System.out.println("Employee with the name - " + employeeFirstName + " " + employeeLastName + " - was removed.");
                i++;
                found = false;
            }
        }
        if (found) {
            System.out.println("Employee with the name - " + employeeFirstName + " " + employeeLastName + " - was not found.");
        }
    }

    //Search employee by FirstName
    public void searchByFirstName(String employeeFirstName) {
        boolean found = true;
        for (int i = 0; i < this.employees.size(); i++) {
            if (this.employees.get(i).getFirstName().equals(employeeFirstName)) {
                System.out.println("Employee with the first name - " + employeeFirstName + " - was found.");
                System.out.println(this.employees.get(i));
                i++;
                found = false;
            }
        }
        if (found) {
            System.out.println("Employee with the first name - " + employeeFirstName + " - was not found");
        }
    }

    //Search employee by LastName
    public void searchByLastName(String employeeLastName) {
        boolean found = true;
        for (int i = 0; i < this.employees.size(); i++) {
            if (this.employees.get(i).getLastName().equals(employeeLastName)) {
                System.out.println("Employee with the last name - " + employeeLastName + " - was found.");
                System.out.println(this.employees.get(i));
                i++;
                found = false;
            }
        }
        if (found) {
            System.out.println("Employee with the last name - " + employeeLastName + " - was not found");
        }
    }

    //Search employee by Age
    public void searchByAge(int employeeAge) {
        boolean found = true;
        for (int i = 0; i < this.employees.size(); i++) {
            if (this.employees.get(i).getAge() == employeeAge) {
                System.out.println("Employee with - " + employeeAge + " years - was found.");
                System.out.println(this.employees.get(i));
                i++;
                found = false;
            }
        }
        if (found) {
            System.out.println("Employee with - " + employeeAge + " years - was not found");
        }
    }

    //Search employee by Gender
    public void searchByGender(Gender employeeGender) {
        boolean found = true;
        for (int i = 0; i < this.employees.size(); i++) {
            if (this.employees.get(i).getGender().equals(employeeGender)) {
                System.out.println("Employee with - " + employeeGender + " gender - was found.");
                System.out.println(this.employees.get(i));
                i++;
                found = false;
            }
        }
        if (found) {
            System.out.println("Employee with - " + employeeGender + " gender - was not found");
        }
    }

    //Search employee by Department
    public void searchByDepartment(Department employeeDepartment) {
        boolean found = true;
        for (int i = 0; i < this.employees.size(); i++) {
            if (this.employees.get(i).getDepartment().equals(employeeDepartment)) {
                System.out.println("Employee from - " + employeeDepartment + " department - was found.");
                System.out.println(this.employees.get(i));
                i++;
                found = false;
            }
        }
        if (found) {
            System.out.println("Employee from - " + employeeDepartment + " department - was not found");
        }
    }

    public void changeFirstName(Employee employee, String firstName) {
        for (Employee empl : employees) {
            if (employee == empl) {
                System.out.println("First name was changed from - " + employee.getFirstName() + " " + employee.getLastName() + " - to - " + firstName + " " + employee.getLastName());
                employee.setFirstName(firstName);
            }
        }
    }

    public void changeLastName(Employee employee, String lastName) {
        for (Employee empl : employees) {
            if (employee == empl) {
                System.out.println("Last name was changed from - " + employee.getFirstName() + " " + employee.getLastName() + " - to - " + employee.getFirstName() + " " + lastName);
                employee.setLastName(lastName);
            }
        }
    }

    public void changeAge(Employee employee, int age) {
        for (Employee empl : employees) {
            if (employee == empl) {
                System.out.println("Age was changed for - " + employee.getFirstName() + " " + employee.getLastName() + " - from - " + employee.getAge() + " - to - " + age);
                employee.setAge(age);
            }
        }
    }

    public void changeGender(Employee employee, Gender sex) {
        for (Employee empl : employees) {
            if (employee == empl) {
                System.out.println("Gender was changed for - " + employee.getFirstName() + " " + employee.getLastName() + " - from - " + employee.getGender() + " - to - " + sex);
                employee.setGender(sex);
            }
        }
    }

    public void changeDepartment(Employee employee, Department department) {
        for (Employee empl : employees) {
            if (employee == empl) {
                employee.setDepartment(department);
            }
        }
    }
}