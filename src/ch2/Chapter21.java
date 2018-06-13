package ch2;

import java.util.HashMap;
import java.util.Map;

public class Chapter21 {

    public Node removeRepeat(Node node){
        Map<Integer, Integer> temp = new HashMap<>();
        Node output = null;
        Node iterator = null;
        while (node != null){
          if (temp.get(node.value) == null) {
              temp.put(node.value, node.value);
              if (output == null){
                  output = new Node(node.value);
                  iterator = output;
              } else {
                  iterator.next = new Node(node.value);
                  iterator = iterator.next;
              }

          }
          node = node.next;
        }
        return output;
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
