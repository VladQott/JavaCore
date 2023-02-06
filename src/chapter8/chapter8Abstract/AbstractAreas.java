package chapter8.chapter8Abstract;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 10);
        Triangle t = new Triangle(9, 5);
        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
    }
}
