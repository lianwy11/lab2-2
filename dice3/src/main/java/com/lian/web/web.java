package com.lian.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: SORA
 * @Date: 2022/11/02/22:02
 * @Description:
 */
@RestController
public class web {
    @RequestMapping("test")
public String test(){
    return "hello";


    }

}
