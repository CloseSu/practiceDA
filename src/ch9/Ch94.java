package ch9;

import java.util.ArrayList;
import java.util.List;

public class Ch94 {

    public  ArrayList<ArrayList<Integer>> getSet(ArrayList<Integer> set, int index) {
        ArrayList<ArrayList<Integer>> allsets;
        if (set.size() == index) {
            allsets = new ArrayList<>();
            allsets.add(new ArrayList<>());
        } else {
            allsets = getSet(set, index + 1);
            int item = set.get(index);
            ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<>();
            for (ArrayList<Integer> subest: allsets) {
                ArrayList<Integer> newSubset = new ArrayList<>();
                newSubset.addAll(subest);
                newSubset.add(item);
                moresubsets.add(newSubset);
            }
            allsets.addAll(moresubsets);
        }
        return allsets;
    }
}
