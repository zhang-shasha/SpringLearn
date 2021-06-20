package com.hbuas.Service;

import com.hbuas.Dao.UserDao;
import com.hbuas.Dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUsers() {
        userDao.getUsers();
    }
}
