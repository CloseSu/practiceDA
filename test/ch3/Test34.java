package ch3;

import org.junit.jupiter.api.Test;

public class Test34 {
    @Test
    public void testTower() {
        int n = 3;
        Ch34[] ch34s = new Ch34[n];
        for (int i = 0; i < n; i++) {
            ch34s[i] = new Ch34(i);
        }

        for (int i = n - 1; i >=0; i--) {
            ch34s[0].add(i);
        }
        ch34s[0].moveDisks(n, ch34s[2], ch34s[1]);
    }

    @Test
    public void testHanoi() {
        new Hanoi().move(2, 'A', 'B', 'C');
    }
}
