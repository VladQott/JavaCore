package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {3, 5, 34, 13, 33, 6, 78, 46, 2, 8,};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        int maxNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        System.out.println("Max num is: " + maxNum);

        int minNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        System.out.println("Min nam is: " + minNum);
    }
}
