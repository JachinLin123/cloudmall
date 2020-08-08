package com.itmumu.userconsumer.service;

import com.itmumu.common.model.User;
import com.itmumu.userconsumer.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * @Classname LoginService
 * @Description TODO
 * @Date 2020-08-07 11:29
 * @Created by JachinLin
 */
@Component
@FeignClient(value = "user-provider",fallback = UserServiceHystrix.class)
public interface UserService {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public User login(@RequestParam(value = "uname") String uname);

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public  int register(@RequestParam(value = "upassword") String upassword,
        @RequestParam(value = "uname") String uname, @RequestParam(value = "usex") String usex);
}
