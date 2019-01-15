import java.util.ArrayList;
import java.util.Scanner;

public class MainOrg {

    public static void main(String[] args) {
        //Scanner reader = new Scanner(System.in);

        Organization employee1 = new Organization("Griffin", "Peter", 32, "male", "HR");
        employee1.addEmployee(employee1);
        employee1.printEmployee();

        Organization employee2 = new Organization("Bond", "Stewie", 28, "male", "DEV");
        employee2.addEmployee(employee2);
        employee2.printEmployee();

        Organization employee3 = new Organization("Pop", "Dan", 18, "male", "QA");
        employee3.addEmployee(employee3);
        employee3.printEmployee();

        Organization employee4 = new Organization("Griffin", "Alan", 24, "male", "IT");
        employee4.addEmployee(employee4);
        employee4.printEmployee();


//        System.out.println("Type in the number of employees: ");
//        int totalEmployees = Integer.parseInt(reader.nextLine());
//
//        int i = 0;
//        while (i < totalEmployees) {
//            System.out.println("Type in the employee's info: ");
//            System.out.print("First Name: ");
//            String firstName = reader.nextLine();
//            System.out.print("Last Name: ");
//            String lastName = reader.nextLine();
//            System.out.print("Age: ");
//            int age = Integer.parseInt(reader.nextLine());
//            System.out.print("Sex: ");
//            String sex = reader.nextLine();
//            System.out.print("Deparment: ");
//            String department = reader.nextLine();
//            System.out.println("Employee :");
//            Organization person = new Organization(firstName, lastName, age, sex, department);
//            person.printEmployee();
//            person.addEmployee(person);
//            i++;
//        }

        System.out.println("");
        employee1.removeEmployee(employee1);
        employee1.printEmployee();

        System.out.println("");
        employee2.setFirstName("Daniela");
        employee2.printEmployee();
        employee2.setLastName("Popica");
        employee2.printEmployee();
        employee2.setSex("Female");
        employee2.printEmployee();

        employee3.setDepartment("HR");
        employee3.printEmployee();

        employee4.setAge(25);
        employee4.printEmployee();

        System.out.println("");
        employee1.searchEmployee(employee1);
        employee4.searchEmployee(employee4);

    }
}