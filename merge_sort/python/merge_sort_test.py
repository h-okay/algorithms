import unittest
import random
import time
import copy
from merge_sort import merge_sort


class TestMergeSort(unittest.TestCase):

    def test_merge_sort(self):
        expected = [10, 20, 30, 40, 50, 60, 70]
        unsorted = [70, 50, 30, 10, 20, 40, 60]
        sorted_array = merge_sort(unsorted)
        self.assertEqual(sorted_array, expected)

    def test_merge_sort_empty_array(self):
        empty = []
        sorted_array = merge_sort(empty)
        self.assertEqual(sorted_array, [])

    def test_merge_sort_single_element_array(self):
        input_array = [42]
        sorted_array = merge_sort(input_array)
        self.assertEqual(sorted_array, input_array)

    def test_merge_sort_already_sorted_array(self):
        input_array = [10, 20, 30, 40, 50, 60, 70]
        sorted_array = merge_sort(input_array)
        self.assertEqual(sorted_array, input_array)

    def test_merge_sort_reverse_sorted_array(self):
        input_array = [70, 60, 50, 40, 30, 20, 10]
        expected = [10, 20, 30, 40, 50, 60, 70]
        sorted_array = merge_sort(input_array)
        self.assertEqual(sorted_array, expected)

    def test_merge_sort_duplicate_elements_array(self):
        input_array = [30, 50, 10, 20, 10, 30, 50]
        expected = [10, 10, 20, 30, 30, 50, 50]
        sorted_array = merge_sort(input_array)
        self.assertEqual(sorted_array, expected)

    def test_merge_sort_big_array(self):
        random.seed(time.time())
        size = 100000
        input_array = [random.randint(0, size * 10) for _ in range(size)]
        expected = sorted(copy.deepcopy(input_array))
        sorted_array = merge_sort(input_array)
        self.assertEqual(sorted_array, expected)


if __name__ == "__main__":
    unittest.main()
