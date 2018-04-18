package com.Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
   jdbc 的连接，放回连接对象
 */
public class Connect {
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
     static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/test";
     static final String USER = "root";
     static final String PASSWORD = "root";
     static final Connection conn = null;
     public Connect(){
         super();
     }

     //获取连接
     public Connection getConn(){
         Connection conn = this.conn;
         try {
             //加载驱动
             Class.forName(JDBC_DRIVER);
             //获取连接
            conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            //System.out.print(conn==null);
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return conn;
     }
}
