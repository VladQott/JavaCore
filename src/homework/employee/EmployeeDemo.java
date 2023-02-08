package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
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
                    System.out.println("plese input employee name");
                    String name = scanner.nextLine();
                    System.out.println("please input employee surname");
                    String surname = scanner.nextLine();
                    System.out.println("please input employee ID");
                    String employeeid = scanner.nextLine();
                    System.out.println("please input employee salary");
                    String salary = scanner.nextLine();
                    System.out.println("please input employee company name");
                    String company = scanner.nextLine();
                    System.out.println("please input employee position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, employeeid, Double.parseDouble(salary), company, position);
                    employeeStorage.add(employee);
                    System.out.println("Employee is created");
                    System.out.println();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("please input id");
                    String id = scanner.nextLine();
                    employeeStorage.searchById(id);
                    break;
                case "4":
                    System.out.println("please input company name");
                    String compName = scanner.nextLine();
                    employeeStorage.searchByCompName(compName);
                    break;
                default:
                    System.out.println("Wrong command. Please try again.");
            }
        }
    }
}
