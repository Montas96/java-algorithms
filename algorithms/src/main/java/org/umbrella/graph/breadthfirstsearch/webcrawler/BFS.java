package org.umbrella.graph.breadthfirstsearch.webcrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BFS {

    private Queue<String> queue = new LinkedList<>();
    private List<String> discoveredWebSites = new ArrayList<>();

    // root is the starting url
    public void discoverTheWeb(String root) {
        this.queue.add(root);
        this.discoveredWebSites.add(root);

        while (!queue.isEmpty()){
            String url = queue.remove();
            String rawURL = readURL(url);

            //Find valid urls
            String regex = "https://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(rawURL);

            while (matcher.find()) {
                String wibSite = matcher.group();
                if(!discoveredWebSites.contains(wibSite)){
                    discoveredWebSites.add(wibSite);
                    System.out.println("Website found : " + wibSite);
                    queue.add(wibSite);
                }
            }

        }
    }

    //Read the HTML content of a given HTML
    private String readURL(String site) {
        StringBuilder rawHTML = new StringBuilder("");

        try {
            URL url = new URL(site);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            while ((line = bufferedReader.readLine())!= null) {
                rawHTML.append(line);
            }
        }catch (Exception exception) {
            System.out.println("Error while crawling " + site);
        }
        return rawHTML.toString();
    }
}
