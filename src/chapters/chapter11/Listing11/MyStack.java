package chapters.chapter11.Listing11;

import java.util.ArrayList;

public class MyStack {

    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
        return list.size();
    }

    //retrieves the element at the top of the stack without removing it.
    public Object peek(){
        return list.get(getSize()-1);
    }
    //removes the top element from the stack and returns it.
    public Object pop(){
        Object o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }
    //adds the specified element to the stack.
    public void push(Object o){
        list.add(o);

    }
    public String toString(){
        return "Stack :" + list.toString();
    }
}
