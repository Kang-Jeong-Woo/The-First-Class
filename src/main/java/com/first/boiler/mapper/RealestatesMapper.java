package com.first.boiler.mapper;

import com.first.boiler.common.dto.SearchDTO;
import com.first.boiler.entity.Criteria;
import com.first.boiler.entity.RealestatesVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RealestatesMapper {
    public List<RealestatesVO> getAllRe();

    public List<RealestatesVO> distanceCheck(float lat, float lng, float level);

    public List<RealestatesVO> getAllLatLng();

    public RealestatesVO getMoal(int seq);

    public List<RealestatesVO> getNewRel();

    public List<RealestatesVO> getUserRel(String mem_id);

    public int count(SearchDTO params);

    public void insertRel(RealestatesVO vo);
}
