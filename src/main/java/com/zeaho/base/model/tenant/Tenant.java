package com.zeaho.base.model.tenant;

import com.zeaho.base.model.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by XHT on 2017/1/27.
 */
@Entity
@Table(name = "t_tenant")
public class Tenant{


    @NotNull
    private String name;

    @NotNull
    private String alias;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "add_time")
    private Timestamp addTime;

    @Column(name = "modify_time")
    private Timestamp modifyTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }


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
