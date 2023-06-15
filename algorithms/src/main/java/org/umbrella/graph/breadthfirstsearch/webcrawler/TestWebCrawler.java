package org.umbrella.graph.breadthfirstsearch.webcrawler;

public class TestWebCrawler {

    public static void main(String[] args) {
        BFS bfs = new BFS();
        bfs.discoverTheWeb("https://passexcellence.com");
    }
}
