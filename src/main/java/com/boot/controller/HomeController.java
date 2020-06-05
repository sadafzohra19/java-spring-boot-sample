package com.boot.controller;

import com.boot.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HomeController {

	@Autowired
	HomeService homeService;

	@RequestMapping("/")
	public String home() {
		return "Hi Sir, I am reporting for duty!";
	}

	@RequestMapping("/getAll")
	public List<Map<String, Object>> getAll() {
		return homeService.getAllClientsWithoutPagination();
	}

}
