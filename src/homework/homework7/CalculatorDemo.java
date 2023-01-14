package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator result = new Calculator();
        System.out.println(result.add(33, 13));
        System.out.println(result.sub(45, 17));
        System.out.println(result.mult(24, 37));
        System.out.println(result.div(23, 0));
        System.out.println(result.div(121, 4));
    }
}
