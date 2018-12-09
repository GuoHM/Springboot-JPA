package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestPassword {
	
	public static void main(String[] args){
		String encoded=new BCryptPasswordEncoder().encode("123456");
		System.out.println(encoded);
		//$2a$10$WuYhIZBc9OzI4pCu4r7u2uo3zj/.oNEWPAMoqYPLcWGfl6eAqwqjS
	}

}
