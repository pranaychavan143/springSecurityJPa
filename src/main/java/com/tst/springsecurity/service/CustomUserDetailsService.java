package com.tst.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tst.springsecurity.model.User;
import com.tst.springsecurity.repository.UserRepsitory;
@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	 private UserRepsitory repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		    User user = repository.findByUsername(username);
		    CustomUserDetails userDetails = null;
		    if(user!= null)
		    {
		    	userDetails = new CustomUserDetails();
		    	userDetails.setUser(user);
		    }
		    else
		    {
		    	 throw new UsernameNotFoundException("User Not Found...!"+username);
		    }
			return userDetails;
		
	}

}
