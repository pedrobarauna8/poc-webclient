package org.example.pocwebclient.infra.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class AuthService {

    private final WebClient webClient;

    public AuthService(WebClient webClient) {
        this.webClient = webClient;
    }

    public void getAccessToken() {

        var response = webClient.get()
                .uri("https://run.mocky.io/v3/5794d450-d2e2-4412-8131-73d0293ac1cc")
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println(response);
    }
}
