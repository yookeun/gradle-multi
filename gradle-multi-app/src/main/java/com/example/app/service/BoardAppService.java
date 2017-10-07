package com.example.app.service;

import com.example.core.board.dao.BoardDao;
import com.example.core.board.dto.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yookeun on 2017. 10. 7..
 */

@Service
public class BoardAppService {
    @Autowired
    private BoardDao boardDao;
    public List<BoardDto> selectList() {
        return boardDao.selectList();
    }
}
