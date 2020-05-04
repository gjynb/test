package com.example.springboot.dao;

import com.example.springboot.entity.SelectUser;
import com.example.springboot.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    /**
     * 新增用户
     * @author fjh
     * @param
     * @return int
     * @date 2020-04-30
     */
    int saveUser(UserInfo userInfo);
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
