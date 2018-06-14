package ch2;

import org.junit.jupiter.api.Test;

public class Test25 {

    private Test21 t21 = new Test21();
    private Chapter25 c25 = new Chapter25();

    private Node getNode(int[] numList) {
        Node node = null;
        Node nodeIterator = null;
        for (int i = 0; i < numList.length; i++) {
            if (node == null) {
                node = new Node(numList[i]);
                nodeIterator = node;
            } else {
                nodeIterator.next = new Node(numList[i]);
                nodeIterator = nodeIterator.next;
            }
        }
        return node;
    }

    public void testNode(Node node1,  Node node2){
        t21.printNodes(node1);
        System.out.println("=");
        t21.printNodes(node2);
        System.out.println("after process=====");
        Node added = c25.NodeAdd(node1, node2);
        t21.printNodes(added);
    }

    @Test
    public void test1Case1() {
        Node node1 = getNode(new int[]{8,7,9});
        Node node2 = getNode(new int[]{3,4,5});
        testNode(node1, node2);
    }

    @Test
    public void testCase2() {
        Node node1 = getNode(new int[]{8,7,9,1,5});
        Node node2 = getNode(new int[]{3,4,5});
        testNode(node1, node2);
    }
}
