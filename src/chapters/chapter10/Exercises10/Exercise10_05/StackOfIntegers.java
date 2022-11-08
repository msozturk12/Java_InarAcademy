package chapters.chapter10.Exercises10.Exercise10_05;

public class StackOfIntegers {

    private int[] elements;//An array to store integers in the stack.
    private int size; //The number of integers in the stack. eleman sayısı
    private int capacity;


    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);

    }

    public StackOfIntegers(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
    }

    public boolean empty() {
        return (size == 0);
    }

    public boolean isFull() {
        return size == capacity;
    }
    /** Return the top element from the stack */
    public int peek() {
        return elements[size - 1];
    }

    public void push(int value) {   //Stores an integer into the top of the stack.
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    /** Return and remove the top element from the stack */
    public int pop() {
        size--;
        return elements[size];
    }

    public int getSize() {
        return this.size;
    }
}


