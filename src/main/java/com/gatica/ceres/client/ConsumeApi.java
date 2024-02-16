package com.gatica.ceres.client;

import org.springframework.beans.factory.annotation.Value; // For API key injection
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class ConsumeApi {

    @Value("${omdb.api.key}") // Assuming key in application properties
    private String API_KEY;

    private String BASE_URL = "https://www.omdbapi.com/?t=";

    public String consumeData(String search) {

        HttpClient client = HttpClient.newHttpClient();
        String requestUrl = String.format("%s%s&apikey=%s", BASE_URL, search, API_KEY); // Improved URL construction
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(requestUrl))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error occurred while consuming API", e);
        }
    }
}
