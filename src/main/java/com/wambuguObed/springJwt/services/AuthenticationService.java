package com.wambuguObed.springJwt.services;

import com.wambuguObed.springJwt.dto.JwtAuthenticationResponse;
import com.wambuguObed.springJwt.dto.RefreshTokenRequest;
import com.wambuguObed.springJwt.dto.SignInRequest;
import com.wambuguObed.springJwt.dto.SignUpRequest;
import com.wambuguObed.springJwt.entities.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin(SignInRequest signInRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
