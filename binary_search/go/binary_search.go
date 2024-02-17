package binary_search

func BinarySearch(array []int, target int) int {
	low, high := 0, len(array)-1

	for low <= high {
		mid := (low + high) / 2

		if target == array[mid] {
			return mid
		}

		if target < array[mid] {
			high = mid - 1
		}

		if target > array[mid] {
			low = mid + 1
		}

	}
	return -1
}
