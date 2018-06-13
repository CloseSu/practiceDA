package ch2;

import ch2.Chapter21;
import ch2.Node;
import org.junit.jupiter.api.Test;


public class Test21 {

    private  Chapter21 ch21 = new Chapter21();

    private Node getList(){
        Node node = new Node(7);
        Node node2 = new Node(8);
        Node node3 = new Node(9);
        Node node4 = new Node(7);
        Node node5 = new Node(5);
        Node node6 = new Node(2);
        Node node7 = new Node(7);

        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        return node;
    }

    private void printNodes(Node node){
        while (node.next != null) {
            System.out.println(node.value);
            node = node.next;
        }
        System.out.println(node.value);
    }

    @Test
    public void test(){
        Node node = getList();
        printNodes(node);
        System.out.println("after remove repeat");
        ch21.removeRepeat(node);
        printNodes(node);
    }


}
