package homework.homework4;

public class CharArrayExample {
    public static void main(String[] args) {

        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int oCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c)
                oCount++;
        }
        System.out.println("o count = " + oCount);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.print((chars2[chars2.length / 2 - 1]) + " " + chars2[chars2.length / 2]);
        System.out.println();

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean t = chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y';
        System.out.println(t);

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i] + " ");
            }
        }
        System.out.println();
    }
}

