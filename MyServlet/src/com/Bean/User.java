package com.Bean;

public class User {

    private String name;
    private String passworld;

    public User(){
        super();
    }

    public User(String name,String passworld){
        this.name       = name;
        this.passworld = passworld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

}
