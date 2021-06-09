package com.blurdel.ssc.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.blurdel.ssc.model.MyUserDetails;
import com.blurdel.ssc.model.User;
import com.blurdel.ssc.repositories.UserRepository;


@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepo.findByUserName(username);
		
		user.orElseThrow(() -> new UsernameNotFoundException("User Not Found: " + username));
		
		return user.map(MyUserDetails::new).get();
	}

}
