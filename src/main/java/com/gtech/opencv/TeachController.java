package com.gtech.onepage;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gtech.onepage.model.GenericResult;
import com.gtech.onepage.service.UserService;

@Controller
public class TeachController {

	@Inject
	UserService userService;
	
	@RequestMapping(value = "/teach", method = RequestMethod.GET)
	public String learn(Model model) {
		Long timeLimit = System.currentTimeMillis();
		List<GenericResult> result1List = Collections.emptyList();

		try {
			//result1List = userService.getAccount("");
		} catch (Exception e) {
		}
		model.addAttribute("result1List", result1List);

		System.out.println(String.format("Executou em %s milisegundos.", System.currentTimeMillis() - timeLimit));

		return "teach";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@RequestParam("email") String email, @RequestParam("password") String password, @RequestParam("language") String language, Model model) {
		Long timeLimit = System.currentTimeMillis();

		try {
			userService.save(email, password, language);
		} catch (Exception e) {
		}

		System.out.println(String.format("Executou em %s milisegundos.", System.currentTimeMillis() - timeLimit));

		return "redirect:/home";
	}
}