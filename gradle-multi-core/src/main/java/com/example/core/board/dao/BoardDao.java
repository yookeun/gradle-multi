package com.example.core.board.dao;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.core.board.dto.BoardDto;

@Repository
public class BoardDao {
	@Autowired
	private SqlSession sqlSession;
	
	public List<BoardDto> selectList() {
		return sqlSession.selectList("boardMapper.selectList");
	}
}
