package ch2;

public class Chapter27 {

    private Chapter25 ch25 = new Chapter25();

    private int countNode(Node node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public Boolean checkPalindrome(Node node, Node node2) {
        int count = countNode(node);
        int half ;
        if (count % 2 !=0) {
            half = (count -1) / 2;
        } else {
            half = count / 2;
        }
        Node reversed = ch25.reverseNode(node2);

        for (int i = 0; i < half; i ++) {
            if (node.value != reversed.value) {
                return false;
            }
            node = node.next;
            reversed = reversed.next;
        }
        return true;

    }
}
