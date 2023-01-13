package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {3, 5, 34, 13, 6, 33, 78, 46, 2, 8, 12};
        ArrayUtil au = new ArrayUtil();

        au.maxNum(array);
        au.minNum(array);
        au.evenCount(array);
        au.oddCount(array);
        au.average(array);
        au.numSum(array);
        au.firstElement(array);
        au.lastElement(array);
        au.midElement(array);
    }
}
