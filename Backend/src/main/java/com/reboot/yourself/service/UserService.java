/**
 * 
 */
package com.reboot.yourself.service;

import com.reboot.yourself.vo.reqvo.UserReqVo;
import com.reboot.yourself.vo.resvo.CommonResVo;

/**
 * @author AyanD
 *
 */
public interface UserService {

	public CommonResVo signup(UserReqVo userReqVo);
	
}
