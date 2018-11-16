/**
 * 
 */
package com.reboot.yourself.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

import com.reboot.yourself.config.ConfigProvider;

/**
 * @author AyanD
 *
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
 
    private static final String RESOURCE_ID = "my_rest_api";
    
    @Autowired
	ConfigProvider configProvider;
     
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId(RESOURCE_ID).stateless(false);
    }
 
    @Override
    public void configure(HttpSecurity http) throws Exception {
       /* http.
        anonymous().disable()
        .requestMatchers().antMatchers("/user/**")
        .and().authorizeRequests()
        .antMatchers("/user/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());*/
    	
    	
    	http.csrf().disable()
		.authorizeRequests()
		.antMatchers("/swagger-ui.html", "/swagger-resources/**", "/v2/**").permitAll()
		.antMatchers("/api/" + configProvider.defaultApiVersion + "/config", "/api/" + configProvider.defaultApiVersion + "/login","/oauth/token**").permitAll()
		.antMatchers("/api/" + configProvider.defaultApiVersion + "/add-config").fullyAuthenticated();
		//.authenticated().and();
    }

}
