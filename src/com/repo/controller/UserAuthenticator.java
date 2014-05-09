package com.repo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.repo.domain.Login;
import com.repo.domain.User;
import com.repo.services.QuestionService;
import com.repo.services.UserService;

@Controller
public class UserAuthenticator {

	@Autowired
	UserService userService;

	@Autowired
	QuestionService questionServiceImpl;

	@Autowired
	Gson gson;

	@RequestMapping("/authenticate")
	public String authenticateUser(@ModelAttribute Login login) {
		Map<String, Object> dataMap = new HashMap<String, Object>();

		if (userService.authenticateUser(login.getUsername(),
				login.getPassword())) {
			return "redirect:/getList";
		} else {
			return "redirect:/authenticate";
		}
	}

	@RequestMapping("/getTeamSpecificQuestions")
	public @ResponseBody
	String getTeamSpecificQuestions(@ModelAttribute Login login) {
		return gson.toJson(questionServiceImpl.getTeamSpecificQuestions(login));

	}

	@RequestMapping("/register")
	public ModelAndView registerUser(@ModelAttribute User user) {

		List<String> teams = new ArrayList<String>();
		teams.add("Leantaas");
		teams.add("AppD");
		Map<String, List> dataMap = new HashMap<String, List>();
		dataMap.put("teams", teams);
		return new ModelAndView("register", "map", dataMap);
	}

	@RequestMapping("/insert")
	public String inserData(@ModelAttribute User user) {
		if (user != null)
			userService.insertData(user);
		return "redirect:/getList";
	}

	@RequestMapping("/getList")
	public @ResponseBody
	String getUserLIst() {
		List<User> userList = userService.getUserList();

		return (gson.toJson(userList));
		// return userList;

		/*
		 * RestTemplate userTemplate = new RestTemplate(); userTemplate.
		 */
		// return new ModelAndView("userList", "userList", userList);
	}

	@RequestMapping("/edit")
	public ModelAndView editUser(@RequestParam String id,
			@ModelAttribute User user) {

		user = userService.getUser(id);

		List<String> teams = new ArrayList<String>();
		teams.add("Leantaas");
		teams.add("AppD");
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("teams", teams);
		dataMap.put("user", user);
		return new ModelAndView("edit", "map", dataMap);

	}

	@RequestMapping("/update")
	public String updateUser(@ModelAttribute User user) {
		userService.updateData(user);
		return "redirect:/getList";

	}

	@RequestMapping("/delete")
	public String deleteUser(@RequestParam String id) {
		System.out.println("id = " + id);
		userService.deleteData(id);
		return "redirect:/getList";
	}
}