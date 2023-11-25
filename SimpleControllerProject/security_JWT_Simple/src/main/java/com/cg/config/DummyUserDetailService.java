package com.cg.config;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DummyUserDetailService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (username.equals("nejam")) {
			UserDetails userDetails = User.builder()
										  .username("nejam")
										  .password("nejam")
										  .roles("ADMIN")
										  .build();

			return userDetails;
		} else
			throw new UsernameNotFoundException(username);
	}

}