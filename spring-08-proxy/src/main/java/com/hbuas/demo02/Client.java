package com.hbuas.demo02;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserProxy userServiceProxy = new UserProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.add();
        userServiceProxy.delete();
        userServiceProxy.modify();
        userServiceProxy.query();
    }
}
