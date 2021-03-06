package com.black.board.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.black.board.dto.BoardVO;
import com.black.board.dto.MemberVO;
import com.black.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService bs;
	
	@RequestMapping("/board")
	public ModelAndView Main(Model model, HttpServletRequest request) {
		
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();
		if(session.getAttribute("loginUser")==null) {
			mav.setViewName("loginForm");
			
		}else {
		
		//세션 창 닫기 전까지 로그 아웃하기전 유지 
		
		mav.addObject("boardList", bs.selectBoardAll());
		mav.setViewName("board");
		}
		return mav;
		
	}
	
	@RequestMapping("boardDetail")
	public ModelAndView BoardDetail(HttpServletRequest request, @RequestParam("num") int num) {
		ModelAndView mav = new ModelAndView();
		
		HttpSession session = request.getSession();
		if(session.getAttribute("loginUser")==null) {
			
			mav.setViewName("loginForm");
			
		}else {
		
		HashMap<String , Object> resultMap = bs.selectDetail(num);
		BoardVO mvo = (BoardVO)resultMap.get("board");
		mav.addObject("board", mvo);
		//mav.addObject("board", resultMap.get("board"));
		mav.setViewName("boardDetail");
		}
		return mav;
	}

	 @RequestMapping("boardEditForm")
	 public String EditForm(Model model , HttpServletRequest request) {
		 String num=request.getParameter("num");
		 model.addAttribute("num", num);
		 
		 return "boardCheckPassForm";
				 
	 }
}
