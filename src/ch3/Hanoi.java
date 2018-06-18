package ch3;

public class Hanoi {
    public void move(int n, char origin, char destination, char buffer) {
        if (n == 1) {
            System.out.println("move " + n + " from " + origin + " to " + buffer);
        } else {
            move(n-1, origin, buffer, destination);
            System.out.println("move " + n + " from " + origin + " to " + buffer);
            move(n-1, destination, origin, buffer);
        }
    }
}
