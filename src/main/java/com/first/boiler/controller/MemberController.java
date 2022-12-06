package com.first.boiler.controller;

import com.first.boiler.entity.Criteria;
import com.first.boiler.entity.MemberVO;
import com.first.boiler.entity.RealestatesVO;
import com.first.boiler.mapper.MemberMapper;
import com.first.boiler.mapper.RealestatesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberMapper memMapper;
    @Autowired
    private RealestatesMapper relMapper;

    @GetMapping("/login.do")
    public void login(){}

    @GetMapping("/services.do")
    public void services(){}

    @PostMapping("/signUp.do")
    public String SignUp(MemberVO vo){
        memMapper.signUp(vo);
        return "redirect:/";
    }

    @PostMapping("/login.do")
    public String Login(String id, String pw, Model model){
        MemberVO vo = memMapper.logIn(id, pw);
        model.addAttribute("vo", vo);
        return "index2";
    }

    @GetMapping("/about.do")
    public void about(HttpSession session, Criteria criteria){
        // 최근 매물을 가져오는 함수
        List<RealestatesVO> newRel = relMapper.getNewRel();
        // 사용자가 등록한 매물을 가져오는 함수
        List<RealestatesVO> userRel = relMapper.getUserRel("강정우");

        session.setAttribute("menu","about");
        session.setAttribute("user","Kang");
        session.setAttribute("newRel", newRel);
        session.setAttribute("userRel", userRel);
    };

}

