package cn.scu.iot.datastatistics.controller;

import cn.scu.iot.datastatistics.entity.User;
import cn.scu.iot.datastatistics.entity.UserBasicInfo;
import cn.scu.iot.datastatistics.mapper.UserBasicInfoMapper;
import cn.scu.iot.datastatistics.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DemoController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserBasicInfoMapper userBasicInfoMapper;

    @GetMapping(value = "/hello")
    public String testRequest() {
        return "hello";
    }

    @GetMapping("/user1")
    public User getUser1(){
        return userMapper.getOne(1);
    }

    @GetMapping("/userbasicinfo1")
    public  UserBasicInfo getUserBasicInfo1() {
        return userBasicInfoMapper.getOne(29);
    }

    @GetMapping("/getall")
    public List<UserBasicInfo> getAll() {
        return userBasicInfoMapper.getAll();
    }
}
