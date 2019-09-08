package com.city.demo.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yuminghao
 * @Date 2019/9/4 10:31
 * @About
 */
@RestController
public class DemoModel {

    @RequestMapping("/user")
    public Object show(HttpServletRequest request) {
        String realPath = request.getServletContext().getRealPath("/");
        String substring = realPath.substring(realPath.lastIndexOf("\\") + 1);
        System.out.println("substring = " + substring);
        System.out.println("这是一个新的分支");
        return "1111";
    }
}
