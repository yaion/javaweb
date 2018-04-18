package com.Dao;

import com.Bean.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImp implements UserDao{
    private Connect con = new Connect();
    public UserDaoImp(){
        super();
    }
    @Override
    public User getUser(String name) {
        //
        Connection conn = con.getConn();
        Statement statm =null;
        String sql = "SELECT * FROM USER WHERE name='"+name+"'";
        //System.out.print(sql);
        User user = new User();
        try {
            statm = conn.createStatement();
            ResultSet res = statm.executeQuery(sql);
            while (res.next()){
                user.setName(res.getString("name"));
                user.setPassworld(res.getString("passworld"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
                try {
                    if(conn != null){
                    conn.close();
                    }
                    if (statm!=null){
                        statm.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        return user;
    }

    @Override
    public List<User> getAll() {
        Connection conn = con.getConn();
        Statement statm =null;
        String sql = "SELECT * FROM user";
        User user = new User();
        ArrayList list = new ArrayList<User>();
        try {
            statm = conn.createStatement();
            ResultSet re = statm.executeQuery(sql);
            while (re.next()){
                user.setName(re.getString("name"));
                user.setName(re.getString("passworld"));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(conn != null){
                    conn.close();
                }
                if (statm!=null){
                    statm.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public boolean setUser(String name,String pass) {
        Connection conn = con.getConn();
        Statement statm =null;
        String sql = "INNER INTO user VALUE ('"+name+"','"+pass+"')";
        boolean bool = false;
        try {
            statm = conn.createStatement();
            int re = statm.executeUpdate(sql);
            if(re > 0){
               bool = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(conn != null){
                    conn.close();
                }
                if (statm!=null){
                    statm.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return bool;
    }
}
