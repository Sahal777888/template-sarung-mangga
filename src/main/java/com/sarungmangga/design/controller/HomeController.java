package com.sarungmangga.design.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView index(){ return new ModelAndView("layouts/main"); }
    @GetMapping("/home")
    public ModelAndView home(){ return new ModelAndView("pages/home"); }
    @GetMapping("/profil")
    public ModelAndView profil(){ return new ModelAndView("pages/profil"); }
    @GetMapping("/product")
    public ModelAndView product(){ return new ModelAndView("pages/product"); }
    @GetMapping("/article")
    public ModelAndView article(){ return new ModelAndView("pages/article"); }

    @GetMapping("/page1")
    public ModelAndView page1(){ return new ModelAndView("pages/page1"); }
    @GetMapping("/page2")
    public ModelAndView page2(){ return new ModelAndView("pages/page2"); }
    @GetMapping("/page3")
    public ModelAndView page3(){ return new ModelAndView("pages/page3"); }

    @GetMapping("/detailproduct")
    public ModelAndView detailproduct(){ return new ModelAndView("pages/detailproduct"); }


    @GetMapping("/mainx")
    public ModelAndView mainx(){ return new ModelAndView("layouts/mainx"); }

}
