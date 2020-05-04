package com.example.springboot.service.impl;

import com.example.springboot.dao.UserDao;
import com.example.springboot.entity.SelectUser;
import com.example.springboot.entity.UserInfo;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * @author:fjh
 * @Date: 09:41
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(UserInfo userInfo) {
        //写业务逻辑
        String userName = userInfo.getUserName();
        if(null != userName && !"".equals(userName)){
            userName = userName + "H";
            userInfo.setUserName(userName);

        }
        String regex = "^(1[3-9]\\d{9}$)";
        String phone = userInfo.getPhone();
        if(regex.equals(phone))
        {
            userInfo.setPhone(userInfo.getPhone());

        }
        else {
            System.out.println("对不起，请输入正确的手机号");
        }




        return userDao.saveUser(userInfo);
    }


    @Override
    public int updateUser(UserInfo userInfo) {
        return userDao.updateUser(userInfo);
    }




    @Override
    public List<SelectUser> selectUser(SelectUser selectUser) {

        List<SelectUser> list=userDao.selectUser(selectUser);

        SelectUser select=null;
        Iterator<SelectUser> iterator = list.iterator();

        while (iterator.hasNext()) {

            select = iterator.next();

            String sex = select.getSex();
            if("0".equals(sex))
            {
                sex="女";

            }
            else {
                sex="男";

            }
            select.setSex(sex);




        }


        return list;
    }

    /**
     * @author:fjh
     * @Date: 22:54
     * 数据假删除
     */


    @Override
    public int deleteUser(UserInfo userInfo) {


        return userDao.deleteUser(userInfo);
    }
    /**
     * @author:fjh
     * @Date: 22:54
     * 数据真删除
     */
    @Override
    public int delUserAll(UserInfo userInfo) {
        return userDao.delUserAll(userInfo);
    }

}
