package ch4;

public class DFS {

    public void search(TreeNode root) {
        if (root == null) return;
        visit(root);
        root.visited = true;
        for (TreeNode n: root.adjacent) {
            if (n.visited == false) {
                search(n);
            }
        }
    }

    public void visit(TreeNode root) {
        //TODO
    }
}
