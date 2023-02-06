package chapter6;

public class Box {
    double width;
    double height;
    double depth;




    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Box(){
        System.out.println("Constracting Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    double volume(){
        return width * height * depth;
    }
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;


    }
}
