package com.example.loginSQLiteDemo.Model;

public class Model {
    public String email;
    public String password;
    public boolean isremember;

    public Model( ){

    }

    public Model(String email, String password, boolean isremember) {
        this.email = email;
        this.password = password;
        this.isremember = isremember;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsremember() {
        return isremember;
    }

    public void setIsremember(boolean isremember) {
        this.isremember = isremember;
    }

    @Override
    public String toString() {
        return "Model{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isremember=" + isremember +
                '}';
    }
}
