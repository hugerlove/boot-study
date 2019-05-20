package com.i2finance.bootstudy.controller;

import com.i2finance.bootstudy.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * @author zfh
 * @date 2019-03-15 09:53
 */
@Slf4j
@Controller  //requestbody，转为json和controller的合体版
public class TestController {
//	@Value("")s
//	private String path;

	// @GetMapping("test")  //只允许使用get请求
	@RequestMapping("boot")
	@ResponseBody
	public User test() {
		User user = new User();
		user.setName("boot");
		log.info("rizhizhisjdlfkjsdlfkjsdlfkjsdlkjfv");
		return user;
	}

	@GetMapping("home")
	public String test2() {
		return "index";
	}

	@RequestMapping("feel2")
	public ModelAndView feel(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ModelAndView modelAndView= new ModelAndView();
//		response.setContentType("text/html; charset=utf-8");
//		String bbb = "6546546";
//		PrintWriter out = response.getWriter();
//
//		out.print("<script>alert("+bbb+");</script>");
//		out.flush();
//
//		String radio_11 = request.getParameter("radio_11");
//		String radio_12 = request.getParameter("radio_12");
//		String radio_13 = request.getParameter("radio_13");
//		String radio_14 = request.getParameter("radio_14");
//		String radio_15 = request.getParameter("radio_15");
//		String radio_16 = request.getParameter("radio_16");
//		HashMap<Integer, String> map = new HashMap<>();
//		map.put(1, radio_11);
//		System.out.println("第1题答案：" + radio_11);
//		System.out.println("第2题答案：" + radio_12);
//		System.out.println("第3题答案：" + radio_13);
//		System.out.println("第4题答案：" + radio_14);
//		System.out.println("第5题答案：" + radio_15);
//		System.out.println("第6题答案：" + radio_16);
		return modelAndView;
	}
}
