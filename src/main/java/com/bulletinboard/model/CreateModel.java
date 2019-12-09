package com.bulletinboard.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class CreateModel {

    @Id
    public ObjectId entryID;

    public String contentTitle;
    public String Category;
    public String contentDescription;
    public String imageUrl;


    public CreateModel(){

    }

    public  CreateModel(ObjectId entryID, String contentTitle, String contentDescription, String imageUrl)
    {
        this.entryID = entryID;
        this.contentTitle = contentTitle;
        this.contentDescription = contentDescription;
        this.imageUrl = imageUrl;
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
        return this.Category;
    }

    public void setCategory(String category)
    {
        this.Category = category;
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

}

