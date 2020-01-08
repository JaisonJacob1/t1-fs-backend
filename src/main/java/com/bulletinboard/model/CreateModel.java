package com.bulletinboard.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

public class CreateModel {

    @Id
    public ObjectId entryID;

    public String contentTitle;
    public String category;
    public String contentDescription;
    public String imageUrl;
    public LocalDateTime createDateTime;
    public List<Comment> comment;



    public CreateModel(){

    }

    public  CreateModel(ObjectId entryID, String contentTitle, String category, String contentDescription, String imageUrl,
                        LocalDateTime createDateTime, List<Comment> comment)
    {
        this.entryID = entryID;
        this.contentTitle = contentTitle;
        this.category = category;
        this.contentDescription = contentDescription;
        this.imageUrl = imageUrl;
        this.createDateTime = createDateTime;
        this.comment = comment;
    }

    public String getEntryID()
    {
        return entryID.toHexString();
    }

    public void setEntryID(ObjectId entryID)
    {
        this.entryID = entryID;
    }

    public String getContentTitle()
    {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle)
    {
        this.contentTitle = contentTitle;
    }

    public String getCategory()
    {
        return this.category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setCreateDateTime(LocalDateTime createDateTime)
    {
        this.createDateTime = createDateTime;
    }

    public LocalDateTime getCreateDateTime()
    {
        return createDateTime;
    }

    public void setComment(List<Comment> comment)
    {
        this.comment = comment;
    }

    public List<Comment> getComment()
    {
        return comment;
    }

    @Override
    public String toString() {
        return "CreateModel{" +
                "entryID=" + entryID +
                ", contentTitle='" + contentTitle + '\'' +
                ", category='" + category + '\'' +
                ", contentDescription='" + contentDescription + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", createDateTime=" + createDateTime + '\'' +
                ", comment=" + comment + '\'' +
                '}';
    }
}

