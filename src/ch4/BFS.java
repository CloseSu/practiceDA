package ch4;

public class BFS {

    public void search(TreeNode root) {
        Queue queue = new Queue();
        root.visited = true;
        visit(root);
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            TreeNode r = queue.dequeue();
            if (r.adjacent != null) {
                for (TreeNode n: r.adjacent) {
                    if (n.visited == false) {
                        visit(n);
                        n.visited = true;
                        queue.enqueue(n);
                    }
                }
            }
        }
    }

    public void visit(TreeNode root) {
        System.out.println(root.value);
        //TODO
    }
}
