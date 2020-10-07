package com.reminderMain.controller;

import com.common.base.ResultBody;
import com.common.excetion.common.BizException;
import com.common.po.User;
import com.common.base.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: ybx
 * @email: 1520688026@qq.com
 * @date: 2020/10/6 11:37 下午
 */
@ResponseResult
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("/user")
    public List<User> test(){
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            User user = new User();
            user.setUsername("user"+i);
            user.setPassword(i+"");
            users.add(user);
        }
        return users;
    }

    @GetMapping("test2/{a}")
    public Object test2(@PathVariable("a") String a){
        return a;
    }

    @GetMapping("test3")
    public ResultBody test3(){
        return ResultBody.success();
    }

    @GetMapping("test4/{i}")
    public Object test4(@PathVariable("i") Integer i) throws Throwable {

            if (1 == i){
                throw new Exception("exceptin出现异常");
            }else if (2== i){
               throw new Throwable("throwable");
            }else if (3 == i){
                throw new NullPointerException("空了");
            }else if (4 ==i){
                throw new BizException("-072","自定义错误");
            }
        return null;
    }
}
