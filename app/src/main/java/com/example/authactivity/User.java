package com.example.authactivity;

public class User
{
    String userFirstName;
    String password;
    String emailAddress;
    String userLastName;

    public User() {
    }

    public User(String userFirstName,String userLastName, String emailAddress) {
        this.userFirstName = userFirstName;
        this.emailAddress = emailAddress;
        this.userLastName = userLastName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
}
