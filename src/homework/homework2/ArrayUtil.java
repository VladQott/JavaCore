package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {3, 5, 34, 13, 6, 33, 78, 46, 2, 8, 12};
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
        System.out.println();



        System.out.println();
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                evenCount++;
            }
        }
        System.out.println();
        System.out.println("Even count: " + evenCount);

        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
                oddCount++;
            }
        }
        System.out.println();
        System.out.println("Odd count: " + oddCount);

        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.println("Average is: " + result / array.length);

        int numSum = 0;
        for (int i = 0; i < array.length; i++) {
            numSum += array[i];
        }
        System.out.println("Summary is: " + numSum);
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);
        System.out.println(array[array.length / 2]);
    }
}
