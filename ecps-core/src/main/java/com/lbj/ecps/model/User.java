package com.lbj.ecps.model;

/**
 * Created by gqq on 2018/1/13.
 */
public class User {
    private  Integer id;
    private  String name;
    private  Integer gender;
    private  Integer UserName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getUserName() {
        return UserName;
    }

    public void setUserName(Integer userName) {
        UserName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", UserName=" + UserName +
                '}';
    }
}
