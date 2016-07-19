package com.gtech.onepage;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gtech.onepage.model.GenericResult;
import com.gtech.onepage.service.UserService;

@Controller
public class HomeController {

	@Inject
	UserService crmService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String search(Model model) {
		Long timeLimit = System.currentTimeMillis();
		List<GenericResult> result1List = Collections.emptyList();

		try {
			//result1List = crmService.getAccount("");
		} catch (Exception e) {
		}
		model.addAttribute("result1List", result1List);

		System.out.println(String.format("Executou em %s milisegundos.", System.currentTimeMillis() - timeLimit));

		return "home";
	}
}