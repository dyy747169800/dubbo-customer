package com.uban.customer.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.uban.entity.User;
import com.uban.service.DubboDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by DuanYangYu on 2016/11/2 0002.
 */
@Controller
public class DubboDemoController {

    @Autowired
    private DubboDemoService dubboDemoService;

    @RequestMapping("/demo")
    public ModelAndView demo(@RequestParam("val")String val){

        JSONObject result = dubboDemoService.demo(val);
        ModelAndView demo = new ModelAndView("demo");
        demo.addObject("result",result.getString("result"));


        JSONObject users = dubboDemoService.getUsers();
        if(users.get("result")!=null){
            List<User> userList = JSON.parseObject(JSON.toJSONString(users.get("result")),new TypeReference<List<User>>(){});
            demo.addObject("users",userList);
        }

        return demo;
    }

}
