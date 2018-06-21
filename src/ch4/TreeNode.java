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


    public void printTree(TreeNode root){
        if (root == null) { return;}
        System.out.print(root.value );
        if (root.left != null){
            System.out.print(" left: " + root.left.value);
        }
        if (root.right != null) {
            System.out.print(" right: " + root.right.value);
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }
}
