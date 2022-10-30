package com.first.boiler.mapper;

import com.first.boiler.entity.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    public List<MemberVO> searchAll();
    public MemberVO logIn(String id, String pw);

    public void signUp(MemberVO vo);
}
