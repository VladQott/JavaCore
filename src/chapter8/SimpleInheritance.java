package chapter8;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        subOb.i = 10;
        subOb.j = 20;
        System.out.println("Contents of superOb: ");
        subOb.showij();
        System.out.println();


        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Sum of i, j and k in subOb:");
    }
}
