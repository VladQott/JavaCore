package homework.homework7;

public class Calculator {
    double add(double x, double y) {
        return x + y;
    }

    double sub(double x, double y) {
        return x - y;
    }

    double mult(double x, double y) {
        return x * y;
    }

    double div(double x, double y) {
        if (y == 0) {
            System.out.println("The number is not divisible to zero");
            return -1;
        } else {
            return x / y;
        }
    }
}
