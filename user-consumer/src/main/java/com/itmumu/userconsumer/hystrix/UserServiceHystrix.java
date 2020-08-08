package com.itmumu.userconsumer.hystrix;

import com.itmumu.common.model.User;
import com.itmumu.userconsumer.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements UserService {
    @Override
    public User login(String uaccount) {
        return null;
    }

    @Override
    public int register(String upassword, String uname, String usex) {
        return 0;
    }
}
