package ch7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test74 {

    private Ch74 ch74 = new Ch74();

    @Test
    public void testMul() {
        assertEquals(15, ch74.mul(5, 3));
    }

    @Test
    public void testSub() {
        assertEquals(2, ch74.sub(5, 3));
    }

    @Test
    public void testDiv() {
        assertEquals(1, ch74.div(5, 3));
    }
}
