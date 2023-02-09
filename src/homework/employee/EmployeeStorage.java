package homework.employee;


import static homework.employee.EmployeeDemo.scanner;

public class EmployeeStorage {
    private static Employee[] array = new Employee[10];
    private static int size = 0;

    public static void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private static void extend() {
        Employee[] tmp = new Employee[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public <Scanner> Employee searchById() {
        System.out.println("please input id");
        String id = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().equals(id)) {
                found = true;
                return employee;
            }
        }
        return null;
    }

    public Employee searchByCompName() {
        System.out.println("please input company name");
        String compName = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().toLowerCase().contains(compName)) {
                found = true;
                return employee;
            }
        }
        return null;
    }
}


