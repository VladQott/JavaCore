package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();

        dy.add(4);
        dy.add(1);
        dy.add(35);
        dy.add(33);
        dy.add(23);
        dy.add(73);
        dy.add(36);
        dy.add(3);
        dy.add(93);
        dy.add(83);
        dy.add(3);
        dy.add(3);
        dy.add(53);

        System.out.println(dy.getByIndex(3));
        dy.deleteByIndex(3);
        dy.print();
        System.out.println();
        dy.set(1, 83);
        dy.print();
        System.out.println();
        dy.add(1,53);
        dy.print();
        System.out.println();
        System.out.println(dy.exists(4) );
        System.out.println(dy.getIndexByValue(93));


    }
}
