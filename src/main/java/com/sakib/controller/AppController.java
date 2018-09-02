package com.sakib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@RequestMapping("/editPage")
	public String getupdatepage(@ModelAttribute SnapUser update, Model model) {
		model.addAttribute("update", update);
		return "editProfile";
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
	
	 @RequestMapping("/update")  
	 public String updateUser(@ModelAttribute SnapUser snapuser) {  
	  snapuserService.updateData(snapuser);  
	  return "redirect:/getList";  
	  
	 }  
	
}