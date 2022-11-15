package com.first.boiler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class KeywordsVO {
    // 키워드 순번
    private Integer keyword_seq;

    // 년도
    private Integer keyword_year;

    // 키워드
    private String keyword_content;

    // 횟수
    private Integer keyword_cnt;

    // 관리자 아이디
    private String admin_id;
}
