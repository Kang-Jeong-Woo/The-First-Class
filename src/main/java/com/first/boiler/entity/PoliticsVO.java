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
public class PoliticsVO {

    // 정책 순번
    private Integer poli_seq;

    // 정책 제목
    private String poli_title;

    // 정책 내용
    private String poli_content;

    // 정책 관련기관
    private String poli_org;

    // 정책 게시일자
    private Date poli_dt;

    // 정책 작성자
    private String poli_man;

    // 정책 조회수
    private Integer poli_cnt;

    // 정책 사진
    private String poli_photo;

    // 관리자 아이디
    private String admin_id;
}
