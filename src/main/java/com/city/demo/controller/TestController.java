package com.city.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @author yuminghao
 * @Date 2019/9/8 14:30
 * @About
 */
@RestController
@RequestMapping("/v1/user")
public class TestController {

    /**
     * 上传
     * @param uploadFile
     */
    @RequestMapping("/file/upload")
    public void uploadFile(MultipartFile uploadFile, String username, String password, HttpServletRequest request) {
        try {
            if(uploadFile != null) {
                String modelName = "xxxx模型";
                String effectiveVersion = "v1.0";
                // 文件名
                String filePath = request.getServletContext().getRealPath("/") + modelName + "_" + effectiveVersion;

                File newFile = new File(filePath);
                //通过MultipartFile的方法直接写文件
                uploadFile.transferTo(newFile);
                }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("上传失败");
        }
    }

    @RequestMapping(value = "/index")
    public String getIndex() {
        return "index";
    }



}
