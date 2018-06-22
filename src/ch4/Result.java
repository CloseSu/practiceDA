package ch4;

public class Result {
    TreeNode node;
    public  boolean isAncestor;
    public Result(TreeNode n, boolean isAncestor) {
        this.node = n;
        this.isAncestor = isAncestor;
    }
}
