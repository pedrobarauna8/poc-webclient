package org.example.pocwebclient.infra.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class MockService {

    private final WebClient webClient;

    public MockService(WebClient webClient) {
        this.webClient = webClient;
    }

    public void getMockedResponse() {

        var response = webClient.post()
                .uri("https://run.mocky.io/v3/bfb0c732-e08d-456f-bf31-764a11a557d2")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(""))
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println(response);
    }
}
