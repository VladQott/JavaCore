package homework.employee;

import classwork.Book;

public class EmployeeStorage {
    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
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

    public void searchById(String id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().contains(id)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("Employee with " + id + " does not exist");
        }
    }

    public void searchByCompName(String compName) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().contains(compName)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("Employee with " + compName + " does not exist");
        }
    }
}

