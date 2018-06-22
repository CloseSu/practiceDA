package ch4;

public class Ch49 {

    public Integer printandSum(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            System.out.println(root.value);
            Integer left = printandSum(root.left);
            Integer right = printandSum(root.right);
            return left + right;
        }
    }

    public void findSum(TreeNode node, int sum, int[] path, int level) {
        if (node == null) {

        }

        path[level] = node.value;

        int t = 0;
        for (int i = level; i >=0; i--) {
            t += path[i];
            if (t == sum) {
                print(path, i, level);
            }
        }
        findSum(node.left, sum, path, level + 1);
        findSum(node.right, sum, path, level + 1);

        path[level] = Integer.MIN_VALUE;

    }

    public void findSum(TreeNode node, int sum) {
        int depth = depth(node);
        int[] path = new int[depth];
        findSum(node, sum, path, 0);
    }

    public int depth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(depth(node.left), depth(node.right));
        }
    }


    public void print(int[] path, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println();
    }
}
