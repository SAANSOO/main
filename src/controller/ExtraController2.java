package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExtraController2 {
	@RequestMapping("/tiles/01.it")
	public String execute() {
		return "tw:event";
	}
	
	@RequestMapping("/tiles/02.it")
	public String execute2() {
		return "tw:login";
	}
	
	@RequestMapping("/tiles/03.it")
	public String execute3() {
		return "tw:policy/service";
	}
	
	@RequestMapping("/tiles/04.it")
	public String execute4() {
		return "tw:banner/policy/service";
	}
}








