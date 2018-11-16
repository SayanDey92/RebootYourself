/**
 * 
 */
package com.reboot.yourself.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reboot.yourself.dao.AppConfigDAO;
import com.reboot.yourself.model.UserModel;
import com.reboot.yourself.repository.UserRepository;
import com.reboot.yourself.vo.resvo.CommonResVo;

/**
 * @author AyanD
 *
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	AppConfigDAO appConfigDAO;
	
	
	
	
	@Override
	public UserModel findByUserName(String userName) {
		UserModel model = null;
		try {
			model = appConfigDAO.findByUserName(userName);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}

	@Override
	public CommonResVo saveUserDetails(UserModel userModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
