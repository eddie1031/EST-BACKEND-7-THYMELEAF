package com.est.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/page")
public class TemplateController2 {

    @GetMapping("/1")
    public String syntaxPage1(String username, Model model) {
        model.addAttribute("username", username);
        return "/syntax/page1";
    }

    @GetMapping("/2")
    public String syntaxPage2(Model model) {
        List<String> shoppingList = Arrays.asList("양파", "감자", "당근", "설탕", "몬스터", "커피");

        model.addAttribute("shoppingList", shoppingList);
        return "/syntax/page2";
    }

    @GetMapping("/3")
    public String syntaxPage3(Model model) {
        Post post = new Post(1L, "안녕하세요!", "관리자", "여러분 타임리프 너무 쉬워요! 즐거워요!");
        model.addAttribute("post", post);
        return "/syntax/page3";
    }

    @GetMapping("/4-1")
    public String syntaxPage4_1(Model model) {
        model.addAttribute("post", new Post());
        return "/syntax/page4-1";
    }

    @PostMapping("/4")
    public String doSyntaxPage(Post post, String author) {
        System.out.println("author = " + author);
        System.out.println("post = " + post);
        return "/syntax/page4-1";
    }

    @GetMapping("/5")
    public String syntaxPage5() {
        return "/syntax/page5";
    }

    @GetMapping("/6")
    public String syntaxPage6(int target, Model model) {
        model.addAttribute("target", target);
        return "/syntax/page6";
    }

    @GetMapping("/7")
    public String syntaxPage7(Model model) {
        model.addAttribute("username", "user1");
        return "/syntax/page7";
    }


}
