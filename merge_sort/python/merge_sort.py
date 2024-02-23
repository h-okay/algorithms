from typing import List


def merge_sort(unsorted: List[int]) -> List[int]:
    if len(unsorted) <= 1:
        return unsorted

    mid = len(unsorted) // 2
    left = merge_sort(unsorted[:mid])
    right = merge_sort(unsorted[mid:])

    return merge(left, right)


def merge(left: List[int], right: List[int]) -> List[int]:
    result = []

    i = j = 0
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1

    result.extend(left[i:])
    result.extend(right[j:])
    return result
