package ch2;

public class Chapter25 {

    private int getValue(Node n) {
        return n == null ? 0 : n.value;
    }

    public Node NodeAdd(Node a, Node b) {
        if (a == null || b == null) return null;
        Node output = null;
        Node outputIterator = null;
        int carry = 0;

        while (a != null || b != null || carry > 0) {
            int sum = getValue(a) + getValue(b) + carry;
            carry = 0;
            int left ;
            if (sum / 10 > 0) {
                carry ++;
                left = sum % 10;
            } else {
                left = sum;
            }
            if (output == null) {
                output = new Node(left);
                outputIterator = output;
            } else {
                outputIterator.next = new Node(left);
                outputIterator = outputIterator.next;
            }
            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }

        return output;
    }

    public Node reverseNode(Node node) {
        Node temp = null;

        while (node != null) {
            Node next = node.next;
            node.next = temp;
            temp = node;
            node = next;
        }
        return temp;
    }

    public Node NodeAddNoReverse(Node a, Node b) {
        Node reversedA = reverseNode(a);
        Node reversedB = reverseNode(b);
        Node added = NodeAdd(reversedA, reversedB);
        return reverseNode(added);

    }

    public Node addNodeRecursive(Node l1, Node l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) return null;

        Node result = new Node(carry);

        int value = carry;
        if (l1 != null) {
            value += l1.value;
        }
        if (l2 != null) {
            value += l2.value;
        }

        result.value = value % 10 ;

        if (l1 != null || l2 != null || value >= 10) {
            Node more = addNodeRecursive(l1 == null ? null : l1.next,
                                         l2 == null ? null : l2.next,
                                         value >= 10 ? 1 : 0);
            result.next = more;
        }
        return result;
    }
}
