package chapter8.chapter8Abstract;

abstract class A {
    abstract void callme();

    void callmatoo() {
        System.out.println("This is a concrete method.");
    }
}

class B extends A {
    @Override
    void callme() {
        System.out.println("B's implementation of callme.");
    }
}