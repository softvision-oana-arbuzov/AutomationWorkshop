import java.util.ArrayList;
import java.util.Scanner;

public class MainOrg {

    public static void main(String[] args) {
        //Scanner reader = new Scanner(System.in);
        Organization org = new Organization();

        Employee employee1 = new Employee("Griffin", "Peter", 32, Employee.Gender.MALE, Employee.Department.NONE);
        Employee employee2 = new Employee("Pop", "Mirela", 28, Employee.Gender.FEMALE, Employee.Department.DEV);
        Employee employee3 = new Employee("Taylor", "Scott", 18, Employee.Gender.MALE, Employee.Department.NONE);
        Employee employee4 = new Employee("Beck", "Jenny", 24, Employee.Gender.FEMALE, Employee.Department.NONE);
        Employee employee5 = new Employee("Costa", "Dave", 34, Employee.Gender.MALE, Employee.Department.QA);
        Employee employee6 = new Employee("Adronic", "Adam", 32, Employee.Gender.OTHER, Employee.Department.QA);
        Employee employee7 = new Employee("Griffin", "Aneta", 22, Employee.Gender.OTHER, Employee.Department.IT);

        org.addEmployee(employee1);
        employee1.printEmployeeNoDepartment();
        org.addEmployee(employee2);
        employee2.printEmployeeDetails();
        org.addEmployee(employee3);
        employee3.printEmployeeDetails();
        org.addEmployee(employee4);
        employee4.printEmployeeDetails();
        org.addEmployee(employee5);
        employee5.printEmployeeDetails();
        org.addEmployee(employee6);
        employee6.printEmployeeDetails();
        org.addEmployee(employee7);
        employee7.printEmployeeDetails();

        org.printEmployee();
        System.out.println();

        org.searchByFirstName("Griffin");
        org.searchByFirstName("Beck");
        org.searchByFirstName("Scott");
        org.searchByLastName("Griffin");
        org.searchByLastName("Jenny");
        org.searchByAge(32);
        org.searchByAge(77);
        org.searchByAge(34);
        org.searchByAge(24);
        org.searchByAge(100);
        org.searchByGender(Employee.Gender.FEMALE);
        org.searchByGender(Employee.Gender.MALE);
        org.searchByGender(Employee.Gender.OTHER);
        org.searchByDepartment(Employee.Department.QA);
        org.searchByDepartment(Employee.Department.IT);
        org.searchByDepartment(Employee.Department.HR);

        System.out.println();
        org.removeEmployeeByFirstName("Costa");
        org.printEmployee();
        org.addEmployee(employee5);
        System.out.println();
        org.removeEmployeeByFirstName("Costa", "Dave");
        org.addEmployee(employee5);
        org.removeEmployeeByFirstName("Parasuta");
        System.out.println();

//        System.out.println("");
//        employee2.setFirstName("Daniela");
//        employee2.printEmployee();
//        employee2.setLastName("Popica");
//        employee2.printEmployee();
//        employee2.setSex("Female");
//        employee2.printEmployee();
//
//        employee3.setDepartment("HR");
//        employee3.printEmployee();
//
//        employee4.setAge(25);
//        employee4.printEmployee();
//
//        System.out.println("");
//        employee1.searchEmployee(employee1);
//        employee4.searchEmployee(employee4);

    }
}