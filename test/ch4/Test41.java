package ch4;

import org.junit.jupiter.api.Test;

public class Test41 {

    private Ch41 ch41 = new Ch41();

    @Test
    public void test41() {
        TreeNode root = new TreeNode();
        TreeNode left = new TreeNode();
        TreeNode right = new TreeNode();
        root.left = left;
        root.right = right;
        TreeNode left1 = new TreeNode();
        TreeNode right1 = new TreeNode();
        left.left = left1;
        left.right = right1;

        System.out.println(ch41.isBlanced(root));

        TreeNode left2 = new TreeNode();
        left1.left = left2;

        System.out.println(ch41.isBlanced(root));

    }
}
