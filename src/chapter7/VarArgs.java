package chapter7;

public class VarArgs {
    static void vaTest(int ... v) {
        System.out.print("Numbers of args: " + v.length + " Conteins: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}
