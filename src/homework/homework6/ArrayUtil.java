package homework.homework6;

public class ArrayUtil {

    void maxNum(int[] array) {
        int maxNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        System.out.println("Max num is: " + maxNum);
    }

    void minNum(int[] array) {
        int minNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        System.out.println("Min nam is: " + minNum);
    }

    void evenCount(int[] array) {
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                evenCount++;
            }
        }
        System.out.println();
        System.out.println("Even count: " + evenCount);
    }

    void oddCount(int[] array) {
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
                oddCount++;
            }
        }
        System.out.println();
        System.out.println("Odd count: " + oddCount);
    }

    void average(int[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.println("Average is: " + result / array.length);
    }

    void numSum(int[] array) {
        int numSum = 0;
        for (int i = 0; i < array.length; i++) {
            numSum += array[i];
        }
        System.out.println("Summary is: " + numSum);
    }

    void firstElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
        }
        System.out.println(array[0]);
    }

    void lastElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
        }
        System.out.println(array[array.length - 1]);
    }

    void midElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
        }
        System.out.println(array[array.length / 2]);
    }
}

