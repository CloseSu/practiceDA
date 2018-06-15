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

    public Result isPalindromeRecursive(Node head, int length) {
        if (head == null || length == 0) {
            return new Result(null, true);
        } else if (length == 1){
            return new Result(head.next, true);
        } else if (length == 2) {
            return new Result(head.next.next, head.value == head.next.value);
        }
        Result res = isPalindromeRecursive(head.next, length -2);
        if (!res.result || res.node == null) {
            return res;
        } else {
            res.result = head.value == res.node.value;
            res.node = res.node.next;
            return res;
        }
    }

    public boolean isPalindrome(Node head, int length) {
        Result p = isPalindromeRecursive(head, length);
        return p.result;
    }
}
