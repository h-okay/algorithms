package com.okayhak;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int expected = 2; // Index of target in the array

        int result = BinarySearch.binarySearch(array, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchNotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6; // Target not in the array
        int expected = -1; // Target not found

        int result = BinarySearch.binarySearch(array, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] array = {};
        int target = 10; // Target not in the empty array
        int expected = -1; // Empty array

        int result = BinarySearch.binarySearch(array, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchDuplicateElements() {
        int[] array = {1, 2, 2, 3, 4, 5};
        int target = 2;
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);

        int result = BinarySearch.binarySearch(array, target);
        assertTrue(expected.contains(result));
    }

    @Test
    public void testBinarySearchLargeArray() {
        int[] array = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            array[i] = i;
        }
        int target = 999999; // Last element in the array
        int expected = 999999; // Index of target in the array

        int result = BinarySearch.binarySearch(array, target);
        assertEquals(expected, result);
    }
}
