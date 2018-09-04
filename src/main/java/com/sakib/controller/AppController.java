package com.sakib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sakib.model.Login;
import com.sakib.model.SnapUser;
import com.sakib.services.SnapUserService;

@Controller
public class AppController {
	@Autowired  
	 SnapUserService snapuserService;
	
	
	@RequestMapping("/savesnapuser")  
	public String saveSnapUser(@ModelAttribute SnapUser snapuser, BindingResult result,
			Model model) throws IOException{
		if(result.hasErrors()) {
			model.addAttribute("snapuser", snapuser);
			return "registrationform";
		}
		snapuserService.insertData(snapuser);
	
		return "welcome";
}
	
	@RequestMapping("/login")
	public String loginpage(@ModelAttribute SnapUser login, Model model) {
		model.addAttribute("login", login);
		return "login";
	}
	
	
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login") Login login) {
	    ModelAndView mav = null;
	    SnapUser snapuser = snapuserService.validateuser(login);
	    if (null != snapuser) {
	    mav = new ModelAndView("welcome");
	    mav.addObject("firstname", snapuser.getFirstName());
	    } else {
	    mav = new ModelAndView("login");
	    mav.addObject("message", "Username or Password is wrong!!");
	    }
	    return mav;
	  }
	

	
	@RequestMapping("/register")
	public String registerpage(@ModelAttribute SnapUser snapuser, Model model) {
		model.addAttribute("snapuser", snapuser);
		return "registrationform";
	}
	@RequestMapping("/getList")  
	 public ModelAndView getUserLIst() {  
	  List<SnapUser> userList = snapuserService.getUserList();  
	  return new ModelAndView("userList", "userList", userList);  
	 } 
	

	 
	@RequestMapping("/edit/{mobile}")  
	 public ModelAndView editUser(@PathVariable String mobile,  
	   @ModelAttribute("user") SnapUser user) {  
	  
	  user = snapuserService.getUser(mobile);  
	    
	  List<String> usperproperties = new ArrayList<String>();
	  usperproperties.add("userId");
	  usperproperties.add("firstName");  
	  usperproperties.add("lastName");  
	  usperproperties.add("email");  
	  usperproperties.add("mobile");
	  usperproperties.add("password");
	  
	  Map<String, Object> map = new HashMap<String, Object>();  
	  map.put("usperproperties", usperproperties);    
	  map.put("user", user);  
	  
	  return new ModelAndView("editProfile", "map", map);  
	  
	 } 
	
	@RequestMapping("/update")  
	 public String updateUser(@ModelAttribute SnapUser user, BindingResult result) {  
		snapuserService.updateData(user);
		if(result.hasErrors()) {
	  return "registrationform";  
		}
		return "userList";
	 } 
}	
	
