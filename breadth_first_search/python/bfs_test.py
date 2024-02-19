import unittest
from bfs import Graph, BFS


class TestBFS(unittest.TestCase):
    def test_bfs(self):
        graph = Graph(
            {
                0: [],
                1: [],
                2: [],
                3: [],
                4: [],
                5: [],
                6: [],
            }
        )
        graph.add_edge(0, 1)
        graph.add_edge(0, 2)
        graph.add_edge(1, 2)
        graph.add_edge(2, 3)
        graph.add_edge(1, 4)
        graph.add_edge(4, 5)
        graph.add_edge(5, 6)

        expected_traversal = [0, 1, 2, 4, 3, 5, 6]
        traversal = BFS(graph, 0)

        self.assertEqual(traversal, expected_traversal)

    def test_bfs_disconnected_graph(self):
        graph = Graph(
            {
                0: [],
                1: [],
                2: [],
                3: [],
                4: [],
                5: [],
            }
        )
        graph.add_edge(0, 1)
        graph.add_edge(0, 2)
        graph.add_edge(1, 2)
        graph.add_edge(3, 4)
        graph.add_edge(4, 5)

        expected_traversal = [0, 1, 2]
        traversal = BFS(graph, 0)

        self.assertEqual(traversal, expected_traversal)

        expected_traversal2 = [4, 5]
        traversal2 = BFS(graph, 4)

        self.assertEqual(traversal2, expected_traversal2)


if __name__ == "__main__":
    unittest.main()
