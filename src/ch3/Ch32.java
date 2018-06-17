package ch3;

public class Ch32 {

    private Stack stack = new Stack();
    private Stack minStack = new Stack();

    public void push(int value) {
        stack.push(value);
        if (minStack.peek() == null) {
            minStack.push(value);
        }
        if (value < minStack.peek()) {
            minStack.push(value);
        }
    }

    public Integer pop() {
        minStack.pop();
        return stack.pop();
    }

    public Integer peek() {
        return stack.peek();
    }

    public Integer min() {
        return minStack.peek();
    }

    public void printStack(Ch32 stack) {
        while (stack.peek() != null) {
            System.out.println(stack.pop());
        }
    }

}
