package ch3;

import org.junit.jupiter.api.Test;

public class Test31 {

    private Ch31 ch31 = new Ch31();

    private void printList(Integer[] basic) {
        for (int i = 0; i < basic.length; i++) {
            System.out.println(basic[i]);
        }
    }

    @Test
    public void test31() {
        for (int i = 1; i<= 11; i++){
            for (int j = 1; j <=3; j++) {
                ch31.push(i,j);
            }
        }
        Integer[] data = ch31.getBasic();

        System.out.println(ch31.peek(1));
        System.out.println(ch31.peek(2));
        System.out.println(ch31.peek(3));
        System.out.println("=======================");
        System.out.println(ch31.pop(1));
        System.out.println(ch31.peek(1));
        printList(data);
    }
}
