package com.oasys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class JenkinsDemo {
	@GetMapping(value = "/forJenkins")
	public String forJenkins() {
		return "This is jenkins demo";
	}
}
