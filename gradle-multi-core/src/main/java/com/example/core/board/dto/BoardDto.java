package com.example.core.board.dto;

import lombok.Data;

@Data
public class BoardDto {
	private int id;
	private String title;
	private String content;
	private String regdate;
}
