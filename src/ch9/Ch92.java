package ch9;

import java.util.Map;

public class Ch92 {

    public Integer moveBoard(int x, int y,Map<Point, Integer> chache, Map<Point, Boolean> forbid) {

        if (forbid.get(new Point(x, y)) != null && forbid.get(new Point(x, y)) == true) {
            return 0;
        }
        if (chache.get(new Point(x,y)) != null) {
            return chache.get(new Point(x,y));
        }

        if (x < 0 || y < 0) {
            return 0;
        }

        if (x == 0 && y == 0) {
            return 1;
        }
        Integer step =  moveBoard(x -1, y, chache, forbid) + moveBoard(x, y-1, chache, forbid);
        chache.put(new Point(x,y), step);
        return step;
    }
}
