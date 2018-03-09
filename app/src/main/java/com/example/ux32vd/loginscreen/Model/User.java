package com.example.ux32vd.loginscreen.Model;

/**
 * Created by UX32VD on 08/03/2018.
 */

public class User {

    private String name;
    private String password;

    public User() {
    }

    public User(String Pname, String Ppassword) {


        name = Pname;
        password = Ppassword;
    }

    public String setName(String Pname) {
        name = Pname;
        return name;
    }

    public String getName() {
        return name;
    }

    public String getpassword() {
        return password;
    }
}