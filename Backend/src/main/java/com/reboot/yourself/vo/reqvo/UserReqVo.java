/**
 * 
 */
package com.reboot.yourself.vo.reqvo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author AyanD
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserReqVo {

	@JsonProperty("id")
	private int id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("emailId")
	private String emailId;
	
	@JsonProperty("password")
	private String password;
	
	/*@JsonProperty("roleReqVo")
	private UserRoleReqVo roleReqVo;
	
	@JsonProperty("profileReqVo")
	private UserProfileReqVo profileReqVo;*/
	
	@JsonProperty("access_token")
	private String access_token;
	
	@JsonProperty("token_type")
	private String token_type;
	
	@JsonProperty("refresh_token")
	private String refresh_token;
	
	@JsonProperty("expires_in")
	private int expires_in;
	
	@JsonProperty("scope")
	private String scope;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}
}
