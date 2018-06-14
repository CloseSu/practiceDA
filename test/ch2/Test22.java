package ch2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test22 {

    private Chapter22 ch22 = new Chapter22();
    private Test21 ts21 = new Test21();

    @Test
    public void testRecursive() {
        Node node = ts21.getList();
        Node getK = ch22.getReverseNodeRecursive(node, 4, new IntWrapper());
        assertEquals(2, getK.value);
    }

    @Test
    public void testIterative() {
        Node node = ts21.getList();
        Node getK = ch22.getReverseNodeIterative(node, 4);
        assertEquals(2, getK.value);
    }
}
