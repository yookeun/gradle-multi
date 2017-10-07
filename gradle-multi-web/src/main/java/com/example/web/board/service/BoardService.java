package com.example.web.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.core.board.dao.BoardDao;
import com.example.core.board.dto.BoardDto;

@Service
public class BoardService {

	@Autowired
	private BoardDao boardDao;
	
	public List<BoardDto> selectList() {
		return boardDao.selectList();
	}
}
