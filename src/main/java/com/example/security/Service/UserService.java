package com.example.security.Service;

import com.example.security.Payload.AuthenticationRequest;
import com.example.security.Payload.AuthenticationResponse;
import com.example.security.Payload.RegisterRequest;
import org.springframework.http.ResponseEntity;

public interface UserService {

    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}
