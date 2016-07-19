package com.gtech.onepage;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gtech.onepage.model.GenericResult;
import com.gtech.onepage.service.WishService;

@Controller
public class WishController {

	@Autowired
	WishService wishService;
	
	@RequestMapping(value = "/wish", method = RequestMethod.GET)
	public String learn(Model model) {
		Long timeLimit = System.currentTimeMillis();
		List<GenericResult> result1List = Collections.emptyList();

		try {
			//result1List = userService.getAccount("");
		} catch (Exception e) {
		}
		model.addAttribute("result1List", result1List);

		System.out.println(String.format("Executou em %s milisegundos.", System.currentTimeMillis() - timeLimit));

		return "wish";
	}
	
	@RequestMapping(value = "/wishSave", method = RequestMethod.POST)
	public String save(@RequestParam("wish") String wish, Model model) {
		Long timeLimit = System.currentTimeMillis();

		try {
			wishService.save(wish);
		} catch (Exception e) {
		}

		System.out.println(String.format("Executou em %s milisegundos.", System.currentTimeMillis() - timeLimit));

		return "redirect:/wish";
	}
}