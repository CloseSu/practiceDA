package ch4;

public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;
    public TreeNode next;
    public boolean visited = false;
    public TreeNode[] adjacent;

    public TreeNode() {

    }

    public TreeNode(int value) {
        this.value = value;
    }

}
