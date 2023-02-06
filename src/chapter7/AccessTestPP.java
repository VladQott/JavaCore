package chapter7;

public class AccessTestPP {
    public static void main(String[] args) {
        TestPP ob = new TestPP();
        ob.a = 10;
        ob.b = 20;

        ob.setC(100);
        System.out.println("a, b and c: " + ob.a + " " + ob.b + " "
                + ob.getC());
    }
}
