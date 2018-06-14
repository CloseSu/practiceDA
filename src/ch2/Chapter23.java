package ch2;

public class Chapter23 {
    public Boolean removeNode(Node node) {
        if (node == null || node.next == null) {
            return false;
        }

        Node next = node.next;
        node.value = next.value;
        node.next = next.next;
        return true;
    }
}
