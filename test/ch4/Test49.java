package ch4;

import org.junit.jupiter.api.Test;

public class Test49 {

    private Ch49 ch49 = new Ch49();
    private Test47 test47 = new Test47();

    @Test
    public void test491() {
        TreeNode root = test47.getNode()[0];
        System.out.println(ch49.printandSum(root));

    }
}
