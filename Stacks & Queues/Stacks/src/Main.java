public class Main {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);

        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
