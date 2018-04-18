package com.Dao;

import com.Bean.User;
import com.Service.UserService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
    public static void main(String[] args){
        Connect c = new Connect();
        Connection conn = c.getConn();
        if(conn != null) {

            Statement stmt = null;
            ResultSet rs = null;
            ResultSet re = null;
            try {
                stmt = conn.createStatement();
                re = stmt.executeQuery("SELECT * FROM product where id = 1");
                //System.out.print(re.getString("product"));
               while (re.next()) {
                    System.out.print("re");
                    System.out.println(re.getString("product") + " 价格：" + re.getDouble("discounts"));
                }
                rs = stmt.executeQuery("SELECT * FROM product");
                while (rs.next()) {
                    System.out.println(rs.getString("product") + " 价格：" + rs.getDouble("discounts"));
                }
                re.close();
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        //System.out.print("没有");
        UserDaoImp dao = new UserDaoImp();
        User user = dao.getUser("tom");
        //System.out.print(user.getPassworld());
        if(user.getPassworld().equals("123456")){
            System.out.print("成功");
        }else {
            System.out.print("失败");
        }

        boolean b = new UserService().login("tom","123456");
        if(!b){
            System.out.print("失败1");
        }else {
            System.out.print("成功1");
        }
    }
}
