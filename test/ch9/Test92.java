package ch9;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class Test92 {
    private Ch92 ch92 = new Ch92();

    @Test
    public void test92() {
        System.out.println(ch92.moveBoard(2,2, new HashMap<Point, Integer>(), new HashMap<Point, Boolean>()));
    }
}
