package com.okayhak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private final Map<Integer, List<Integer>> nodes;

    public Graph() {
        this.nodes = new HashMap<>();
    }

    public Graph(Map<Integer, List<Integer>> nodes) {
        this.nodes = nodes;
    }

    public Map<Integer, List<Integer>> getNodes() {
        return this.nodes;
    }

    public void addEdge(Integer u, Integer v) {
        if (!nodes.containsKey(u)) {
            nodes.put(u, new ArrayList<>());
        }
        nodes.get(u).add(v);

        if (!nodes.containsKey(v)) {
            nodes.put(v, new ArrayList<>());
        }
        nodes.get(v).add(u);
    }
}
