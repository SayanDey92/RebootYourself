package com.reboot.yourself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.reboot.yourself.config.CustomPasswordEncoder;
import com.reboot.yourself.dao.AppConfigDAO;
import com.reboot.yourself.service.AppConfigService;
import com.reboot.yourself.service.UserDetailsService;
import com.reboot.yourself.service.impl.AppConfigServiceImpl;
import com.reboot.yourself.service.impl.UserDetailsServiceImpl;

@SpringBootApplication(scanBasePackages = {"com.reboot.yourself"})
@EnableWebMvc
@EnableResourceServer
public class RebootYourselfApplication {

	public static void main(String[] args) {
		SpringApplication.run(RebootYourselfApplication.class, args);
	}
	
	@Bean
	public AppConfigService appConfigService() {
		return new AppConfigServiceImpl();
	}
	
	@Bean
	public AppConfigDAO appConfigDAO() {
		return new AppConfigDAO();
	}
	
	/**
	 * Added for using Password Encodeing
	 * @author AyanD
	 * @date 12.11.2018
	 * */
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
	 return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
	
	/**
	 * Added for using Login Service 
	 * @author AyanD
	 * @date 12.11.2018
	 * */
	
	@Bean
    public UserDetailsService userDetailsService(){
    	return new UserDetailsServiceImpl();
    }
	
	
}
