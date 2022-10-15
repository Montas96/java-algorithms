package io.umbrella;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientDemo {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {

        final String URL = "http://heeroplatform.com/api/product-families/DEFAULT_FAMILY/FRENCH_FRANCE";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(URL)).build();
        HttpResponse response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println("****");
        CompletableFuture<Void> asyncResponse = client.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);
        asyncResponse.get();
        System.out.println("****");

    }
}
