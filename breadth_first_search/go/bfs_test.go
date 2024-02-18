package breadth_first_search

import (
	"reflect"
	"testing"
)

func TestBFS(t *testing.T) {
	graph := NewGraph()
	graph.AddEdge(0, 1)
	graph.AddEdge(0, 2)
	graph.AddEdge(1, 2)
	graph.AddEdge(2, 3)
	graph.AddEdge(1, 4)
	graph.AddEdge(4, 5)
	graph.AddEdge(5, 6)

	expectedTraversal := []int{0, 1, 2, 4, 3, 5, 6}
	traversal := BFS(graph, 0)

	if !reflect.DeepEqual(traversal, expectedTraversal) {
		t.Errorf("BFS traversal incorrect, got: %v, want: %v", traversal, expectedTraversal)
	}
}

func TestBFSDisconnectedGraph(t *testing.T) {
	graph := NewGraph()
	graph.AddEdge(0, 1)
	graph.AddEdge(0, 2)
	graph.AddEdge(1, 2)
	graph.AddEdge(3, 4)
	graph.AddEdge(4, 5)

	expectedTraversal := []int{0, 1, 2}
	traversal := BFS(graph, 0)

	if !reflect.DeepEqual(traversal, expectedTraversal) {
		t.Errorf("BFS traversal incorrect, got: %v, want: %v", traversal, expectedTraversal)
	}

	expectedTraversal2 := []int{4, 5}
	traversal2 := BFS(graph, 4)

	if !reflect.DeepEqual(traversal2, expectedTraversal2) {
		t.Errorf("BFS traversal incorrect, got: %v, want: %v", traversal2, expectedTraversal2)
	}
}
