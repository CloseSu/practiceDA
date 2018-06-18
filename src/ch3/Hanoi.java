package ch3;

public class Hanoi {
    public void move(int n, char origin, char buffer, char destination) {
        if (n == 1) {
            System.out.println("move " + n + " from " + origin + " to " + destination);
        } else {
            move(n-1, origin, destination, buffer);
            System.out.println("move " + n + " from " + origin + " to " + destination);
            move(n-1, buffer, origin, destination);
        }
    }
}
