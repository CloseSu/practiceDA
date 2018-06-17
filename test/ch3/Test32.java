package ch3;

import org.junit.jupiter.api.Test;

public class Test32 {
    private Ch32 ch32 = new Ch32();

    @Test
    public void test32() {
        ch32.push(5);
        System.out.println(ch32.min());
        ch32.push(3);
        System.out.println(ch32.min());
        ch32.push(6);
        System.out.println(ch32.min());
        ch32.push(4);
        System.out.println(ch32.min());
        ch32.push(2);
        System.out.println(ch32.min());
        ch32.push(1);
        System.out.println(ch32.min());
    }

}
