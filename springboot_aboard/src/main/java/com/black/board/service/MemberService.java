package com.black.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.black.board.dao.IMemberDao;
import com.black.board.dto.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	IMemberDao  mdao;

	public MemberVO getMember(String userid) {
	
		return mdao.getMember(userid);
	}

}
