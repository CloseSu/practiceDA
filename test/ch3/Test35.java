package ch3;

import org.junit.jupiter.api.Test;

public class Test35 {

    @Test
    public void testPush() {
        Ch35 ch35 = new Ch35();
        for (int i = 1; i <= 10; i++) {
            ch35.push(i);
        }

        System.out.println(ch35.peek());
    }

    @Test
    public void testPop() {
        Ch35 ch35 = new Ch35();
        for (int i = 1; i <= 10; i++) {
            ch35.push(i);
        }

        for (int i = 1; i <= 10; i ++ ) {
            System.out.println(ch35.pop());
        }
        System.out.println(ch35.peek());
    }
}
