package com.hbuas.Dao;

public class UserDaoImpl implements UserDao{
    @Override
    public void getUsers() {
        System.out.println("调用获取用户方法");
    }
}
