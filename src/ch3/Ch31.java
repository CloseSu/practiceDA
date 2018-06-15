package ch3;

public class Ch31 {
    static int size = 30;
    static Integer[]  basic = new Integer[size];
    static Integer stack1Index = 0;
    static Integer stack2Index = 10;
    static Integer stack3Index = 20 ;


    private int getStackIndex(int stackNumber) {
        if (stackNumber == 1) {
            return stack1Index;
        } else if (stackNumber == 2) {
            return stack2Index;
        } else {
            return stack3Index;
        }
    }

    private void addStackIndex(int stackNumber) {
        if (stackNumber == 1) {
            stack1Index++;
        } else if (stackNumber == 2) {
            stack2Index++;
        } else {
            stack3Index++;
        }
    }

    private void subStackIndex(int stackNumber) {
        if (stackNumber == 1) {
            stack1Index--;
        } else if (stackNumber == 2) {
            stack2Index--;
        } else {
            stack3Index--;
        }
    }

    private void scaleUp(){
        int rawSize = size;
        size = size * 3;
        Integer[] newList = new Integer[size];
        int newStack1Index = 0;
        int newStack2Index = size / 3;
        int newStack3Index = size / 3 * 2;

        for(int i = 0; i < stack1Index; i++) {
            newList[newStack1Index++] = basic[i];
        }

        for(int i = rawSize/3; i < stack2Index; i++) {
            newList[newStack2Index++] = basic[i];
        }

        for(int i = rawSize/3 * 2; i < stack3Index; i++) {
            newList[newStack3Index++] = basic[i];
        }

        basic = newList;
        stack1Index = newStack1Index;
        stack2Index = newStack2Index;
        stack3Index = newStack3Index;

    }

    public void push(int number, int stackNumber) {
        int stackIndex = getStackIndex(stackNumber);

        if (basic[stackIndex] != null) {
            scaleUp();
        }
        basic[stackIndex] = number;
        addStackIndex(stackNumber);
    }

    public Integer pop(int stackNumber) {
        int stackIndex = getStackIndex(stackNumber);
        int realIndex = --stackIndex;
        if (basic[realIndex] != null) {
            int output = basic[realIndex];
            basic[realIndex] = null;
            subStackIndex(stackNumber);
            return output;
        }else {
            return null;
        }
    }

    public Integer peek(int stackNumber) {
        int stackIndex = getStackIndex(stackNumber);
        int realIndex = --stackIndex;
        return basic[realIndex];
    }

    public Integer[] getBasic() {
        return basic;
    }
}
