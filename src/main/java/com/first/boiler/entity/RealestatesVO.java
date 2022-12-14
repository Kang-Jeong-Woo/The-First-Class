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
public class RealestatesVO {
    // 상가업소 아이디
    private Integer re_id;

    // 카테고리
    private String re_categoy;

    // 매물명
    private String re_name;

    // 지번
    private String re_jibun;

    // 동
    private String re_dong;

    // 면적
    private String re_area;

    // 건축년도
    private String re_year;

    // 위도
    private Double lat;

    // 경도
    private Double lng;

    // 사용 승인일
    private String re_dt;

    // 보증금
    private Integer re_deposit;

    // 월세
    private Integer re_rent;

    // 매출액
    private Integer re_sales;

    // 건축물 용도
    private String re_usage;

    // 회원 아이디
    private String mem_id;
}
