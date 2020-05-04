package com.example.springboot.service;

import com.example.springboot.entity.SelectUser;
import com.example.springboot.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /**
     * 新增用户
     * @author wwb
     * @param userInfo
     * @return int
     * @date 2020-04-30
     */
    int insertUser(UserInfo userInfo);
    int updateUser(UserInfo userInfo);
    List<SelectUser> selectUser(SelectUser selectUser);
    /**
     * @author:fjh
     * @Date: 22:55
     * 数据假删除
     */
    int  deleteUser(UserInfo userInfo);
    /**
     * @author:fjh
     * @Date: 22:54
     * 数据真删除
     */
    int delUserAll(UserInfo userInfo);
}
