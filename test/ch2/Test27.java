package ch2;

import org.junit.jupiter.api.Test;

public class Test27 {

    private Chapter27 ch27 = new Chapter27();

    private Node getList() {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(4);
        Node node7 = new Node(3);
        Node node8 = new Node(2);
        Node node9 = new Node(1);

        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        return node;

    }

    @Test
    public void testPalindrone() {
        Node node = getList();
        Node node2 = getList();
        System.out.println(ch27.checkPalindrome(node, node2));
    }
}
