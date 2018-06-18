package ch3;

import org.junit.jupiter.api.Test;

public class Test33 {
    private Ch33 ch33 = new Ch33();

    @Test
    public void testPush() {
        for (int i = 0; i < 25; i++) {
            ch33.push(i);
        }

        System.out.println(ch33.peek());
        System.out.println(ch33.stackIndex);
        System.out.println(ch33.stackcount);
    }

    @Test
    public void testPop() {
        for (int i = 1; i < 26; i++) {
            ch33.push(i);
        }

        for (int i = 1; i < 16; i++) {
            ch33.pop();
        }

        System.out.println(ch33.peek());
        System.out.println(ch33.stackIndex);
        System.out.println(ch33.stackcount);
    }
}
