package ch7;

public class Ch74 {

    public int mul(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    public int sub(int a, int b) {
        for (int i = 0; i < a; i++) {
            if (i + b == a) {
                return i;
            }
        }
        return -1;
    }

    public int div(int a, int b) {
        int result = 0;
        int tempA = a;
        for (int i = 0; i < a; i++) {
            tempA = sub(tempA,b);
            if (tempA > 0) {
                result++;
            }else {
               break;
            }
        }
        return result;    }
}
