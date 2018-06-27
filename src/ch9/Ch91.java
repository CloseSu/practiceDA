package ch9;

public class Ch91 {

    public Integer getStep(int n) {
        int result = 0;
        if (n == 0) {
            result =  1;
        }
        if (n > 0) {
            result =  getStep(n - 1) + getStep(n - 2) + getStep(n - 3);
        }
        return result;
    }
}
