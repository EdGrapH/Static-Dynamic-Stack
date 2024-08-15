public class DynamicArrayStack<T> extends ArrayStack<T> {

    public DynamicArrayStack(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public void push(T item) {
        if (size() == array.length) {
            resize(2 * array.length); // Double the array size
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

        // Shrink the array if it is one-quarter full
        if (size() > 0 && size() == array.length / 4) {
            resize(array.length / 2);
        }

        return item;
    }

    private void resize(int newCapacity) {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size());
        array = newArray;
    }
}
