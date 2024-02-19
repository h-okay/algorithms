from typing import List, Dict
from collections import defaultdict


class Graph:
    def __init__(self, nodes: Dict[int, List[int]]) -> None:
        self.nodes = nodes

    def __repr__(self) -> None:
        return f"Graph({self.nodes})"

    def add_edge(self, u: int, v: int) -> None:
        self.nodes[u].append(v)
        self.nodes[v].append(u)


def BFS(graph: Graph, start: int) -> List[int]:
    visited: Dict[int, bool] = defaultdict(list)
    queue: List[int] = [start]
    visited[start] = True
    traversal: List[int] = []

    while len(queue) > 0:
        node = queue[0]
        queue = queue[1:]
        traversal.append(node)

        for neighbour in graph.nodes[node]:
            if not visited[neighbour]:
                visited[neighbour] = True
                queue.append(neighbour)

    return traversal
