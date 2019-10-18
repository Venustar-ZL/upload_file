package com.learn.upload_file.controller;

import com.learn.upload_file.entity.User;
import com.learn.upload_file.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FileUploadController {

    @Autowired
    private UserDaoService userDaoService;

    // 跳转至登陆页面
    @RequestMapping(value = "/login")
    public String login (ModelMap map) {
        map.put("title","登录......");
        return "login";
    }

    // 跳转至文件上传页面
    @RequestMapping(value = "/file")
    public String fileUpload (ModelMap map, @RequestParam("username") String username,
                              @RequestParam("password") String password) {
        List<User> users = userDaoService.selectAll();
        for (User user : users) {
            if (!user.getUsername().equals(username) || !user.getPassword().equals(password)) {
                map.put("title","登录......");
                return "login";
            }
        }
        map.put("title","上传文件......");
        return "file";
    }

}
