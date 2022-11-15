package com.first.boiler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NewsVO {
    // 뉴스 순번
    private Integer news_seq;

    // 뉴스 제목
    private String news_title;

    // 뉴스 내용
    private String news_content;

    // 뉴스 언론사
    private String news_press;

    // 뉴스 게시일자
    private Date news_dt;

    // 뉴스 작성자
    private String news_reporter;

    // 뉴스 조회수
    private Integer news_cnt;

    // 뉴스 사진
    private String news_photo;

    // 관리자 아이디
    private String admin_id;
}
