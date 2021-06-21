package com.hbuas.demo02;

public class UserProxy implements UserService{
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        Log("add");
        userService.add();

    }

    @Override
    public void delete() {
        Log("delete");
        userService.delete();
    }

    @Override
    public void modify() {
        Log("modify");
        userService.modify();
    }

    @Override
    public void query() {
        Log("query");
        userService.query();
    }
    public void Log(String msg){
        System.out.println("do" + msg + "...");
    }
}
