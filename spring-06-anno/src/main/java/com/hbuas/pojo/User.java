package com.hbuas.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//组件 等价于 <bean id="user" class="com.hbuas.pojo.User"/>
@Component
@Scope("singleton")
public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    //相当于<property name="name" value="zhang"/>
    @Value("zhang")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Value("29")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
