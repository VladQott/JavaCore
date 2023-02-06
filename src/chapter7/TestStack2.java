package chapter7;

public class TestStack2 {
    public static void main(String[] args) {
        Stack mystck1 = new Stack(5);
        Stack mystck2 = new Stack(8);

        for (int i = 0; i < 5; i++) {
            mystck1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mystck2.push(i);
        }
        System.out.println("Stack in mystck1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystck1.pop());
        }
        System.out.println("Stack in mystck2: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystck2.pop());
        }
    }
}
