package chapter8;

public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area(){
        System.out.println("Area for figure is undefined.");
        return  0;
    }
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside area for rectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }

    @Override
    double area() {
        System.out.println("Inside area for triangle.");
        return dim1 * dim2 / 2;
    }
}
