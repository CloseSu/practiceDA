package ch4;

import ch2.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ch44 {

    public void getAllNodes(TreeNode root, List<Node> nodeList) {
        if (root == null) return;
        Node temp = nodeList.get(nodeList.size() - 1);

        if (root.left != null) {
            temp.next = new Node(root.left.value);
            temp = temp.next;
        }

        if (root.right != null) {
            temp.next = new Node(root.right.value);
            temp = temp.next;
        }
        nodeList.add(temp);
        getAllNodes(root.left, nodeList);
        getAllNodes(root.right, nodeList);
    }

    public List<Node> getNodes(TreeNode root){
        Node rootNode = new Node(root.value);
        List<Node> nodeList = new ArrayList<>();
        nodeList.add(rootNode);
        getAllNodes(root, nodeList);
        return nodeList;
    }

    public ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<>();
        LinkedList<TreeNode> current = new LinkedList<>();
        if (root != null) {
            current.add(root);
        }

        while (current.size() > 0) {
            result.add(current);
            LinkedList<TreeNode> parents = current;
            current = new LinkedList<>();
            for (TreeNode parent: parents){
                if (parent.left != null) {
                    current.add(parent.left);
                }
                if (parent.right != null) {
                    current.add(parent.right);
                }
            }
        }
        return result;
    }
}
