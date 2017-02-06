package com.zeaho.tenant.form;

import javax.validation.constraints.NotNull;

/**
 * Created by xht on 2017/2/5.
 */
public class LoginForm {
    @NotNull
    private String username;

    @NotNull
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
