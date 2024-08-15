public class StaticStackExample {
    public static void main(String[] args) {
        // Create a StaticStack with a capacity of 3
        StaticStack<Integer> stack = new StaticStack<>(3);

        // Push elements onto the stack
        System.out.println("Pushing elements into StaticStack:");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Current stack size: " + stack.size());
        // Try to push another element
        try {
            stack.push(4);
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Try to pop from an empty stack
        try {
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
