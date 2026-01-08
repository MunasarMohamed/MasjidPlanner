package com.masjidplanner.app.Authentication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
	private final AuthService service;

	public AuthController(
			AuthService authService) {
		this.service = authService;
	}
}
