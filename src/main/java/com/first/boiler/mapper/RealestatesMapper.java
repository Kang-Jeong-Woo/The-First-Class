package com.first.boiler.mapper;

import com.first.boiler.entity.RealestatesVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RealestatesMapper {
    public List<RealestatesVO> getAllRe();

    public List<RealestatesVO> distanceCheck(float lat, float lng, float level);

    public List<RealestatesVO> getAllLatLng();

    public RealestatesVO getMoal(int seq);
}
