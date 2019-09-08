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
public class DemoModel01 {

    @RequestMapping("/user")
    public Object show(HttpServletRequest request) {
        String realPath = request.getServletContext().getRealPath("/");
        String substring = realPath.substring(realPath.lastIndexOf("\\") + 1);
        System.out.println("substring = " + substring);
        return "1111";
    }
}
