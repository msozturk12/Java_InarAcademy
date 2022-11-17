package chapters.chapter11.Exercises11.Exercise11_10;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {


    public MyStack() {

    }

    public MyStack(int capacity) {
        super(capacity);
    }

    public int size() {
        return super.size();
    }

    public Object peek() {
        return super.get(super.size() - 1);
    }

    public Object pop() {
        return super.remove(super.size() - 1);
    }

    public void push(Object o) {
        super.add(o);
    }

    public boolean isEmpty() {
        return super.size() == 0;
    }

    @Override
    public String toString() {
        return "Stack--> " + super.toString();
    }

}
