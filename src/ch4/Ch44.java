package ch4;

import ch2.Node;

import java.util.ArrayList;
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
}
