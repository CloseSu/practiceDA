package ch3;

public class Ch34 {
    private Stack disks;
    private int index;

    public Ch34(int i) {
        disks = new Stack();
        index = i;
    }

    public int index() {
        return index;
    }

    public void add(int d) {
       disks.push(d);
    }

    public void moveTopTo(Ch34 t) {
        int top = disks.pop();
        t.add(top);
        System.out.println("Move disk " + top + " from " + index() + " to " + t.index());
    }

    public void moveDisks(int n, Ch34 destination, Ch34 buffer) {
        if (n > 0) {
            moveDisks(n-1, buffer, destination);
            moveTopTo(destination);
            buffer.moveDisks(n-1, destination, this);
        }
    }
}
