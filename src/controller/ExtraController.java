package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExtraController {
	@RequestMapping("/ex01.it")
	public String goToAnyWhere() {
		return "t:default";
	}

	@RequestMapping("/ex02.it")
	public String goToAnyWhere2() {
		return "t:join";
	}

	@RequestMapping("/ex03.it")
	public ModelAndView goToAnyWhere3() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("t:newsfeed");

		String[] ns = new String[] { "朴 대통령, 신임 국무총리 김병준·경제부총리 임종룡...", "'최순실 파문' 정치권 대응 방안",
				"안종범 '朴대통령-최순실 직거래… 난 대통령 지시받고 미르...'" };
		mav.addObject("list", ns);

		return mav;

	}
}
