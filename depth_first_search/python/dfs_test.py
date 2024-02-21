import unittest
from dfs import Graph, DFS


class TestDFS(unittest.TestCase):
    def test_dfs(self):
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
        graph.add_edge(1, 3)
        graph.add_edge(2, 4)

        expected_traversal = [0, 1, 3, 2, 4]
        traversal = []
        DFS(graph, 0, {}, traversal)

        self.assertEqual(traversal, expected_traversal)

    def test_dfs_disconnected_graph(self):
        graph = Graph(
            {
                0: [],
                1: [],
                2: [],
                3: [],
                4: [],
                5: [],
                6: [],
                7: [],
                8: [],
                9: [],
            }
        )
        graph.add_edge(0, 1)
        graph.add_edge(0, 2)
        graph.add_edge(1, 3)
        graph.add_edge(2, 4)
        graph.add_edge(4, 5)
        graph.add_edge(6, 7)
        graph.add_edge(7, 8)
        graph.add_edge(8, 9)
        graph.add_edge(6, 9)
        graph.add_edge(7, 9)

        expected_traversal1 = [0, 1, 3, 2, 4, 5]
        traversal1 = []
        DFS(graph, 0, {}, traversal1)
        self.assertEqual(traversal1, expected_traversal1)

        expected_traversal2 = [6, 7, 8, 9]
        traversal2 = []
        DFS(graph, 6, {}, traversal2)
        self.assertEqual(traversal2, expected_traversal2)


if __name__ == "__main__":
    unittest.main()
