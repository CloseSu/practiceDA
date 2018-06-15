package ch2;

import org.junit.jupiter.api.Test;

public class Test26 {

    private Chapter26 ch26 = new Chapter26();

    private Node getList() {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);

        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node4;

        return node;

    }

    @Test
    public void test26() {
        Node node = getList();
        Node findbeginning = ch26.findeBeginning(node);
        System.out.println(findbeginning.value);
    }
}
