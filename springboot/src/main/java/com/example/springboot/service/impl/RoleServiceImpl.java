package com.example.springboot.service.impl;

import com.example.springboot.dao.RoleDao;
import com.example.springboot.dao.UserDao;
import com.example.springboot.entity.RoleInfo;
import com.example.springboot.entity.SelectUser;
import com.example.springboot.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private UserDao userDao;
    @Override
    public int insertUser(RoleInfo roleInfo) {

        return roleDao.saveUser(roleInfo);
    }

    @Override
    public int updateUser(RoleInfo roleInfo) {
        return roleDao.updateUser(roleInfo);
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

    @Override
    public int deleteUser(RoleInfo roleInfo) {
        return roleDao.deleteUser(roleInfo);
    }

    @Override
    public int delUserAll(RoleInfo roleInfo) {
        return roleDao.delUserAll(roleInfo);
    }
}
