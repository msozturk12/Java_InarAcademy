package chapters.chapter13.Checkpoints13;

public class CheckPoints13_13_14_15_16 {
    public static void main(String[] args) {

        class B implements A {
            public void m1() {
                System.out.println("m1");
            }
        }
        /*

        CheckPoints13_13-->
            Suppose A is an interface. Can you create an instance using new A()?--NO

         CheckPoints13_14-->
            Suppose A is an interface. Can you declare a reference variable x with type A like this?
                A x;  --->yes we can

         CheckPoints13_15-->
            Which of the following is a correct interface?-->d

        CheckPoints13_16-->
            All methods defined in an interface are public.
            When a class implements the interface, the method must be declared public

        interface A {
                void m1();
            }
            class B implements A {
                void m1() {                          --->must be public void m1()...
                    System.out.println("m1");
        }
    }

         */
    }

}
