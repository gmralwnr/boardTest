package com.black.board.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.black.board.dto.MemberVO;
import com.black.board.service.MemberService;

@Controller
public class MemberController {

	
	@Autowired
	MemberService ms;
	
	
	@RequestMapping("/")
	String loginForm(HttpServletRequest request ) {
		
		return "loginForm";
	}
	
	@RequestMapping("/login")
	String login(HttpServletRequest request, Model model, 
			@ModelAttribute("dto") @Valid MemberVO membervo , BindingResult result) {
		

		if(result.getFieldError("userid") !=null) {
			model.addAttribute("message", result.getFieldError("userid").getDefaultMessage());
			return "loginForm";
			
		}else if (result.getFieldError("pwd")!=null) {
			model.addAttribute("message", "비밀번호가 틀립니다");
			return "loginForm";
		}
		MemberVO mvo = ms.getMember(membervo.getUserid());
		if(mvo==null) {
			model.addAttribute("message","아이디가 없습니다");
			return "loginForm";
		}else if(mvo.getPwd()==null) {
			model.addAttribute("message", "비밀번호 오류입니다");
			return "loginForm";
		}else if(!mvo.getPwd().equals(membervo.getPwd())) {
			model.addAttribute("message", "비밀번호가 틀립니다");
			return "loginForm";
		}else if(mvo.getPwd().equals(membervo.getPwd())) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mvo);
			return "redirect:/board";
		}else
			model.addAttribute("message","무슨이유인지 모르겠습니다");
		
		
		return "loginform";
		

		
	}
}
