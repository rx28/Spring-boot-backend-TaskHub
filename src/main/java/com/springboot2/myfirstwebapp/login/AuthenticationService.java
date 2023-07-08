package com.springboot2.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate( String username,String password) {
       boolean isValidUsername=username.equalsIgnoreCase("a");
       boolean isValidPassword=password.equalsIgnoreCase("b");
       
       
    	return isValidPassword && isValidUsername;   	
    }
}
