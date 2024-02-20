package depth_first_search

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
	g.Nodes[v] = append(g.Nodes[v], u)
}

func DFS(g *Graph, v int, discovered map[int]bool, traversal *[]int) {
	discovered[v] = true
	*traversal = append(*traversal, v)

	for _, neighbour := range g.Nodes[v] {
		if _, exists := discovered[neighbour]; !exists {
			DFS(g, neighbour, discovered, traversal)
		}
	}
}
