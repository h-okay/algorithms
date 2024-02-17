package com.okayhak;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }

        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == array[mid]) {
                return mid;
            }
            if (target < array[mid]) {
                high = mid - 1;
            }
            if (target > array[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
