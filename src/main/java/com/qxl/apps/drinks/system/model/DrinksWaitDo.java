package com.qxl.apps.drinks.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DrinksWaitDo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;
    /**
     * 业务名称
     */
    private String businessName;
    /**
     * 发送日期
     */
    private String date;
    /**
     * 发送人
     */
    private String sender;
    /**
     * 内容
     */
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
