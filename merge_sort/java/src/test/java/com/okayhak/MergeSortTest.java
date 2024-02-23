package com.okayhak;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {

    @Test
    public void TestMergeSort() {
        List<Integer> expected = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
        List<Integer> unsorted = Arrays.asList(70, 50, 30, 10, 20, 40, 60);
        List<Integer> sorted = MergeSort.sort(unsorted);
        assertEquals(expected, sorted);
    }

    @Test
    public void TestMergeSortEmptyArray() {
        List<Integer> empty = new ArrayList<>();
        List<Integer> sorted = MergeSort.sort(empty);
        assertEquals(empty, sorted);
    }

    @Test
    public void TestMergeSortSingleElementArray() {
        List<Integer> input = List.of(42);
        List<Integer> sorted = MergeSort.sort(input);
        assertEquals(input, sorted);
    }

    @Test
    public void TestMergeSortAlreadySorted() {
        List<Integer> input = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
        List<Integer> sorted = MergeSort.sort(input);
        assertEquals(input, sorted);
    }

    @Test
    public void TestMergeSortReverseSorted() {
        List<Integer> input = Arrays.asList(70, 60, 50, 40, 30, 20, 10);
        List<Integer> expected = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
        List<Integer> sorted = MergeSort.sort(input);
        assertEquals(expected, sorted);
    }

    @Test
    public void TestMergeSortDuplicateElements() {
        List<Integer> input = Arrays.asList(30, 50, 10, 20, 10, 30, 50);
        List<Integer> expected = Arrays.asList(10, 10, 20, 30, 30, 50, 50);
        List<Integer> sorted = MergeSort.sort(input);
        assertEquals(expected, sorted);
    }

    @Test
    public void TestMergeSortBigArray() {
        int size = 1000000;
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            input.add((int) (Math.random() * size * 10));
        }

        List<Integer> expected = new ArrayList<>(input);
        Collections.sort(expected);

        List<Integer> sorted = MergeSort.sort(input);
        assertEquals(expected, sorted);
    }


}
