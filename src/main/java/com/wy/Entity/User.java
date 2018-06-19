package com.wy.Entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;//遵循命名规范 以自动和user表的属性名对应

    private String userName;

    private String password;
    private int authority;

    public String getPassword() {
        return password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }
}