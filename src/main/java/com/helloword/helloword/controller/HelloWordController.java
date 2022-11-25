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

	@GetMapping("/list-bsm")
	public List listBsm() {

		List bsm = new ArrayList();
		bsm.add("Orientação ao futuro");
		bsm.add("Trabalho em equipe");
		bsm.add("Orientação aos detalhes");

		return bsm;

	}
	@GetMapping("/list-obj")
	public List listObjetivos() {

		List obj = new ArrayList();
		obj.add("Spring");
		obj.add("Arquitetura Rest");
		obj.add("DER");

		return obj;

	}

}
