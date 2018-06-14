package ch2;

public class Chapter22 {

    public Node getReverseNodeRecursive(Node head, int k, IntWrapper i) {
        if (head == null) {
            return null;
        }
        Node node = getReverseNodeRecursive(head.next, k, i);
        i.value = i.value + 1;
        if (i.value == k) {
            return head;
        }
        return node;
    }

    public Node getReverseNodeIterative(Node head, int k) {
        if (k <= 0) return null;
        Node p1 = head;
        Node p2 = head;

        for (int i = 0; i < k-1; i++) {
            if (p2 == null) return null;
            p2 = p2.next;
        }
        if (p2 == null) return null;
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
