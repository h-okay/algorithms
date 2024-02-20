package depth_first_search

import (
	"reflect"
	"testing"
)

func TestDFS(t *testing.T) {
	graph := NewGraph()
	graph.AddEdge(0, 1)
	graph.AddEdge(0, 2)
	graph.AddEdge(1, 3)
	graph.AddEdge(2, 4)

	expectedTraversal := []int{0, 1, 3, 2, 4}
	var traversal []int
	DFS(graph, 0, make(map[int]bool), &traversal)

	if !reflect.DeepEqual(traversal, expectedTraversal) {
		t.Errorf("DFS traversal incorrect, got: %v, want: %v", traversal, expectedTraversal)
	}
}
func TestDisconnectedDFS(t *testing.T) {
	graph := NewGraph()
	graph.AddEdge(0, 1)
	graph.AddEdge(0, 2)
	graph.AddEdge(1, 3)
	graph.AddEdge(2, 4)
	graph.AddEdge(4, 5)
	graph.AddEdge(6, 7)
	graph.AddEdge(7, 8)
	graph.AddEdge(8, 9)
	graph.AddEdge(6, 9)
	graph.AddEdge(7, 9)

	expectedTraversal1 := []int{0, 1, 3, 2, 4, 5}
	expectedTraversal2 := []int{6, 7, 8, 9}
	var traversal1 []int
	var traversal2 []int
	DFS(graph, 0, make(map[int]bool), &traversal1)
	DFS(graph, 6, make(map[int]bool), &traversal2)

	if !reflect.DeepEqual(traversal1, expectedTraversal1) {
		t.Errorf("DFS traversal incorrect, got: %v, want: %v", traversal1, expectedTraversal1)
	}

	if !reflect.DeepEqual(traversal2, expectedTraversal2) {
		t.Errorf("DFS traversal incorrect, got: %v, want: %v", traversal2, expectedTraversal2)
	}
}
