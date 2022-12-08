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
    private Integer news_idx;

    // 뉴스 카테고리
    private String news_category;

    // 뉴스 제목
    private String news_title;

    // 뉴스 내용
    private String news_content;

    // 뉴스 링크
    private String news_link;

    // 관리자 id
    private String admin_id;
}
