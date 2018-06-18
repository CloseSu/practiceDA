package ch3;

import java.util.ArrayList;
import java.util.List;

public class Ch33 {
    public int stackSize = 10;
    public List<Stack> stackList= new ArrayList();
    public int stackIndex = 0;
    public int stackcount = 0;

    public void push(int value) {
        if (stackIndex == 0 && stackcount == 0) {
            stackList.add(new Stack());
        }
        if (stackcount == stackSize){
            stackIndex++;
            stackcount = 0;
            stackList.add(new Stack());
        }
        stackList.get(stackIndex).push(value);
        stackcount++;
    }

    public Integer pop() {
       Integer value;
       Stack stack = stackList.get(stackIndex);
       if (stack == null) {
           return null;
       }
       value = stack.pop();
       if (value != null) {
           stackcount--;
       }

       if (stackcount == 0) {
           stackList.remove(stackIndex);
           stackIndex--;
           stackcount = 10;
       }

       return value;
    }

    public Integer peek() {
        return stackList.get(stackIndex).peek();
    }


}
