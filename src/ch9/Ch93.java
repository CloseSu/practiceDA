package ch9;

public class Ch93 {

    public int findMagic(int[] list) {
        for (int i = 0; i <list.length; i++) {
            if (list[i] == i) {
                return i;
            }
        }
        return -1;
    }

    public int magicFast(int[] array, int start, int end) {
        if (end < start || start <0 || end >= array.length) {
            return -1;
        }
        int midIndex = (start + end) / 2;
        int midValue = array[midIndex];
        if (midIndex == midValue) {
            return midIndex;
        }

        int leftIndex = Math.min(midIndex - 1, midValue);
        int left = magicFast(array, start, leftIndex);
        if (left >= 0) {
            return left;
        }

        int rightIndex = Math.max(midIndex + 1, midValue);
        int right = magicFast(array, rightIndex, end);
        return right;
    }

    public int magicFast(int[] array) {
        return magicFast(array, 0, array.length -1);
    }
}
