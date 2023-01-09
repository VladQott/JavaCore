package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int firstIndex = 0;
        int lastIndex = spaceArray.length - 1;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                firstIndex++;
            } else break;
        }
        for (int i = spaceArray.length - 1; i >= 0; i--) {
            if (spaceArray[i] == ' ') {
                lastIndex--;
            } else break;
        }
        char[] result = new char[lastIndex - (firstIndex - 1)];
        for (int i = 0; i < result.length; i++) {
            result[i] = spaceArray[firstIndex++];
            System.out.print(result[i] + " ");
        }
    }
}
