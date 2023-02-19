package homework.employee;

import homework.employee.model.Employee;
import homework.employee.storage.EmployeeStorage;
import homework.employee.util.DateUtil;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {


    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) throws ParseException {

        employeeStorage.add(new Employee("Poxos", "Poxosyan", "a003", 150, "compani 1", "jr. manager", new Date(), DateUtil.stringToDate("19/03/1985")));
        employeeStorage.add(new Employee("Varos", "Varosyan", "a002", 250, "compani 1", "manager", new Date(), DateUtil.stringToDate("27/07/1987")));
        employeeStorage.add(new Employee("Mko", "Mkrtchyan", "a001", 350, "compani 1", "senior manager", new Date(), DateUtil.stringToDate("13/03/1993")));

        boolean isRun = true;

        while (isRun) {
            printCommands();

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeeById();
                    break;
                case "4":
                    getEmployeesByCompanyName();
                    break;
                case "5":
                    searchEmployeesBySalaryRange();
                case "6":
                    changePositionById();
                    break;
                case "7":
                    employeeStorage.printByStatus(true);
                    break;
                case "8":
                    inactivateEmployee();
                    break;
                case "9":
                    activateEmployee();
                    break;
                default:
                    System.out.println("Wrong command. Please try again!!!");
            }
        }
    }

    private static void activateEmployee() {
        employeeStorage.printByStatus(false);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || employee.isActive()) {
            System.out.println("Wrong employee id,or employee is inactive. Please try again!");
        } else {
            employee.setActive(true);
            System.out.println("Status changed!");
        }
    }

    private static void inactivateEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("Wrong employee id,or employee is inactive. Please try again!");
        } else {
            employee.setActive(false);
            System.out.println("Status changed!");
        }
    }

    private static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add employee");
        System.out.println("Please input 2 for print employees");
        System.out.println("Please input 3 for search employee by id");
        System.out.println("Please input 4 for search employee by compani name");
        System.out.println("Please input 5 for search employee by salary range");
        System.out.println("Please input 6 for change employee position by id");
        System.out.println("Please input 7 for print only active employees");
        System.out.println("Please input 8 for inactive employee by id");
        System.out.println("Please input 9 for active employee by id");
    }


    private static void getEmployeeById() {
        System.out.println("please input employee Id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("emloyee with " + employeeId + " id dosn't exist");
        } else {
            System.out.println(employee);
        }
    }


    private static void addEmployee() throws ParseException {

        System.out.println("Please input name, surname, employeeId, salary, companyName, position, dateOfBirthday(15/02/2023)");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Employee employeeById = employeeStorage.getEmployeeById(employeeId);
        if (employeeById == null) {
            Employee employee = new Employee(employeeData[0], employeeData[1], employeeId, Double.parseDouble(employeeData[3]),
                    employeeData[4], employeeData[5], new Date(), DateUtil.stringToDate(employeeData[6]));
            employeeStorage.add(employee);
            System.out.println("Employee was added!");
        } else {
            System.out.println("Employee with " + employeeId + " id already exist");
        }
    }

    private static void searchEmployeesBySalaryRange() {
        System.out.println("Please input minPrice, maxPrice");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double minPrice = Double.parseDouble(salaryRange[0]);
        double maxPrice = Double.parseDouble(salaryRange[1]);
        if (maxPrice < minPrice) {
            System.out.println("minPrise should be less than maxPrice");
            return;
        }
        employeeStorage.searchBySalaryRange(minPrice, maxPrice);
    }

    private static void getEmployeesByCompanyName() {
        System.out.println("please input company name");
        String compamyName = scanner.nextLine();
        employeeStorage.searchEmployeeByConpanyName(compamyName);
    }

    private static void changePositionById() {
        employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Wrong employee id, please try again!");
        } else {
            System.out.println("please input new position name");
            String position = scanner.nextLine();
            employee.setPosition(position);
            System.out.println("Position changed!");
        }
    }
}

