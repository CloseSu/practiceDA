package ch3;

import ch2.Node;

public class Stack {
    Node top;

    Integer pop() {
        if (top != null) {
            int item = top.value;
            top = top.next;
            return item;
        }
        return null;
    }

    void push(int value) {
        Node t = new Node(value);
        t.next = top;
        top = t;
    }

    Integer peek() {
        if (top == null) {
            return null;
        }
        return top.value;
    }

    public Boolean isEmpty() {
        return top == null;
    }


}
