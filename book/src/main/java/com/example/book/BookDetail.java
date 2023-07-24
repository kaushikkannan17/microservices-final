package com.example.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK_DETAILS")
public class BookDetail {
    @Id
    @Column(name = "ISBN", nullable = false)
    private Integer id;

    @Column(name = "TITLE", columnDefinition = "CHARACTER LARGE OBJECT(0, 0)")
    private String title;

    @Column(name = "\"publishedDate\"", columnDefinition = "CHARACTER LARGE OBJECT(0, 0)")
    private String publishedDate;

    @Column(name = "\"totalCopies\"")
    private Integer totalCopies;

    @Column(name = "\"issuedCopies\"")
    private Integer issuedCopies;

    @Column(name = "AUTHOR", columnDefinition = "CHARACTER LARGE OBJECT(0, 0)")
    private String author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Integer getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(Integer totalCopies) {
        this.totalCopies = totalCopies;
    }

    public Integer getIssuedCopies() {
        return issuedCopies;
    }

    public void setIssuedCopies(Integer issuedCopies) {
        this.issuedCopies = issuedCopies;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}