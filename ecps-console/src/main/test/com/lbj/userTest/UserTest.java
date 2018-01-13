package com.lbj.userTest;

import com.lbj.model.User;
import org.junit.Test;

/**
 * Created by gqq on 2018/1/13.
 */
public class UserTest {


    @Test
    public  void getUserList(){
        User user = new User();
        user.setGender(1);
        user.setId(2);
        user.setName("小明");
        user.setUserName(888888);
        System.out.println(user);
    }
}
