package com.bms.pojo;

import java.util.Date;

public class TbBook {
    private Long id;

    private Long booknumber;

    private String initialnumber;

    private String bookname;

    private String image;

    private Long number;

    private Byte status;

    private Date created;

    private Date updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBooknumber() {
        return booknumber;
    }

    public void setBooknumber(Long booknumber) {
        this.booknumber = booknumber;
    }

    public String getInitialnumber() {
        return initialnumber;
    }

    public void setInitialnumber(String initialnumber) {
        this.initialnumber = initialnumber == null ? null : initialnumber.trim();
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}