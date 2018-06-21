package ch4;

public class Ch45 {

    public Boolean checkBST(TreeNode root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean checkBST(TreeNode n, int min, int max) {
        if (n == null) {
            return true;
        }
        if (n.value <= min || n.value > max) {
            return false;
        }

        if (!checkBST(n.left, min, n.value) ||
            !checkBST(n.right, n.value, max)  ) {
            return false;
        }
        return true;
    }


}
