package ch4;

import org.junit.jupiter.api.Test;

public class Test45 {

    private Ch45 ch45 = new Ch45();
    private Ch43 ch43 = new Ch43();

    @Test
    public void test45() {
        int[] data = new int[]{1,2,3,4,5,6,7,8,9};
        TreeNode root = ch43.createMinimalBST(data);
        System.out.println(ch45.checkBST(root));
    }
}
