package cn.scu.iot.datastatistics.controller;

import cn.scu.iot.datastatistics.entity.User;
import cn.scu.iot.datastatistics.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {

    @Autowired
    UserMapper userMapper;

    @GetMapping(value = "/hello")
    public String testRequest() {
        return "hello";
    }

    @GetMapping("/user1")
    public User getUser1(){
        return userMapper.getOne(1);
    }
}
