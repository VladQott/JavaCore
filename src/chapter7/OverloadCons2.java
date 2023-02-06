package chapter7;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box2 myb1 = new Box2(10, 20, 15);
        Box2 myb2 = new Box2();
        Box2 myc = new Box2(7);

        Box2 mycl = new Box2(myb1);
        double vol;

        vol = myb1.volume();
        System.out.println("Volume of myb1 is " + vol);

        vol = myb2.volume();
        System.out.println("Volume of myb2 is " + vol);

        vol = myc.volume();
        System.out.println("Volume of cube is " + vol);

        vol = mycl.volume();
        System.out.println("Volume of clone is " + vol);
    }
}
