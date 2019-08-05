package com.test.Api.controller;

import com.test.Api.model.City;
import com.test.Api.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private ICityService cityService;

    @GetMapping("/showCities")
    @ResponseBody
    public List<City> findCities(Model model) {

        model.addAttribute("cities", (List<City>) cityService.findAll());

        return (List<City>) cityService.findAll();
    }

    @GetMapping("/test")
    @ResponseBody
    public String testService(){
        return "success test!";
    }

    @RequestMapping("/api")
    @ResponseBody
    public String test(){
        return "test is success";
    }
}
