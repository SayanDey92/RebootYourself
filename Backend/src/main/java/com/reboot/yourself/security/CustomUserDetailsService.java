package com.reboot.yourself.security;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reboot.yourself.model.UserModel;
import com.reboot.yourself.model.UserRole;





@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService{

	static final Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);
    
	@Autowired
	@Qualifier("userDetailsService")
    private com.reboot.yourself.service.UserDetailsService userDetailsService;
    
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel user = new UserModel();
		try {
			user = userDetailsService.findByUserName(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
        logger.info("User : {}", user);
        if(user==null){
            logger.info("User not found");
            throw new UsernameNotFoundException("Username not found");
        }
            return new org.springframework.security.core.userdetails.User(user.getEmailId(), user.getPassword(), 
                 true, true, true, true, getGrantedAuthorities(user));
    }

    private List<GrantedAuthority> getGrantedAuthorities(UserModel user){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
  
        /*for(UserRole userRole : user.getUserRole()){*/
        UserRole userRole = user.getRole();
        //userRole.setCode("ADMIN");
        if(userRole.getRoleName() != null || userRole.getRoleName() != ""){
            logger.info("UserRole : {}", userRole);
            authorities.add(new SimpleGrantedAuthority("ROLE_" + userRole.getRoleName().toUpperCase()));
        }
        logger.info("authorities : {}", authorities);
        return authorities;
    }

}
