package chapters.chapter10.Exercises10.Exercise10_10;

public class Queue {
/*
first in first out
 */

    private int[] elements;//that stores the int values in the queue
    private int size;//that stores the number of elements in the queue
    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
    }


    public void enqueue(int v) {
        if (this.size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;

        }
        elements[size] = v;
        size++;

    }

    public int dequeue() {
        int n = elements[0];
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];

        }
        size--;
        return  n;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return this.size;
    }
}
