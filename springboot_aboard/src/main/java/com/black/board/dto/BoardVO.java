package com.black.board.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BoardVO {
private int num;
private String userid;
private String pass;
private String title;
private String content;
private Timestamp writedate;


}
