package com.logic.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
public class AppController {
	static Logger log = Logger.getLogger(AppController.class.getName());

	@RequestMapping(value = "/createuser", method = RequestMethod.POST)
	@ResponseBody
	public String createUser(@RequestParam String userLogin, @RequestParam String userPass,
			@RequestParam String userEmail) throws JsonProcessingException {

		String result = userLogin + " " + userPass + " " + userEmail;

		System.out.println(userLogin);
		System.out.println(userPass);
		System.out.println(userEmail);

		/*
		 * log.info("Getting a names list list..."); ObjectMapper mapper = new
		 * ObjectMapper();
		 *
		 * List<String> namesList = new ArrayList<String>();
		 *
		 * String jsonInString = mapper.writeValueAsString(namesList);
		 *
		 * log.info("The names list was formed."); return jsonInString;
		 */
		return "";
	}

}
