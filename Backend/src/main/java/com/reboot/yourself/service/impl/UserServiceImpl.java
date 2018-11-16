/**
 * 
 */
package com.reboot.yourself.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.reboot.yourself.model.UserModel;
import com.reboot.yourself.repository.UserRepository;
import com.reboot.yourself.service.UserService;
import com.reboot.yourself.vo.reqvo.UserReqVo;
import com.reboot.yourself.vo.resvo.CommonResVo;

/**
 * @author AyanD
 *
 */
public class UserServiceImpl implements UserService {

	/* (non-Javadoc)
	 * @see com.reboot.yourself.service.UserService#signup(com.reboot.yourself.vo.reqvo.UserReqVo)
	 */
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public CommonResVo signup(UserReqVo userReqVo) {
		
		return userRepository.saveUserDetails(new UserModel());
	}

}
