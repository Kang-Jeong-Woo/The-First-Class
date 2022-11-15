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
public class DeepLearningsVO {
    // 딥러닝 순번
    private Integer deep_seq;

    // 카테고리
    private String deep_category;

    // 분석 결과
    private String deep_result;

    // 분석 사진
    private String deep_img;

    // 분석 날짜
    private Date deep_dt;

    // 관리자 아이디
    private String admin_id;





}
