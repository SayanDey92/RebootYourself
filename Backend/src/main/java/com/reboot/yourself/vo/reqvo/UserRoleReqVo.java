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
public class UserRoleReqVo {

	@JsonProperty("roleId")
	private Integer roleId;
	
	@JsonProperty("roleName")
	private String roleName;
	
	@JsonProperty("roleDesc")
	private String roleDesc;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	
	
}
