package ch2;

import org.junit.jupiter.api.Test;

public class Test23 {
    private Chapter23 ch23 = new Chapter23();
    private Test21 t21 = new Test21();

    @Test
    public void test23() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        t21.printNodes(node1);
        System.out.println("after delete================");
        ch23.removeNode(node3);
        t21.printNodes(node1);
    }
}
