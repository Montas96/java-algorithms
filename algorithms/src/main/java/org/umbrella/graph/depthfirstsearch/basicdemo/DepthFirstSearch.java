package org.umbrella.graph.depthfirstsearch.basicdemo;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/?ref=lbp
 */
public class DepthFirstSearch {
    /**
     * Use of abstract Stack Data structure
     */
    Stack<Vertex> stack = new Stack<>();
    // It may happen that we have independent clusters
    public void travers(List<Vertex> vertexList) {
        for (Vertex vertex : vertexList) {
            if (!vertex.isVisited()) {
                vertex.setVisited(true);
                dfsHelper(vertex);
            }
        }

    }

    private void dfsHelper(Vertex root) {
        stack.add(root);
        root.setVisited(true);
        while (!stack.isEmpty()){
            Vertex actualVertex = stack.pop();
            System.out.println("Actual vertex is " + actualVertex.getName());
            for (Vertex currentVertex: actualVertex.getAdjacentVertices()){
                if(!currentVertex.isVisited()){
                    currentVertex.setVisited(true);
                    stack.add(currentVertex);
                }
            }
        }

    }
}
