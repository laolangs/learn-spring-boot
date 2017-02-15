package com.fyxj.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.Authenticator;

/**
 * Created by carl on 2017/2/15.
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method= RequestMethod.GET)
    @ResponseBody
    public String hello(String name){
        return  "Hello "+name;
    }
}
