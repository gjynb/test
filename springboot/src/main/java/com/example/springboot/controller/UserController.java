package com.example.springboot.controller;

import com.example.springboot.entity.SelectUser;
import com.example.springboot.entity.UserInfo;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @author:fjh
 * @Date: 09:39
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * @author:fjh
     * @Date: 22:54
     * 与前台数据简单交流层
     */
    @Autowired
    private UserService userService;

    @RequestMapping("/insertUser")
    public int insertUser(UserInfo userInfo)
    {
        try {
            userInfo.setCreateBy("冯加豪");
            userInfo.setIsDeleted(0);
            userInfo.setId(UUID.randomUUID().toString());



        }catch (Exception e)
        {
            e.printStackTrace();
            return 0;
        }
        finally {
            return userService.insertUser(userInfo);
        }

    }
    @RequestMapping("/updateUser")
    public int updateUser(UserInfo userInfo)

    {
        try {

            userInfo.setCreateBy("b");
            return userService.updateUser(userInfo);

        }catch (Exception e)
        {
            e.printStackTrace();
            return 0;
        }


    }
    @RequestMapping("/selectUser")
    public List<SelectUser> selcetUser(SelectUser selectUser)
    {


        return userService.selectUser(selectUser);
    }
    /**
     * @author:fjh
     * @Date: 22:54
     * 数据假删除
     */
    @RequestMapping("/deleteUser")
    public int deleteUser(UserInfo userInfo) {
        try {
            userInfo.setIsDeleted(1);

        }catch (Exception e)
        {
            e.printStackTrace();

        }



        return userService.deleteUser(userInfo);
    }
    /**
     * @author:fjh
     * @Date: 22:54
     * 数据真删除
     */
    @RequestMapping("/delUserAll")
    public int delUserAll(UserInfo userInfo) {

        userInfo.setPhone("13105588619");
        userInfo.setUserPwd("123456");
        return userService.delUserAll(userInfo);
    }

}
