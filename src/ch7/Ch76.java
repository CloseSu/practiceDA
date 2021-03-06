package ch7;

import java.util.LinkedList;
import java.util.Queue;

public class Ch76 {
    public   int remveMin(Queue<Integer> q) {
        int min = q.peek();
        for (Integer v: q) {
            if (min > v) {
                min = v;
            }
        }
        while (q.contains(min)) {
            q.remove(min);
        }
        return min;
    }

    public  void addProducts(Queue<Integer> q, int v) {
        q.add(v * 3);
        q.add(v * 5);
        q.add(v * 7);
    }

    public  int getKthMagicNumber(int k) {
        if (k < 0) return 0;
        int val = 1;
        Queue<Integer> q = new LinkedList<>();
        addProducts(q,1);
        for (int i = 0; i < k; i++) {
            val = remveMin(q);
            addProducts(q, val);
        }
        return val;
    }
}
