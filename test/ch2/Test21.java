package ch2;

import org.junit.jupiter.api.Test;


public class Test21 {

    private  Chapter21 ch21 = new Chapter21();

    private Node getList(){
        Node node = new Node(7);
        Node node2 = new Node(8);
        Node node3 = new Node(9);
        Node node4 = new Node(7);
        Node node5 = new Node(7);
        Node node6 = new Node(2);
        Node node7 = new Node(7);
        Node node8 = new Node(4);
        Node node9 = new Node(6);

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

    private void printNodes(Node node){
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    @Test
    public void test(){
        Node node = getList();
        printNodes(node);
        System.out.println("after remove repeat1");
        Node after = ch21.removeRepeat(node);
        printNodes(after);
    }

    @Test
    public void test2(){
        Node node = getList();
        printNodes(node);
        System.out.println("after remove repeat2");
        ch21.removeRepeatWithoutTemp(node);
        printNodes(node);
    }

}
