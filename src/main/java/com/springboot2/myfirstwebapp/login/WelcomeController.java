package com.springboot2.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
//@Component
@SessionAttributes("name")

public class WelcomeController {
	
	//private Logger logger=LoggerFactory.getLogger(getClass());
	//http://localhost:8080/login?name=ja
//	@RequestMapping("login") 
//	public String gotoLoginPage(@RequestParam String name,ModelMap model) {
//		model.put("name",name);
//		logger.debug("Request param is {}",name);		
//		logger.info("print this on info level");
//		logger.warn("print this on warn level");
//		
//		System.out.println(name);
//		
//		return "login";
//	}
//	@Autowired
//	private AuthenticationService authenticationService;
//	
	
	//or
//	public LoginController(AuthenticationService authenticationService) {
//		super();
//		this.authenticationService=authenticationService;
//	}
//	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUsername());
		return "welcome";
	}
	
	private String getLoggedinUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	 	

}
