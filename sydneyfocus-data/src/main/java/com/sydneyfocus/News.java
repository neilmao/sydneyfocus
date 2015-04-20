package com.sydneyfocus;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: neilmao
 * Date: 17/04/15
 */
@Entity(name = "News")
public class News {

    private String title;
    private String content;
    private User author;
    private Date createdDate;
    private Date updatedDate;
    private User lastUpdateUser;
    private NewsStatus status;

    public News() {
    }

    @Column(name = "Status")
    public NewsStatus getStatus() {
        return status;
    }

    public void setStatus(NewsStatus status) {
        this.status = status;
    }

    @Column(name = "LastUpdateUser")
    public User getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(User lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    @Column(name = "UpdatedDate")
    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Column(name = "CreatedDate")
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Column(name = "Author")
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Column(name = "Content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
