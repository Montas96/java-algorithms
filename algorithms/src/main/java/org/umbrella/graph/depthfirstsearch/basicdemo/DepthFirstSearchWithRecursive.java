package org.umbrella.graph.depthfirstsearch.basicdemo;

import java.util.List;
import java.util.Stack;

/**
 * Recursive version use the recursion instead of stack, witch mean,
 * it uses system stack
 */
public class DepthFirstSearchWithRecursive {

    // It may happen that we have independent clusters
    public void travers(List<Vertex> vertexList) {
        for (Vertex vertex : vertexList) {
            if (!vertex.isVisited()) {
                vertex.setVisited(true);
                dfsHelper(vertex);
            }
        }

    }

    private void dfsHelper(Vertex vertex) {
        System.out.println("Actual vertex is " + vertex.getName());
        for (Vertex currentVertex: vertex.getAdjacentVertices()){
            if(!currentVertex.isVisited()){
                currentVertex.setVisited(true);
                dfsHelper(currentVertex);
            }
        }

    }
}
