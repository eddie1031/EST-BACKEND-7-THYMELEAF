package com.est.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layouts/pages")
public class TemplateController3 {

    @GetMapping("/1")
    public String showPage1() {
        return "/pages/layout_page_1";
    }

    @GetMapping("/2")
    public String showPage2() {
        return "/pages/layout_page_2";
    }

    @GetMapping("/3")
    public String showPage3(Model model) {
        model.addAttribute("isLogin", true);
        return "/pages/layout_page_3";
    }

    @GetMapping("/4")
    public String showPage4(Long postId, Model model) {
        model.addAttribute("isLogin", true);
        model.addAttribute("post", new Post(1L, "안녕하세요!", "관리자!", "타임리프 너무 재밌어요!"));
        return "/pages/layout_page_4";
    }


}
