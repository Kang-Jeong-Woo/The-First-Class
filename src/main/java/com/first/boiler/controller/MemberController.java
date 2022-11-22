package com.first.boiler.controller;

import com.first.boiler.entity.MemberVO;
import com.first.boiler.entity.RealestatesVO;
import com.first.boiler.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public void signIn(){}

    @GetMapping("goSignUp.do")
    public void signUp(){}

    @GetMapping("/signIn.do")
    public void signin(){}

    @GetMapping("/index.do")
    public void index(){}

    @GetMapping("/goLab.do")
    public void main(){}

    @GetMapping("/goBigdata.do")
    public void bigdata(){}

    @GetMapping("/goHousingMarket.do")
    public void housingmarket(){}

    @GetMapping("/about.do")
    public void about(){}

    @GetMapping("/contact.do")
    public void contact(){}

    @GetMapping("/services.do")
    public void services(){}

    @GetMapping("/single.do")
    public void single(){}

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
    @GetMapping("/map.do")
    public String goMap(Model model){
        List<RealestatesVO> re_list = mapper.getAllRe();
        model.addAttribute("re_list", re_list);
        return "map";
    }
    @GetMapping("/hello.do")
    public String hello(Model model){
        List<MemberVO> vo = mapper.searchAll();
        model.addAttribute("vo",vo);
        return "hello";
    }
    @GetMapping("/main.do")
    public String main(Model model){
        List<MemberVO> vo = mapper.searchAll();
        model.addAttribute("vo",vo);
        return "main";
    }
    @GetMapping("getRe.do")
    public @ResponseBody List<RealestatesVO> distanceCheck(float lat, float lng, float level){
        List<RealestatesVO> re_list = mapper.distanceCheck(lat, lng, level);
        return re_list;
    }
}
