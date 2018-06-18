package ch3;

import org.junit.jupiter.api.Test;

public class TestTower {
    @Test
    public void testTower() {
        int n = 3;
        Tower[] towers  = new Tower[n];
        for (int i = 0; i < n; i++) {
            towers[i] = new Tower(i);
        }

        for (int i = n - 1; i >=0; i--) {
            towers[0].add(i);
        }
        towers[0].moveDisks(n, towers[2], towers[1]);
    }

    @Test
    public void testHanoi() {
        new Hanoi().move(2, 'A', 'B', 'C');
    }
}
