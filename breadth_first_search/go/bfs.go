package breadth_first_search

type Graph struct {
	Nodes map[int][]int
}

func NewGraph() *Graph {
	return &Graph{
		Nodes: make(map[int][]int),
	}
}

func (g *Graph) AddEdge(u, v int) {
	g.Nodes[u] = append(g.Nodes[u], v)
}

func BFS(graph *Graph, start int) []int {
	visited := make(map[int]bool)
	queue := []int{start}
	visited[start] = true
	traversal := []int{}

	for len(queue) > 0 {
		node := queue[0]
		queue = queue[1:]
		traversal = append(traversal, node)

		for _, neighbor := range graph.Nodes[node] {
			if !visited[neighbor] {
				visited[neighbor] = true
				queue = append(queue, neighbor)
			}
		}
	}

	return traversal
}
