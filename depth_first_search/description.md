# Depth First Search (DFS)

Depth–first search (DFS) is an algorithm for traversing or searching tree or graph data structures. One starts at the root (selecting some arbitrary node as the root for a graph) and explore as far as possible along each branch before backtracking.

The following graph shows the order in which the nodes are discovered in DFS:

![dfs-tree](https://upload.wikimedia.org/wikipedia/commons/1/1f/Depth-first-tree.svg)

<br/>

**Depth–first search in trees**

A tree is an undirected graph in which any two vertices are connected by exactly one path. In other words, any acyclic connected graph is a tree. For a tree, we have the following traversal methods:

- **Preorder**: visit each node before its children.
- **Postorder**: visit each node after its children.
- **Inorder (for binary trees only)**: visit left subtree, node, right subtree.

<br/>

**Depth–first search in Graph**

A Depth–first search (DFS) is a way of traversing graphs closely related to the preorder traversal of a tree. Following is the recursive implementation of preorder traversal:

```pseudocode
procedure preorder(treeNode v) {
    visit(v);
    for each child u of v
        preorder(u);
}
```

To turn this into a graph traversal algorithm, replace “child” with “neighbor”. But to prevent infinite loops, keep track of the vertices that are already discovered and not revisit them.

```pseudocode
procedure dfs(vertex v) {
    visit(v);
    for each neighbor u of v
        if u is undiscovered
            call dfs(u);
}
```

**Applications of DFS**

- Finding connected components in a graph.
- Topological sorting in a DAG(Directed Acyclic Graph).
- Finding 2/3–(edge or vertex)–connected components.
- Finding the bridges of a graph.
- Finding strongly connected components.
- Solving puzzles with only one solution, such as mazes.
- Finding biconnectivity in graphs and many more…

Reference: [Depth-First Search (DFS) - Techie Delight](https://www.techiedelight.com/depth-first-search/)
