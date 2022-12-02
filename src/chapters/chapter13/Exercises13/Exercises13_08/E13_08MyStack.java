package chapters.chapter13.Exercises13.Exercises13_08;

import java.util.ArrayList;
import java.util.Objects;

public class E13_08MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    //retrieves the element at the top of the stack without removing it.
    public Object peek() {
        return list.get(getSize() - 1);
    }

    //removes the top element from the stack and returns it.
    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    //adds the specified element to the stack.
    public void push(Object o) {
        list.add(o);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        E13_08MyStack clonedStack = (E13_08MyStack) super.clone();
        ArrayList<Object> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(list.get(i));
        }

        clonedStack.list = newList;
        return clonedStack;
    }

    @Override
    public String toString() {
        return list.toString();
    }

}
