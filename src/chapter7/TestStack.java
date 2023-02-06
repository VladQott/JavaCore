package chapter7;

public class TestStack {
    public static void main(String[] args) {
        Stack2 mystck1 = new Stack2();
        Stack2 mystck2 = new Stack2();

        for (int i = 0; i < 10; i++) {
            mystck1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystck2.push(i);
        }
        System.out.println("Stack in mystack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystck1.pop());
        }
        System.out.println("Stack in mystack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystck2.pop());
        }
    }
}
