package chapters.chapter11.Listing11;

import chapters.chapter11.Listing11.GeometricObject.Circle;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(new Circle());
        System.out.println("ms.getSize()-->"+ms.getSize());
        System.out.println(ms.toString());
    }

}
