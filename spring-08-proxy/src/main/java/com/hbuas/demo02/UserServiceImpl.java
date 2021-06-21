package com.hbuas.demo02;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add...");
    }

    @Override
    public void delete() {
        System.out.println("delete...");
    }

    @Override
    public void modify() {
        System.out.println("modify...");
    }

    @Override
    public void query() {
        System.out.println("query...");
    }
}
