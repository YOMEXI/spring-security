package com.example.security.Service;

import com.example.security.Payload.AuthenticationRequest;
import com.example.security.Payload.AuthenticationResponse;
import com.example.security.Payload.RegisterRequest;
import org.springframework.http.ResponseEntity;

public class UserServiceImpl implements UserService {
    @Override
    public ResponseEntity<AuthenticationResponse> register(RegisterRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<AuthenticationResponse> authenticate(AuthenticationRequest request) {

        return null;
    }
}
