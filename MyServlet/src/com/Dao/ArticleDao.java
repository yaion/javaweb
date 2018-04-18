package com.Dao;
import com.Bean.Article;

import java.util.List;

interface ArticleDao {
    public Article getArticle();
    public List<Article> getAll();
}
