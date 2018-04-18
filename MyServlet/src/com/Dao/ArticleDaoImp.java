package com.Dao;

import com.Bean.Article;
import com.Bean.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *articleDao的实现类
 */
public class ArticleDaoImp implements ArticleDao{
    private Connect con = new Connect();
    public ArticleDaoImp(){
        super();
    }
    //连接对象
    //public static
    @Override
    public Article getArticle() {

        return null;
    }

    @Override
    public List<Article> getAll() {
        ArrayList<Article> list= new ArrayList<Article>();
        Connection conn = con.getConn();
        Statement statm =null;
        String sql = "SELECT * FROM essay";
        Article article = new Article();
        //ArrayList list = new ArrayList<User>();
        try {
            statm = conn.createStatement();
            ResultSet re = statm.executeQuery(sql);
            while (re.next()){
                article.setId(re.getInt("id"));
                article.setTitle(re.getString("title"));
                article.setMessage(re.getString("message"));
                list.add(article);
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
}
