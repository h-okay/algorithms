package merge_sort

import (
	"math/rand"
	"reflect"
	"sort"
	"testing"
	"time"
)

func TestMergeSort(t *testing.T) {
	expected := []int{10, 20, 30, 40, 50, 60, 70}
	unsorted := []int{70, 50, 30, 10, 20, 40, 60}
	sorted := MergeSort(unsorted)
	if !reflect.DeepEqual(sorted, expected) {
		t.Errorf("Sorting is incorrect, got: %v, want: %v", sorted, expected)
	}
}

func TestMergeSort_EmptyArray(t *testing.T) {
	var empty []int
	sorted := MergeSort(empty)
	if len(sorted) != 0 {
		t.Error("Expected empty array, got:", sorted)
	}
}

func TestMergeSort_SingleElementArray(t *testing.T) {
	input := []int{42}
	sorted := MergeSort(input)
	if !reflect.DeepEqual(sorted, input) {
		t.Error("Expected:", input, "got:", sorted)
	}
}

func TestMergeSort_AlreadySortedArray(t *testing.T) {
	input := []int{10, 20, 30, 40, 50, 60, 70}
	sorted := MergeSort(input)
	if !reflect.DeepEqual(sorted, input) {
		t.Error("Expected:", input, "got:", sorted)
	}
}

func TestMergeSort_ReverseSortedArray(t *testing.T) {
	input := []int{70, 60, 50, 40, 30, 20, 10}
	expected := []int{10, 20, 30, 40, 50, 60, 70}
	sorted := MergeSort(input)
	if !reflect.DeepEqual(sorted, expected) {
		t.Error("Expected:", expected, "got:", sorted)
	}
}

func TestMergeSort_DuplicateElementsArray(t *testing.T) {
	input := []int{30, 50, 10, 20, 10, 30, 50}
	expected := []int{10, 10, 20, 30, 30, 50, 50}
	sorted := MergeSort(input)
	if !reflect.DeepEqual(sorted, expected) {
		t.Error("Expected:", expected, "got:", sorted)
	}
}

func TestMergeSort_BigArray(t *testing.T) {
	rand.New(rand.NewSource(time.Now().UnixNano()))

	const size = 1000000
	input := make([]int, size)
	for i := range input {
		input[i] = rand.Intn(size * 10)
	}

	expected := make([]int, len(input))
	copy(expected, input)
	sort.Ints(expected)
	sorted := MergeSort(input)
	if !reflect.DeepEqual(sorted, expected) {
		t.Error("Sorting big array failed")
	}
}
