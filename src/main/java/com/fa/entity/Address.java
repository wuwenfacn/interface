package com.fa.entity;

import java.io.Serializable;
/*create table address
        (
        a_id int auto_increment primary key comment '主键id',
        u_id int not null comment 'user表的主键',
        a_address varchar(255) not null comment '所在地',
        a_d_address varchar(255) not null comment '详细地址',
        a_status int default 0 unique not null comment '0表示不为默认地址，1表示为默认地址',
        is_delete int default 1 not null comment '0表示已删除，1表示未删除'
        )comment '地址信息表';*/
public class Address implements Serializable {
    /**
     * 主键id
     */
    private Integer aId;

    /**
     * user表的主键
     */
    private Integer uId;

    /**
     * 所在地
     */
    private String aAddress;

    /**
     * 详细地址
     */
    private String aDAddress;

    /**
     * 0表示不为默认地址，1表示为默认地址
     */
    private Integer aStatus;

    /**
     * 0表示已删除，1表示未删除
     */
    private Integer isDelete;

    private static final long serialVersionUID = 1L;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getaAddress() {
        return aAddress;
    }

    public void setaAddress(String aAddress) {
        this.aAddress = aAddress;
    }

    public String getaDAddress() {
        return aDAddress;
    }

    public void setaDAddress(String aDAddress) {
        this.aDAddress = aDAddress;
    }

    public Integer getaStatus() {
        return aStatus;
    }

    public void setaStatus(Integer aStatus) {
        this.aStatus = aStatus;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aId=" + aId +
                ", uId=" + uId +
                ", aAddress='" + aAddress + '\'' +
                ", aDAddress='" + aDAddress + '\'' +
                ", aStatus=" + aStatus +
                '}';
    }
}

