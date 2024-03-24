package org.example.pocwebclient.app;

import org.example.pocwebclient.infra.service.AuthService;
import org.example.pocwebclient.infra.service.MockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final AuthService authService;
    private final MockService mockService;

    public AuthController(AuthService authService, MockService mockService){
        this.authService = authService;
        this.mockService = mockService;
    }

    @GetMapping("/auth")
    public void getAccessToken() {
        mockService.getMockedResponse();
    }
}
