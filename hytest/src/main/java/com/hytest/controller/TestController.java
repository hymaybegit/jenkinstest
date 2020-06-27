package com.hytest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2020/6/27.
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String list() {
        return "hello i am hank";
    }


}
