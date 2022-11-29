package com.first.boiler.mapper;

import com.first.boiler.entity.MemberVO;
import com.first.boiler.entity.RealestatesVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    public List<MemberVO> searchAll();

    public MemberVO logIn(String id, String pw);

    public void signUp(MemberVO vo);

    public List<RealestatesVO> getAllRe();

    public List<RealestatesVO> distanceCheck(float lat, float lng, float level);

    public List<RealestatesVO> getAllLatLng();
}
