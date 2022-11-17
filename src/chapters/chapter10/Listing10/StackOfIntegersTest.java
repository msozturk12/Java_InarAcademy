package chapters.chapter10.Listing10;

public class StackOfIntegersTest {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        System.out.println("Fill the stack ");
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(i);
        }

        System.out.println("Empty the stack");
        while (!stack.empty()) {
            System.out.println(stack.pop());

        }


    }
}
