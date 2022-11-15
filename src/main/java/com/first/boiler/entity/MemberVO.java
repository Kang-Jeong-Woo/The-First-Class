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
public class MemberVO {
    // 회원 아이디
    private String mem_id;

    // 회원 비밀번호
    private String mem_pw;

    // 회원 이름
    private String mem_name;

    // 회원 이메일
    private String mem_email;

    // 회원 가입일자
    private Date mem_joindate;

    // 회원 유형
    private String mem_type;
}
