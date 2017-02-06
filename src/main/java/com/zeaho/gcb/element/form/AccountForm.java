package com.zeaho.gcb.element.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by XHT on 2017/1/28.
 */
public class AccountForm {
    @NotNull
    @Size(min = 2, max = 16)
    private String alias;

    @NotNull
    @Size(min = 2, max = 32)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
