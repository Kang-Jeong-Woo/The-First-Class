package com.first.boiler.controller;

import com.first.boiler.entity.MemberVO;
import com.first.boiler.entity.RealestatesVO;
import com.first.boiler.mapper.RealestatesMapper;
import jdk.jfr.Frequency;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class RealestatesController {

    @Autowired
    private RealestatesMapper mapper;

    @GetMapping("/map.do")
    public void map(HttpSession session){
        session.setAttribute("menu","map");
    };

    @GetMapping("/getRe.do")
    public @ResponseBody List<RealestatesVO> distanceCheck(float lat, float lng, float level){
        List<RealestatesVO> re_list = mapper.distanceCheck(lat, lng, level);
        return re_list;
    }

    @GetMapping("/getLatLng.do")
    public @ResponseBody HashMap<String, List<RealestatesVO>> getLatLng(){
        List<RealestatesVO> latLngList = mapper.getAllLatLng();
        HashMap<String, List<RealestatesVO>> list = new HashMap<>();
        list.put("positions", latLngList);
        return list;
    }

    @GetMapping("getModal.do")
    public @ResponseBody RealestatesVO getMoal(int seq){
        RealestatesVO vo = mapper.getMoal(seq);
        return vo;
    }

    @GetMapping("/goRegRel.do")
    public @ResponseBody void goAbout(RealestatesVO vo){
        mapper.insertRel(vo);
    }
}