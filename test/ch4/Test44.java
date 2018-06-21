package ch4;

import ch2.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Test44 {

    private Ch43 ch43 = new Ch43();
    private Ch44 ch44 = new Ch44();

    @Test
    public void test44() {
        int[] data = new int[]{1,2,3,4,5,6,7,8,9};
        TreeNode root = ch43.createMinimalBST(data);
        List<Node> nodes = ch44.getNodes(root);

        for (Node n: nodes) {
            while (n!= null) {
                System.out.println(n.value);
                n = n.next;
            }
            System.out.println("=========================");
        }
    }
}
