package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {

    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please input 3 for search employee by employee ID");
            System.out.println("Please input 4 for search employee by company name");
            String command = scanner.nextLine();

            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    createEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println(employeeStorage.searchById());
                    break;
                case "4":
                    System.out.println(employeeStorage.searchByCompName());
                    break;
                default:
                    System.out.println("Wrong command. Please try again.");
            }
        }
    }

    static void createEmployee() {
        System.out.println("plese input employee name");
        String name = scanner.nextLine();
        System.out.println("please input employee surname");
        String surname = scanner.nextLine();
        System.out.println("please input employee ID");
        String employeeid = scanner.nextLine();
        System.out.println("please input employee salary");
        Double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("please input employee company name");
        String company = scanner.nextLine();
        System.out.println("please input employee position");
        String position = scanner.nextLine();
        Employee employee = new Employee(name, surname, employeeid,
                Double.parseDouble(String.valueOf(salary)), company, position);
        EmployeeStorage.add(employee);
        System.out.println("Employee is created");
        System.out.println();
    }
}

