package com.helloword.helloword.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-word")
public class HelloWordController {

	@GetMapping
	public String helloWord() {

		return "Hello Word";

	}

	@GetMapping("/list")
	public List listBsm() {

		List bsm = new ArrayList();
		bsm.add("Java");
		bsm.add("JS");

		return bsm;

	}

}
