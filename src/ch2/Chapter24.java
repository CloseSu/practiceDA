package ch2;

public class Chapter24 {
    public Node divideNode(Node node, int x) {
        Node head = null;
        Node headIterator = new Node();
        Node tail = null;
        Node tailIterator = new Node();

        while (node != null) {
            int value = node.value;
            if (value <= x) {
                if (head == null) {
                    head = new Node(value);
                    headIterator = head;
                }else {
                    headIterator.next = new Node(value);
                    headIterator = headIterator.next;
                }
            } else {
                if (tail == null) {
                    tail = new Node(value);
                    tailIterator = tail;
                }else {
                    tailIterator.next = new Node(value);
                    tailIterator = tailIterator.next;
                }
            }
            node = node.next;
        }

        //combine
        headIterator.next = new Node(0);
        headIterator.next.next = tail;
        return head;
    }
}
