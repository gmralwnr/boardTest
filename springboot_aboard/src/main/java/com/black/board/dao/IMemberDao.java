package com.black.board.dao;

import org.apache.ibatis.annotations.Mapper;

import com.black.board.dto.MemberVO;

@Mapper
public interface IMemberDao {

	MemberVO getMember(String userid);

}
