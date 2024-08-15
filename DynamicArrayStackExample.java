public class DynamicArrayStackExample {
    public static void main(String[] args) {
        // Create a DynamicArrayStack with an initial capacity of 2
        DynamicArrayStack<Integer> stack = new DynamicArrayStack<>(2);

        // Push elements onto the stack
        System.out.println("Pushing elements into DynamicArrayStack:");
        stack.push(1);
        stack.push(2);
        System.out.println("Current stack size: " + stack.size());

        // Push more elements to trigger resizing
        System.out.println("Pushing more elements into DynamicArrayStack:");
        stack.push(3);
        stack.push(4);
        System.out.println("Current stack size: " + stack.size());

        // Try to pop from an empty stack
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
