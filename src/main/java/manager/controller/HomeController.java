package manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import manager.entity.UserLogin;
import manager.entity.UserSignup;
import manager.service.BookService;
import manager.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/login")
	public String login(){
		return "login";	
	}
	
	@RequestMapping("/adminLogin")
	public String adminLogin() {
		return "adminLog";
	}
	
	@RequestMapping("/register")  
    public String register(){  
        return "register";  
    }  
	
	@RequestMapping("/about")  
    public String about(){  
        return "AboutUs";  
    }  
	
	@RequestMapping(path="/validateLogin",method=RequestMethod.POST)  
    public String validLogin(@ModelAttribute("userLogin") UserLogin userLogin,Model model){  
		boolean check=this.userService.loginUser(userLogin);
		model.addAttribute("user", userLogin.getUsername());
		return check?"home":"login";  
    }  
	
	@RequestMapping(path="/validateAdmin",method=RequestMethod.POST)  
    public String validAdmin(@ModelAttribute("userLogin") UserLogin userLogin,Model model){  
		boolean check=this.userService.loginAdmin(userLogin);
		return check?"home2":"adminLog";  
    }  
	
	@RequestMapping(path="/validateSignup",method=RequestMethod.POST)  
    public String validSingUp(@ModelAttribute("userSignup") UserSignup userSignup,Model model){  
		System.out.println(userSignup.getUsername()+" "+userSignup.getEmail()+" "+userSignup.getPassword());
		boolean check=this.userService.createUser(userSignup);
		return check?"login":"register";  
    }  
	
}
