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

		String[] ns = new String[] { "�� �����, ���� �����Ѹ� �躴�ء��������Ѹ� ������...", "'�ּ��� �Ĺ�' ��ġ�� ���� ���",
				"������ '�Ӵ����-�ּ��� ���ŷ��� �� ����� ���ùް� �̸�...'" };
		mav.addObject("list", ns);

		return mav;

	}
}
