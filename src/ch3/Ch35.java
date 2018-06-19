package ch3;

public class Ch35 {
    Stack buffer = new Stack();
    Stack queue = new Stack();

    public void push(int value) {
        if (queue.peek() == null) {
            queue.push(value);
        } else {
            while (queue.peek() != null) {
                buffer.push(queue.pop());
            }
            buffer.push(value);
            while (buffer.peek() != null) {
                queue.push(buffer.pop());
            }
        }
    }

    public Integer pop() {
        return queue.pop();
    }

    public Integer peek() {
        return queue.peek();
    }
}
