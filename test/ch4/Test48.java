package ch4;

import org.junit.jupiter.api.Test;

public class Test48 {

    private Ch48 ch48 = new Ch48();
    private Test47 test47 = new Test47();

    @Test
    public void test48() {
        TreeNode[] nodes = test47.getNode();
        System.out.println(ch48.containTree(nodes[0], nodes[1]));
    }
}
