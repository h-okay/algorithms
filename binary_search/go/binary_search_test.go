package binary_search

import (
	"sort"
	"testing"
)

func TestBinarySearch(t *testing.T) {
	testCases := []struct {
		arr     []int
		target  int
		expects int
	}{
		{[]int{1, 2, 3, 4, 5}, 3, 2},      // Target in the middle
		{[]int{1, 2, 3, 4, 5}, 1, 0},      // Target at the beginning
		{[]int{1, 2, 3, 4, 5}, 5, 4},      // Target at the end
		{[]int{1, 3, 5, 7, 9}, 7, 3},      // Odd number of elements
		{[]int{2, 4, 6, 8, 10, 12}, 6, 2}, // Even number of elements
		{[]int{1, 2, 3, 4, 5}, 6, -1},     // Target not in the array
		{[]int{}, 10, -1},                 // Empty array
	}

	for _, testCase := range testCases {
		t.Logf("Running test case: Searching for %d in %v", testCase.target, testCase.arr)
		sort.Ints(testCase.arr) // Ensure array is sorted
		result := BinarySearch(testCase.arr, testCase.target)
		if result != testCase.expects {
			t.Logf("Expected index %d, got %d", testCase.expects, result)
		}
	}
}
