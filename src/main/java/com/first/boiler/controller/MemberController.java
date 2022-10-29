package com.first.boiler.controller;

import com.first.boiler.entity.MemberVO;
import com.first.boiler.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
