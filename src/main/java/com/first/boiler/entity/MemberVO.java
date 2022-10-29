package com.first.boiler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberVO {
    private String id;
    private String pw;
    private String nick;
    private String addr;
//    private String mb_gender;
//    private String mb_birthdate;
//    private String mb_addr;
//    private String mb_joindate;
//    private String party;
//    private String admin_yn;
}
