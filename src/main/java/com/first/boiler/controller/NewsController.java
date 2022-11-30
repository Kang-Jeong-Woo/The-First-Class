package com.first.boiler.controller;

import com.first.boiler.entity.MemberVO;
import com.first.boiler.mapper.MemberMapper;
import com.first.boiler.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class NewsController {
    @Autowired
    private NewsMapper newsMapper;

    @Autowired
    private MemberMapper memberMapper;

    @GetMapping(value = {"/","home.do"})
    public String index(HttpSession session){
        session.setAttribute("menu","home");
        return "home";
    }
}
