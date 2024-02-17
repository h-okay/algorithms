from typing import List


def binary_search(array: List[int], target: int) -> int:
    low, high = 0, len(array) - 1

    while low <= high:
        mid = (low + high) // 2

        if target == array[mid]:
            return mid

        if target < array[mid]:
            high = mid - 1

        if target > array[mid]:
            low = mid + 1

    return -1


def test_binary_search():
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
        assert (
            result == expected
        ), f"For array {array}, expected index {expected} but got {result}"

    print("All test cases passed!")


if __name__ == "__main__":
    test_binary_search()
