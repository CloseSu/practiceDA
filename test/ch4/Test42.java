package ch4;

import org.junit.jupiter.api.Test;

public class Test42 {

    private Ch42 ch42 = new Ch42();

    private TreeNode getNode() {
        TreeNode root = new TreeNode();
        root.value = 1;

        TreeNode layer11 = new TreeNode();
        layer11.value = 2;
        TreeNode layer12 = new TreeNode();
        layer12.value = 3;
        TreeNode layer13 = new TreeNode();
        layer13.value = 4;

        root.adjacent = new TreeNode[]{layer11, layer12, layer13};

        TreeNode layer21 = new TreeNode();
        layer21.value = 5;
        TreeNode layer22 = new TreeNode();
        layer22.value = 6;
        TreeNode layer23 = new TreeNode();
        layer23.value = 7;

        layer11.adjacent = new TreeNode[]{layer21, layer22, layer23};

        return root;
    }

    @Test
    public void testDFS() {
        TreeNode root = getNode();
        System.out.println(ch42.checkpath(root, new TreeNode(5)));
    }


    @Test
    public void testBFS() {
        TreeNode root = getNode();
        System.out.println(ch42.searchBFS(root, new TreeNode(5)));
    }
}
