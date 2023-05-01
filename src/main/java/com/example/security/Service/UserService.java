package com.example.security.Service;

import com.example.security.Payload.AuthenticationRequest;
import com.example.security.Payload.AuthenticationResponse;
import com.example.security.Payload.RegisterRequest;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<AuthenticationResponse> register(RegisterRequest request);

    ResponseEntity<AuthenticationResponse> authenticate(AuthenticationRequest request);
}
