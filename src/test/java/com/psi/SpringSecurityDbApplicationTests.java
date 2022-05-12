package com.psi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class SpringSecurityApplicationTests {

//	@Test
//	void contextLoads() {
		public static void main(String[] args) {
			
		
		PasswordEncoder pe= new BCryptPasswordEncoder();
		String ecode=pe.encode("1234");
		System.out.println(ecode);
		boolean matches=pe.matches("1234",ecode);
		System.out.println(matches);
		
		System.out.println();
		
		String ecode2=pe.encode("5678");
		System.out.println(ecode2);
		boolean matches2=pe.matches("5678",ecode2);
		System.out.println(matches2);
	}

}

