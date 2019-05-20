package com.i2finance.bootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * @author zfh
 * @date 2019-05-19 11:55
 */
@Controller
public class MainController {
	@RequestMapping("index")
	public String home() {
		return "index";
	}

	@RequestMapping("subIndividual")
	public String indivdual(HttpServletRequest request, HttpServletResponse response) throws IOException {

		HttpSession session = request.getSession();
		session.setAttribute("radio_1", request.getParameter("radio_1"));
		session.setAttribute("radio_2", request.getParameter("radio_2"));
		session.setAttribute("radio_3", request.getParameter("radio_3"));
		session.setAttribute("radio_4", request.getParameter("radio_4"));
		session.setAttribute("radio_5", request.getParameter("radio_5"));
		System.out.println("第1题答案：" + request.getParameter("radio_1"));
		System.out.println("第2题答案：" + request.getParameter("radio_2"));
		System.out.println("第3题答案：" + request.getParameter("radio_3"));

		return "/TeachingMethod";
	}

	@RequestMapping("subTeachingMethod")
	public String teachingMethod(HttpServletRequest request, HttpServletResponse response) throws IOException {

		HttpSession session = request.getSession();
		session.setAttribute("radio_6", request.getParameter("radio_6"));
		session.setAttribute("radio_7", request.getParameter("radio_7"));
		session.setAttribute("radio_8", request.getParameter("radio_8"));
		session.setAttribute("radio_9", request.getParameter("radio_9"));
		session.setAttribute("radio_10", request.getParameter("radio_10"));
		System.out.println("第1题答案：radio_6" + request.getParameter("radio_6"));

		return "StudentFeel";
	}


	@RequestMapping("subFeel")
	public String feel(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.setAttribute("radio_11", request.getParameter("radio_11"));
		session.setAttribute("radio_12", request.getParameter("radio_12"));
		session.setAttribute("radio_13", request.getParameter("radio_13"));
		session.setAttribute("radio_14", request.getParameter("radio_14"));
		session.setAttribute("radio_15", request.getParameter("radio_15"));
		session.setAttribute("radio_16", request.getParameter("radio_16"));

		System.out.println("第1题答案：" + session.getAttribute("radio_11"));
		System.out.println("第2题答案：radio_12" + session.getAttribute("radio_11"));
		return "Environment";
	}


	@RequestMapping("subEnvironment")
	public String environment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=utf-8");
		HttpSession session = request.getSession();
		session.setAttribute("radio_17", request.getParameter("radio_17"));
		session.setAttribute("radio_18", request.getParameter("radio_18"));
		session.setAttribute("radio_19", request.getParameter("radio_19"));
		session.setAttribute("radio_20", request.getParameter("radio_20"));
		session.setAttribute("radio_21", request.getParameter("radio_21"));
		session.setAttribute("radio_22", request.getParameter("radio_22"));

		HashMap<Integer, String> map = new HashMap<>();
		String bbb="22.2%不及格，66.7%及格，11.1%优秀，继续努力！";
		for (int i=1;i<=22;i++){
			String temp = (String) session.getAttribute("radio_"+i);
			map.put(i,temp);
			System.out.println("radio_"+i+"=="+map.get(i));
		}

		if("A".equals(map.get(1))&&"C".equals(map.get(2))){
			if("B".equals(map.get(13))){
				bbb = "100%及格，继续努力！";
			}
			if("A".equals(map.get(11))&&"C".equals(map.get(13))&&"A".equals(map.get(19))){
				bbb = "100不及格，请调整学习状态，端正学习态度！";
			}
			if("C".equals(map.get(11))&&"C".equals(map.get(13))&&"A".equals(map.get(19))){
				bbb = "22.2%不及格，66.7%及格，11.1%优秀，继续努力！";
			}
		}
		if("B".equals(map.get(1))&&"C".equals(map.get(2))&&"C".equals(map.get(4))){
			if ("C".equals(map.get(13))) {
				bbb = "100%及格，继续努力！";
			}
			if("B".equals(map.get(1))&&"C".equals(map.get(2))&&"A".equals(map.get(4))){
				if ("C".equals(map.get(13))) {
					bbb = "83.3%及格，16.7%及格，请调整学习状态，端正学习态度！";
				}
			}
		}
		if("B".equals(map.get(2))&&"A".equals(map.get(4))&&"C".equals(map.get(10))){
			if("B".equals(map.get(21))&&"C".equals(map.get(19))&&"B".equals(map.get(20))){
				bbb = "25%及格，75%不及格，争取更上一层楼！";
			}
		}
		if("B".equals(map.get(2))&&"A".equals(map.get(2))&&"B".equals(map.get(5))&&"C".equals(map.get(10))){
			if ("C".equals(map.get(19)) &&"B".equals(map.get(20) )&& "C".equals(map.get(21))) {
				bbb = "52%及格，12%不及格，36%良好，注意学习巩固！";
			}else if("C".equals(map.get(19))  && "A".equals(map.get(21)) &&"B".equals(map.get(15)) ){
				bbb = "85.7%及格，12%不及格，14.3%不及格";
			}else if("C".equals(map.get(19))  &&"A".equals(map.get(21)) &&"C".equals(map.get(15)) ) {
				bbb = "33.3%及格，66.7%优秀，14.3%不及格，注意学习巩固！";
			}
		}
		if("B".equals(map.get(2)) &&"B".equals(map.get(5)) ){
			if("C".equals(map.get(10)) ){
				if("B".equals(map.get(21)) ){
					bbb = "80.7%及格，7.7%不及格，3.84%良好，7.69%优秀！";
				}
			}
			if("D".equals(map.get(10)) &&"C".equals(map.get(17)) &&"A".equals(map.get(18)) ){
				bbb = "100%优秀，请继续保持！";
			}
			if("B".equals(map.get(10)) &&"C".equals(map.get(17)) &&"A".equals(map.get(18)) ){
				bbb = "85.7%及格，14.3%不及格，争取更上一层楼！";
			}
		}
		if("A".equals(map.get(2)) &&"B".equals(map.get(3)) ){
			if("A".equals(map.get(11)) ){
				if("A".equals(map.get(9)) &&"A".equals(map.get(17)) &&"C".equals(map.get(20)) ){
					bbb = "87.5%及格，12.5%不及格，继续努力！";
				}
			}
		}
		if("A".equals(map.get(2)) &&"A".equals(map.get(3)) &&"B".equals(map.get(5)) &&"A".equals(map.get(4)) ){
			if("A".equals(map.get(11)) ){
				bbb = "27.7%不及格，50%及格，22.2%良好，继续努力！";
			}
		}
		if("A".equals(map.get(2)) &&"A".equals(map.get(3)) &&"C".equals(map.get(5)) &&"B".equals(map.get(16)) ){
				bbb = "85.7%不及格，8.9%及格，3.57%良好，1.78%优秀！";
		}
		// fourteen
		if("A".equals(map.get(2)) &&"A".equals(map.get(5)) &&"C".equals(map.get(10)) &&"B".equals(map.get(11))
				&&"B".equals(map.get(17)) &&"B".equals(map.get(20)) &&"B".equals(map.get(22)) ){
			bbb = "7.4%不及格，40.7%及格，37%良好，14.8%优秀,争取更上一层楼！";
		}
		// test
		if("C".equals(map.get(20))&&"C".equals(map.get(21))&&"C".equals(map.get(19))&&"C".equals(map.get(18))) {
			bbb = "7.4%不及格，40.7%及格，37%良好，14.8%优秀,争取更上一层楼！";
			System.out.println(bbb);
		}

		PrintWriter out = response.getWriter();
		out.print("<script>alert( \'"+bbb+"\' );</script>");
		out.flush();
		return "";
	}
	// no use
	@RequestMapping("result")
	public String result(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//response.setContentType("text/html; charset=utf-8");
		response.sendRedirect("index.html");
		String bbb = "6546546";
		PrintWriter out = response.getWriter();
		out.print("<script>alert(\"'bbb'\");</script>");
		out.flush();
		return null;
	}

	@RequestMapping("model")
	public String model(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
		String bbb = "7.4%不及格，40.7%及格，37%良好，14.8%优秀,争取更上一层楼！";
		PrintWriter out = response.getWriter();
		String s1="<script>alert(\" + bbb + \");location.href='index.html";
		String param="gid="+bbb;
		out.print("<script>alert('aaaaaa');</script>");
		out.flush();
		return null;
	}

}
