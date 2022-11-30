package com.first.boiler.controller;

import com.first.boiler.entity.MemberVO;
import com.first.boiler.mapper.MemberMapper;
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
    private MemberMapper mapper;

    @GetMapping("/login.do")
    public void login(){}

    @GetMapping("/services.do")
    public void services(){}

    @PostMapping("/signUp.do")
    public String SignUp(MemberVO vo){
        mapper.signUp(vo);
        return "redirect:/";
    }

    @PostMapping("/login.do")
    public String Login(String id, String pw, Model model){
        MemberVO vo = mapper.logIn(id, pw);
        model.addAttribute("vo", vo);
        return "index2";
    }

    @GetMapping("/about.do")
    public void about(HttpSession session){
        session.setAttribute("menu","about");
    };
}

