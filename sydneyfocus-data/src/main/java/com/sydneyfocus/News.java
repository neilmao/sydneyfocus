package com.sydneyfocus;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: neilmao
 * Date: 17/04/15
 */
@Entity(name = "News")
public class News extends Guid{

    private String title;
    private String content;
    private User author;
    private Date createdDate;
    private Date updatedDate;
    private User lastUpdateUser;
    private NewsStatus status;
    private int visits;
    private NewsCategory category;

    public News() {
       init();
    }

    private void init() {
        this.category = NewsCategory.Current;
        this.visits = 0;
        this.createdDate = new Date();
        this.updatedDate = this.createdDate;
        this.status = NewsStatus.NotActive;
    }

    public void delete() {
        this.status = NewsStatus.Deleted;
    }

    @Column(name = "Status")
    public NewsStatus getStatus() {
        return status;
    }

    public void setStatus(NewsStatus status) {
        this.status = status;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LastUpdateUserId")
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AuthorId")
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

    @Column(name = "Visits")
    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    @Column(name = "Category")
    public NewsCategory getCategory() {
        return category;
    }

    public void setCategory(NewsCategory category) {
        this.category = category;
    }
}
