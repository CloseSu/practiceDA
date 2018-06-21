package ch4;


import java.util.LinkedList;

public class Ch42 {

    public int searchDFS(TreeNode root, TreeNode target, Integer result) {
        if (root == null) return result;
        result += visit(root, target);
        root.visited = true;
        if (root.adjacent != null) {
            for (TreeNode n: root.adjacent) {
                if (n.visited == false) {
                    result += searchDFS(n, target, result);
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
        return searchDFS(root, target, 0) > 0 ;
    }

    public boolean searchBFS(TreeNode root, TreeNode target) {
        LinkedList<TreeNode> q = new LinkedList<>();
        root.visited = true;
        q.add(root);
        TreeNode u;
        while (!q.isEmpty()) {
            u = q.removeFirst();
            if (u != null) {
                if( u.adjacent != null) {
                    for (TreeNode v: u.adjacent) {
                        if (v.visited == false) {
                            if (v.value == target.value) {
                                return true;
                            } else {
                                v.visited = true;
                                q.add(v);
                            }
                        }
                    }
                }
                u.visited = true;
            }
        }
        return false;
    }

}
