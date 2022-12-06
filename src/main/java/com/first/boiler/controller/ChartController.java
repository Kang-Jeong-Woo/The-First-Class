package com.first.boiler.controller;

import com.first.boiler.mapper.ChartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ChartController {
    
	@Autowired
    private ChartMapper mapper;

    @GetMapping("/chart.do")
    public void map(HttpSession session){
        session.setAttribute("menu","chart");
    };


}
