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
}
