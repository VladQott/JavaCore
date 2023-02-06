package homework.BraceChecker;

public class Stack {
    private int array[] = new int[10];
    private int tos;

    Stack() {

        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Stack is full.");
        else
            array[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            return 0;
        }
        return array[tos--];
    }

    public boolean isEmpty() {
        return tos == -1;
    }
}
