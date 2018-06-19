package ch3;

import ch2.Node;

public class Queue {
    Node first, last;

    public void enqueue(Integer item) {
        if (first == null) {
            last = new Node(item);
            first = last;
        } else {
            last.next = new Node(item);
            last = last.next;
        }
    }

    public Integer dequeue(Node n) {
        if (first != null) {
            Integer item = first.value;
            first = first.next;
            return item;
        }
        return null;
    }
}
