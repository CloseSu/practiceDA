package ch4;

public class Ch47 {

    public TreeNode findParent(TreeNode node1, TreeNode node2) {
        while (node1.parent != null) {
            TreeNode parent1 = node1.parent;
            while (node2.parent != null) {
                TreeNode parent2 = node2.parent;
                if (parent1.value == parent2.value) {
                    return parent2;
                } else {
                    node2 = node2.parent;
                }
            }
            node1 = node1.parent;
        }
        return null;
    }

    Result commonAncestorHelper(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return new Result(null, false);
        }
        if (root == p && root == q) {
            return new Result(root, true);
        }

        Result rx = commonAncestorHelper(root.left, p, q);
        if (rx.isAncestor) {
            return rx;
        }

        Result ry = commonAncestorHelper(root.right, p, q);
        if (ry.isAncestor) {
            return ry;
        }

        if (rx.node != null && ry.node != null) {
            return new Result(root, true);
        } else if (root == p || root == q) {
            boolean isAnscetor = rx.node != null || ry.node != null ? true : false;
            return new Result(root, isAnscetor);
        } else {
            return new Result(rx.node != null ? rx.node : ry.node, false);
        }
    }

    TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Result r = commonAncestorHelper(root, p, q);
        if (r.isAncestor) {
            return  r.node;
        }
        return null;
    }
}
