package ch3;

public class Ch36 {
    Stack stack = new Stack();
    Stack buffer = new Stack();

    public void push(int value) {
        if (stack.peek() == null || value < stack.peek()) {
            stack.push(value);
        } else {
            while (stack.peek() != null && value > stack.peek()) {
                buffer.push(stack.pop());
            }
            stack.push(value);
            while (buffer.peek() != null) {
                stack.push(buffer.pop());
            }
        }
    }

    public Integer pop() {
        return stack.pop();
    }

    public Boolean isEmpty() {
        return stack.peek() == null;
    }

    public Integer peek() {
        return stack.peek();
    }

    public Stack sort(Stack s) {
        Stack r = new Stack();
        while (!s.isEmpty()) {
            int tmp = s.pop();
            while (!r.isEmpty() && r.peek() > tmp) {
                s.push(r.pop());
            }
            r.push(tmp);
        }
        return r;
    }
}
