package com.gengms.simplearch;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;


@Entity
public class User
{
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "user_id")
    private String userId;
    @ColumnInfo(name = "user_name")
    private String userName;
    private int sex;
    @ColumnInfo(name = "update_date")
    private String updateDate;
    private String phone;

    public User(String userId, String userName, String phone, int sex, String date)
    {
        this.userId = userId;
        this.userName = userName;
        this.phone = phone;
        this.sex = sex;
        this.updateDate = date;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public int getSex()
    {
        return sex;
    }

    public void setSex(int sex)
    {
        this.sex = sex;
    }

    public String getUpdateDate()
    {
        return updateDate;
    }

    public void setUpdateDate(String updateDate)
    {
        this.updateDate = updateDate;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", updateDate=" + updateDate +
                ", phone='" + phone + '\'' +
                '}';
    }
}
