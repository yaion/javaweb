package com.Bean;

public class Article {
    private int id;
    private String title;
    private String author;
    private String imgUrl;
    private String message;

    public Article(){
        super();
    }

    public Article(String title,String author,String imgUrl,String message){
        this.title   = title;
        this.author  = author;
        this.imgUrl  = imgUrl;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
