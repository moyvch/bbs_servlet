package com.moyv.bbs_servlet.entity;

import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA
 *
 * @author moyv
 * Date: 2021/7/19
 * Time: 15:14
 * Description:
 */
public class User {
    private Integer userAccount;
    private String userPassword;
    private String userName;
    private String user_sex;
    private String userSign;
    private Timestamp userLoginTime;

    public Integer getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(Integer userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUserSign() {
        return userSign;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }

    public Timestamp getUserLoginTime() {
        return userLoginTime;
    }

    public void setUserLoginTime(Timestamp userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userAccount=" + userAccount +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", userSign='" + userSign + '\'' +
                ", userLoginTime=" + userLoginTime +
                '}';
    }
}
