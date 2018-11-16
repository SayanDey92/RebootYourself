package com.reboot.yourself.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.reboot.yourself.model.UserModel;
import com.reboot.yourself.repository.UserRepository;
import com.reboot.yourself.service.UserDetailsService;

public class UserDetailsServiceImpl implements UserDetailsService {

	public Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserModel findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

}
