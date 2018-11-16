package com.reboot.yourself.service;

import com.reboot.yourself.model.UserModel;

public interface UserDetailsService {
	public UserModel findByUserName(String userName);
}
