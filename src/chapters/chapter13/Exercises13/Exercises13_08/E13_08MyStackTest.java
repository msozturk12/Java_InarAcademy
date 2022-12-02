package chapters.chapter13.Exercises13.Exercises13_08;

public class E13_08MyStackTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        E13_08MyStack stack = new E13_08MyStack();
        stack.push(2);
        stack.push(3);
        stack.push(4);

        E13_08MyStack stack1 = (E13_08MyStack) stack.clone();

        System.out.print("stack-->"+stack.toString());
        System.out.print("\nstack1 is cloned from stack-->"+stack1.toString());
    }
}
