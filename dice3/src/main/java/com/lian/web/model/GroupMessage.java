package com.lian.web.model;

import org.springframework.stereotype.Component;

@Component
public class GroupMessage {
    private Integer id;

    private String usersend;

    private String time;

    private Integer roomnumber;

    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsersend() {
        return usersend;
    }

    public void setUsersend(String usersend) {
        this.usersend = usersend;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(Integer roomnumber) {
        this.roomnumber = roomnumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}