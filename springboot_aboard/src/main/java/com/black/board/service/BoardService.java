package com.black.board.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.black.board.dao.IBoardDao;
import com.black.board.dto.BoardVO;

@Service
public class BoardService {

	@Autowired
	IBoardDao bdao;

	public Object selectBoardAll() {
	List<BoardVO>list = bdao.selectBoardAll();
	
		return list;
	}

	public HashMap<String, Object> selectDetail(int num) {
		HashMap<String, Object> paramMap =new HashMap<String, Object>();
		
		paramMap.put("board", bdao.selectDetail(num));
		
		return paramMap;
	}
}
