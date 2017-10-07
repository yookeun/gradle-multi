package com.example.app.control;

import com.example.app.service.BoardAppService;
import com.example.core.board.dto.BoardDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by yookeun on 2017. 10. 7..
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardAppControllerTest {


    @Autowired
    private BoardAppService boardAppService;

    @Test
    public void board_list() {
        List<BoardDto> boardList = boardAppService.selectList();
        for (BoardDto boardDto : boardList) {
            System.out.println("title = " + boardDto.getTitle());
            System.out.println("content = " + boardDto.getContent());
        }
    }

}