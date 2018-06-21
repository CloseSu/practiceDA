package ch4;

import ch2.Node;

public class Queue {
    TreeNode first, last;

    public void enqueue(TreeNode item) {
        if (first == null) {
            last = item;
            first = last;
        } else {
            last.next = item;
            last = last.next;
        }
    }

    public TreeNode dequeue() {
        if (first != null) {
            TreeNode item = first;
            first = first.next;
            return item;
        }
        return null;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
