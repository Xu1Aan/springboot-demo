package com.pzhu.web;

import com.pzhu.mapper.UserMapper;
import com.pzhu.pojo.User;
import com.pzhu.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

@Controller
@Slf4j
@RequestMapping("user")
public class HelloController {

//    @Autowired
//    private DataSource dataSource;
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    @ResponseBody
    public User hello(@PathVariable("id")Long id){
       log.debug("hello method is running");
        return userService.queryById(id);
    }
}
