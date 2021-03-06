package com.black.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.black.board.dto.BoardVO;

@Mapper //Mapper 사용시 bulid.gradle 추가
//implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:2.2.2'

public interface IBoardDao {

	List<BoardVO> selectBoardAll();

	BoardVO selectDetail(int num); 
	

}
