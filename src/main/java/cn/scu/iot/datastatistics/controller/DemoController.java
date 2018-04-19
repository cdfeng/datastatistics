package cn.scu.iot.datastatistics.controller;

import cn.scu.iot.datastatistics.entity.StatisticsEntity;
import cn.scu.iot.datastatistics.entity.UserBasicInfo;
import cn.scu.iot.datastatistics.mapper.StatisticsEntityMapper;
import cn.scu.iot.datastatistics.mapper.UserBasicInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {


    @Autowired
    UserBasicInfoMapper userBasicInfoMapper;

    @GetMapping(value = "/hello")
    public String testRequest() {
        return "hello";
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
