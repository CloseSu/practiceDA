package ch2;

import org.junit.jupiter.api.Test;

public class Test24 {

    private Chapter24 ch24 = new Chapter24();
    private Test21 t21 = new Test21();

    @Test
    public void test24() {
        Node node = t21.getList();
        t21.printNodes(node);
        System.out.println("after devide===================================");
        Node divided = ch24.divideNode(node, 7);
        t21.printNodes(divided);
    }
}
