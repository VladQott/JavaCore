package homework1;

public class IfForExample {
    public static void main(String[] args) {
        int a = 32;
        int b = 43;
        if (a < b) {
            System.out.println("max: " + b);
        }
        for (a = 32; a <= b; a++) {
            System.out.print(a + ", ");
        }
        System.out.println();
        {
            char c, c1;
            c = (char) a;
            c1 = (char) b;
            System.out.println("a and b: " + c + " and " + c1);
        }
        if (a == b) {
            System.out.println("a is equal to b");
        } else System.out.println("a is not equal to b");
    }
}
