/**
 * 
 */
package com.reboot.yourself.utils;

/**
 * @author AyanD
 *
 */
public class Constants {
	public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users/sign-up";
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String ROLE_EMPLOYEE = "EMPLOYEE";
	public static final String ROLE_CLERK = "CLERK";
	public static final String ROLE_ADMIN = "ADMIN";
	
	
	
	public static final String CLIEN_ID = "devglan-client";
	public static final String CLIENT_SECRET = "devglan-secret";
	public static final String GRANT_TYPE = "password";
	public static final String AUTHORIZATION_CODE = "authorization_code";
	public static final String REFRESH_TOKEN = "refresh_token";
	public static final String IMPLICIT = "implicit";
	public static final String SCOPE_READ = "read";
	public static final String SCOPE_WRITE = "write";
	public static final String TRUST = "trust";
	public static final int ACCESS_TOKEN_VALIDITY_SECONDS = 1*60*60;
	public static final int FREFRESH_TOKEN_VALIDITY_SECONDS = 6*60*60;
	
	
	
	
	
	
}
