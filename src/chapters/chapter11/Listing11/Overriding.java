package chapters.chapter11.Listing11;

public class Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
    }
}

class B {
    public void p(double i) {
        System.out.println(i * 2);
    }
}

class A extends B {
    // This method overrides the method in B
    @Override
    public void p(double i) {
        System.out.println(i);
    }
}//output:10.0  10.0
