import java.util.ArrayList;
import java.util.Scanner;

public class MainOrg {

    public static void main(String[] args) {
        //Scanner reader = new Scanner(System.in);
        Organization org = new Organization();

        Employee employee1 = new Employee("Griffin", "Peter", 32, Gender.MALE, Department.NONE);
        Employee employee2 = new Employee("Pop", "Mirela", 28, Gender.FEMALE, Department.DEV);
        Employee employee3 = new Employee("Taylor", "Scott", 18, Gender.MALE, Department.NONE);
        Employee employee4 = new Employee("Beck", "Jenny", 24, Gender.FEMALE, Department.NONE);
        Employee employee5 = new Employee("Costa", "Dave", 34, Gender.MALE, Department.QA);
        Employee employee6 = new Employee("Adronic", "Adam", 32, Gender.OTHER, Department.QA);
        Employee employee7 = new Employee("Griffin", "Aneta", 22, Gender.OTHER, Department.IT);

        org.addEmployee(employee1);
        org.printEmployeeNoDepartment(employee1);
        org.addEmployee(employee2);
        org.printEmployeeDetails(employee2);
        org.addEmployee(employee3);
        org.printEmployeeDetails(employee3);
        org.addEmployee(employee4);
        org.printEmployeeDetails(employee4);
        org.addEmployee(employee5);
        org.printEmployeeDetails(employee5);
        org.addEmployee(employee6);
        org.printEmployeeDetails(employee6);
        org.addEmployee(employee7);
        org.printEmployeeDetails(employee7);

        org.printEmployees();
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

        org.searchByGender(Gender.FEMALE);
        org.searchByGender(Gender.MALE);
        org.searchByGender(Gender.OTHER);

        org.searchByDepartment(Department.QA);
        org.searchByDepartment(Department.IT);
        org.searchByDepartment(Department.HR);

        System.out.println();
        org.removeEmployeeByFirstName("Costa");
        org.printEmployees();
        org.addEmployee(employee5);
        System.out.println();

        org.removeEmployeeByFirstName("Costa", "Dave");
        org.addEmployee(employee5);

        org.removeEmployeeByFirstName("Parasuta");
        System.out.println();

        org.changeFirstName(employee6, "Medan");
        org.printEmployeeDetails(employee6);

        org.changeLastName(employee2, "Adela");
        org.printEmployeeDetails(employee2);

        org.changeAge(employee4, 25);
        org.printEmployeeDetails(employee4);

        org.changeGender(employee6, Gender.MALE);
        org.printEmployeeDetails(employee6);

        org.changeDepartment(employee1, Department.IT);
        org.printEmployeeDetails(employee1);
    }
}