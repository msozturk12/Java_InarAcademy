package chapters.chapter11.CheckPoint11.CheckPoint11_4;

public class A {
    public A() {
        System.out.println("A's no-arg constructor is invoked");//this is the output

    }
}

class B extends A {

}

//run the class C
class C {
    public static void main(String[] args) {
        B b = new B();
    }
}