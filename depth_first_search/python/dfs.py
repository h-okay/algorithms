from typing import List, Dict


class Graph:
    def __init__(self, nodes: Dict[int, List[int]]) -> None:
        self.nodes = nodes

    def __repr__(self) -> None:
        return f"Graph({self.nodes})"

    def add_edge(self, u: int, v: int) -> None:
        self.nodes[u].append(v)
        self.nodes[v].append(u)


def DFS(g: Graph, value: int, discovered: Dict[int, bool], traversal: List[int]):
    discovered[value] = True
    traversal.append(value)

    for neighbour in g.nodes[value]:
        if not discovered.get(neighbour):
            DFS(g, neighbour, discovered, traversal)
