package com.okayhak;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static List<Integer> sort(List<Integer> unsortedArray) {
        if (unsortedArray.size() <= 1) {
            return unsortedArray;
        }

        int mid = unsortedArray.size() / 2;
        List<Integer> left = sort(unsortedArray.subList(0, mid));
        List<Integer> right = sort(unsortedArray.subList(mid, unsortedArray.size()));

        return merge(left, right);
    }

    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}
