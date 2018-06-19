package ch3;

import org.junit.jupiter.api.Test;

public class Test36 {

    @Test
    public void test36() {
        Ch36 ch36 = new Ch36();
        int[] values = new int[]{5,2,3,4,1,8,9,6,7};
        for (int i = 0; i < values.length; i++) {
            ch36.push(values[i]);
        }

        for (int i = 0; i < values.length; i++) {
            System.out.println(ch36.pop());
        }

        System.out.println(ch36.isEmpty());
    }

    @Test
    public void testSort() {
        Stack stack = new Stack();
        int[] values = new int[]{5,2,3,4,1,8,9,6,7};
        for (int i = 0; i < values.length; i++) {
            stack.push(values[i]);
        }

        stack = new Ch36().sort(stack);
        for (int i = 0; i < values.length; i++) {
            System.out.println(stack.pop());
        }
    }
}
