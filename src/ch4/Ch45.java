package ch4;

public class Ch45 {

    public Boolean checkBST(TreeNode root) {
        if (root.left != null) {
            if (root.left.value > root.value) {
                return false;
            }
            return checkBST(root.left);
        }
        if (root.right != null) {
            if (root.right.value <= root.value) {
                return false;
            }
            return checkBST(root.right);
        }
        return true;
    }
}
