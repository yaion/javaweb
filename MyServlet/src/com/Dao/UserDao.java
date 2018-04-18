package com.Dao;

import com.Bean.User;

import java.util.List;

interface  UserDao {

    public User getUser(String name);

    public List<User> getAll();

    public boolean setUser(String name,String pass);

}
