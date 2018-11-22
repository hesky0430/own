package com.example.demo.controller;


import com.example.demo.mapper.PersonInfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ApiController {

    Logger logger= LoggerFactory.getLogger(ApiController.class);

    @Resource
    PersonInfoMapper personInfoMapper;

    @RequestMapping("/hello")
    public String hellworld(){

        logger.debug("接口测试:{}","test");
        personInfoMapper.selectByPrimaryKey("130981199112064410");


        return "hellworld";
    }
}
