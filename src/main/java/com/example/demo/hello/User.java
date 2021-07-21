package com.example.demo.hello;


public class User {
    private int id;
    private String name;
    private String password;
    private int admin_flg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getAdming_Flg() {
        return admin_flg;
    }

    public void setAdmin_Flg(int admin_flg) {
        this.admin_flg = admin_flg;
    }
}
