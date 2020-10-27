package com.fa.entity;

import java.io.Serializable;
import java.util.List;

/*create table user
        (
        u_id int auto_increment primary key comment '主键id',
        u_name varchar(20) unique not null comment '收货人',
        u_phone varchar(11) unique not null comment '手机号',
        is_delete int default 1 not null comment '0表示已删除，1表示未删除'
        )comment '收货人信息表';*/
public class User implements Serializable {
    /**
     * 主键id
     */
    private Integer uId;

    /**
     * 收货人
     */
    private String uName;

    /**
     * 手机号
     */
    private String uPhone;

    /**
     * 0表示已删除，1表示未删除
     */
    private Integer isDelete;

    /**
     * 地址集合
     */
    private List<Address> addresses;

    private static final long serialVersionUID = 1L;

    public User(Integer uId) {
        this.uId = uId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPhone='" + uPhone + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}

