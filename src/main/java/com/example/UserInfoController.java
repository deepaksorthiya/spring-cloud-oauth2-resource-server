package com.example;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author deepakk
 *
 */
@RestController
public class UserInfoController {

	@GetMapping("/api/v1/userinfo")
	public Authentication getAuthentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}
}
