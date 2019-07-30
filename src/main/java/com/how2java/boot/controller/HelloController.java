package com.how2java.boot.controller;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller   //用RestController就无须用ResponseBody了
public class HelloController {
	
	
	@Value("${url}")
	String url;
	//@ResponseBody
	@RequestMapping("/hello")
	public String Hello(Model m) {
		System.out.println("该方法被执行，即将打开"+url);
		m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
		return "hello";
	}
}
