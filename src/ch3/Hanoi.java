package ch3;

public class Hanoi {
    public void move(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("move " + n + " from " + a + " to " + c);
        } else {
            move(n-1, a, c, b);
            System.out.println("move " + n + " from " + a + " to " + c);
            move(n-1, b, a, c);
        }
    }
}
