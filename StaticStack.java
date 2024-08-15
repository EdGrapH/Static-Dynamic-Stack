public class StaticStack<T> extends ArrayStack<T> {

    public StaticStack(int capacity) {
        super(capacity);
    }

    @Override
    public void push(T item) {
        if (size() == array.length) {
            System.out.println("Stack is full");
        }
        array[++top] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        T item = array[top];
        array[top--] = null; // Eliminate obsolete reference
        return item;
    }
}
