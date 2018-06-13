package ch2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Chapter21 {

    public void removeRepeat(Node node){
        Map<Integer, Integer> temp = new HashMap<>();
        temp.put(node.value, node.value);
        while (node != null && node.next != null){
            if (temp.get(node.next.value) != null) {
                node.next = node.next.next;
            }
            temp.put(node.value, node.value);
            node = node.next;
        }
    }

}
