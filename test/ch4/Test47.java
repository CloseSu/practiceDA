package ch4;

import org.junit.jupiter.api.Test;

public class Test47 {

    private Ch47 ch47 = new Ch47();

    private TreeNode[] getNode() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        node2.parent = node1;
        node3.parent = node1;
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node2.left = node4;
        node2.right = node5;
        node4.parent = node2;
        node5.parent = node2;
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node3.left = node6;
        node3.right = node7;
        node6.parent = node3;
        node7.parent = node3;

        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        node7.left = node8;
        node7.right = node9;
        node8.parent = node7;
        node9.parent = node7;


        return new TreeNode[]{node6, node9};
    }

    @Test
    public void test47() {
        TreeNode[] nodes = getNode();
        TreeNode parent = ch47.findParent(nodes[0], nodes[1]);
        System.out.println(parent.value);
    }


}
