package com.first.boiler.controller;

import com.first.boiler.entity.MemberVO;
import com.first.boiler.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberMapper mapper;

    @GetMapping("/")
    public String index(Model model){
        List<MemberVO> vo = mapper.searchAll();
        model.addAttribute("vo",vo);
        return "index";
    }
    @GetMapping("goSignIn.do")
    public String goSignIn(){
        return "signIn";
    }
    @GetMapping("goSignUp.do")
    public String goSignUp(){
        return "signUp";
    }
    @GetMapping("/signIn.do")
    public void signin(){

    }

    @PostMapping("/login.do")
    public String Login(String id, String pw, Model model){
        MemberVO vo = mapper.logIn(id, pw);
        model.addAttribute("vo", vo);
        return "index";
    }

    @PostMapping("/signUp.do")
    public String SignUp(MemberVO vo){
        mapper.signUp(vo);
        return "redirect:/";
    }

    @GetMapping("/goMap.do")
    public String goMap(){
        return "map";
    }

    @GetMapping("/goLab.do")
    public String goLab(){ return "lab";}
}
