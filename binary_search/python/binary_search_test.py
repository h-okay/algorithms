import unittest
from binary_search import binary_search


class TestBinarySearch(unittest.TestCase):
    def test_binary_search(self):
        test_cases = [
            ([1, 2, 3, 4, 5], 3, 2),  # Target in the middle
            ([1, 2, 3, 4, 5], 1, 0),  # Target at the beginning
            ([1, 2, 3, 4, 5], 5, 4),  # Target at the end
            ([1, 3, 5, 7, 9], 7, 3),  # Odd number of elements
            ([2, 4, 6, 8, 10, 12], 6, 2),  # Even number of elements
            ([1, 2, 3, 4, 5], 6, -1),  # Target not in the array
            ([], 10, -1),  # Empty array
        ]

        for array, target, expected in test_cases:
            result = binary_search(array, target)
            self.assertEqual(result, expected)


if __name__ == "__main__":
    unittest.main()
