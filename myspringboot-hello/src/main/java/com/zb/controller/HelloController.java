package com.zb.controller;

import com.zb.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  //@Controller @ResponseBody
public class HelloController {

    //@RequestMapping(value = "/show" ,method = RequestMethod.GET)
    @GetMapping(value = "/showUser")
    public User showUser(){
        return new User();
    }

}
