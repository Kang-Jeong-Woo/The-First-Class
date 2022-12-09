package com.first.boiler.mapper;

import com.first.boiler.entity.Area_bVO;
import com.first.boiler.entity.Area_cVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DongMapper {

    public List<Area_cVO> getReDong();

    public List<Area_bVO> getReGu();
}
