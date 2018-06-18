package ch3;

public class Tower {
    private Stack disks;
    private int index;

    public Tower(int i) {
        disks = new Stack();
        index = i;
    }

    public int index() {
        return index;
    }

    public void add(int d) {
       disks.push(d);
    }

    public void moveTopTo(Tower t) {
        int top = disks.pop();
        t.add(top);
        System.out.println("Move disk " + top + " from " + index() + " to " + t.index());
    }

    public void moveDisks(int n, Tower destination, Tower buffer) {
        if (n > 0) {
            moveDisks(n-1, buffer, destination);
            moveTopTo(destination);
            buffer.moveDisks(n-1, destination, this);
        }
    }
}
