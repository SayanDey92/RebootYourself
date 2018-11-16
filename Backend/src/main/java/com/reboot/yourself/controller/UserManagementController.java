/**
 * 
 */
package com.reboot.yourself.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.reboot.yourself.config.ConfigProvider;
import com.reboot.yourself.config.CustomPasswordEncoder;
import com.reboot.yourself.model.AuthTokenInfo;
import com.reboot.yourself.model.UserModel;
import com.reboot.yourself.service.UserDetailsService;
import com.reboot.yourself.vo.reqvo.UserReqVo;
import com.reboot.yourself.vo.resvo.CommonResVo;
import com.reboot.yourself.vo.resvo.UserResVo;

/**
 * @author AyanD
 * @param <UserManagementController>
 *
 */

@RestController
@RequestMapping(value = "/api")
public class UserManagementController {
	
	
	@Autowired
	private ConfigProvider configProvider;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@SuppressWarnings("rawtypes")
	@PostMapping(value = "/${config.default-api-version}/login")
	public ResponseEntity<CommonResVo> login(HttpServletRequest request, @RequestBody UserReqVo userReqVo) {
		ResponseEntity<CommonResVo> responseEntity = null;
		CommonResVo commonResVo =  null;
		RestTemplate restTemplate = new RestTemplate();
		String plainCreds = configProvider.clientId +":"+ configProvider.secretKey;
		byte[] plainCredsBytes = plainCreds.getBytes();
		byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
		String base64Creds = new String(base64CredsBytes);
		ResponseEntity<AuthTokenInfo> response = null;
		try {
			if(userReqVo != null) {
				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_JSON);
				List<MediaType> list = new ArrayList<MediaType>(0);
				list.add(MediaType.APPLICATION_JSON);
				headers.setAccept(list);
				headers.add("Authorization", "Basic "+ base64Creds);
				CustomPasswordEncoder passwordEncoder = new CustomPasswordEncoder();
				String encodedPass = passwordEncoder.encodePass(userReqVo.getPassword());
				HttpEntity<String> entity = new HttpEntity<String>(headers);
				String url = configProvider.getOauthUrl() + userReqVo.getEmailId() + "&password=" + encodedPass;
				/*
				 * Important Don't it 
				 * String Url = "http://localhost:8083/RebootYourself/oauth/token?grant_type=password&username=ayandeyasi.911@gmail.com&password=7602499583";
				 * */
				response = restTemplate.exchange(url, HttpMethod.POST, entity, AuthTokenInfo.class);
				if(response.getStatusCode() == HttpStatus.OK){
					AuthTokenInfo authTokenInfo = response.getBody();
					UserModel model = userDetailsService.findByUserName(userReqVo.getEmailId());
					UserResVo resVo = new UserResVo();
					BeanUtils.copyProperties(model, resVo,"password");
					BeanUtils.copyProperties(authTokenInfo,resVo);
					commonResVo = new CommonResVo<UserResVo>(HttpStatus.ACCEPTED.toString(), CommonResVo.SUCCESS_MESSAGE, resVo);
				}
				else {
					commonResVo = new CommonResVo<String>(HttpStatus.NOT_ACCEPTABLE.toString(), CommonResVo.ERROR_MESSAGE, CommonResVo.DEFAULT_RESPONSE_MESSAGE);
				}
				
			}
			else {
				commonResVo = new CommonResVo<String>(HttpStatus.NO_CONTENT.toString(), CommonResVo.ERROR_MESSAGE, CommonResVo.DEFAULT_RESPONSE_MESSAGE);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			commonResVo = new CommonResVo<String>(HttpStatus.NOT_ACCEPTABLE.toString(), CommonResVo.ERROR_MESSAGE, CommonResVo.DEFAULT_RESPONSE_MESSAGE);
		}
		responseEntity = new ResponseEntity<CommonResVo>(commonResVo, HttpStatus.OK);
		return responseEntity;
	}
}
