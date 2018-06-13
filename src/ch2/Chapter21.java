package ch2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Chapter21 {

    public Node removeRepeat(Node node){
        Map<Integer, Integer> temp = new HashMap<>();
        Node previous = null;
        Node key = null;
        while (node != null){
          if (temp.get(node.value) == null) {
              temp.put(node.value, node.value);
              if (previous == null){
                  previous = new Node(node.value);
                  key = previous;
              } else {
                  key.next = new Node(node.value);
                  key = key.next;
              }

          }
          node = node.next;
        }
        return previous;
    }

    public void removeRepeatWithoutTemp(Node node) {
        while (node != null && node.next != null) {
            int value = node.value;
            while (node.next != null && node.next.next != null) {
                int valueNext = node.next.value;
                System.out.println("value: " + value + " next value " + valueNext);
                if (value == valueNext) {
                    node.next = node.next.next;
                }
                node = node.next;
            }
            node = node.next;
        }
    }

}
