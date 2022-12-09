package com.first.boiler.controller;

import com.first.boiler.entity.Area_bVO;
import com.first.boiler.entity.Area_cVO;
import com.first.boiler.mapper.DongMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DongController {
    @Autowired
    DongMapper mapper;

    @GetMapping("getReDong.do")
    public @ResponseBody List<Area_cVO> getReDong(){
        List<Area_cVO> list = mapper.getReDong();
        return list;
    }

    @GetMapping("getReGu.do")
    public @ResponseBody List<Area_bVO> getReGu(){
        List<Area_bVO> list = mapper.getReGu();
        return list;
    }

}
