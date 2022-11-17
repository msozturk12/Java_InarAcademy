package chapters.chapter10.Listing10;

public class Stack {
    private int[] elements;
    private int size;
    private int capacity;
    public static final int DEFAULT_CAPACITY = 16;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        elements = new int[capacity];
    }

    public int getSize() {
        return this.size;
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        return elements[size - 1];
    }

    public int pop() {
        size--;
        return elements[size];
    }

    public void push(int value) {
        if (size >= elements.length) {
            System.out.println("Size is more than elements");
            int[] temp = new int[elements.length * elements.length];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = value;
        size++;

    }

}
