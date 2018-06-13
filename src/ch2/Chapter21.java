package ch2;

import java.util.HashMap;
import java.util.Map;

public class Chapter21 {

    public void removeRepeat(Node node){
        Map<Integer, Integer> temp = new HashMap<>();
        Node previous = null;
        while (node != null) {
            if(temp.get(node.value) != null) {
                previous.next = node.next;
            } else {
                temp.put(node.value, node.value);
                previous = node;
            }
            node = node.next;
        }

    }

    public void removeRepeatWithoutTemp(Node node) {
        Node current = node;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }

            }
            current = current.next;
        }

    }

}
