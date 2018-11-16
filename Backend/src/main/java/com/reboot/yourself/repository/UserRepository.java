package com.reboot.yourself.repository;

import com.reboot.yourself.model.UserModel;
import com.reboot.yourself.vo.resvo.CommonResVo;

/**
 * @author AyanD
 *
 */
public interface UserRepository {

	public UserModel findByUserName(String userName);
	
	@SuppressWarnings("rawtypes")
	public CommonResVo saveUserDetails(UserModel userModel);
}
