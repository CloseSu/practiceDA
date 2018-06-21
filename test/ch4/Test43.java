package ch4;

import org.junit.jupiter.api.Test;

public class Test43 {

    private Ch43 ch43 = new Ch43();
    private BFS bfs = new BFS();

    @Test
    public void test43() {
        int[] data = new int[]{1,2,3,4,5,6,7,8,9};
        TreeNode root = ch43.createMinimalBST(data);
        System.out.println(root.value);

    }
}
