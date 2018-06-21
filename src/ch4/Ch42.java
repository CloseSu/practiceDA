package ch4;

public class Ch42 {

    public int search(TreeNode root, TreeNode target, Integer result) {
        if (root == null) return result;
        result += visit(root, target);
        root.visited = true;
        if (root.adjacent != null) {
            for (TreeNode n: root.adjacent) {
                if (n.visited == false) {
                    result += search(n, target, result);
                }
            }
        }
        return result;
    }

    public int visit(TreeNode root, TreeNode target) {
        if (target.value == root.value) {
            return 1;
        }
        return 0;
    }

    public boolean checkpath(TreeNode root, TreeNode target) {
        return search(root, target, 0) > 0 ;
    }
}
