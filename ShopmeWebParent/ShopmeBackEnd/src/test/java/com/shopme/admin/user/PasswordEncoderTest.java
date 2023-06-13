package com.shopme.admin.user;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderTest {

	@Test
	public void testEncodePassword() {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String rawPassword = "viktar2023";
		String encodedPassword = passwordEncoder.encode(rawPassword);
		assertTrue(passwordEncoder.matches(rawPassword, encodedPassword));
	}
}
