package com.bulletinboard.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Comment {

    @Id
    private ObjectId commentID;
    private ObjectId masterID;
    private String userName;
    private String description;

    public Comment(ObjectId commentID, ObjectId masterID, String userName, String description)
    {
        this.commentID = commentID;
        this.masterID = masterID;
        this.userName = userName;
        this.description = description;
    }

    public void setCommentID(ObjectId commentID)
    {
        this.commentID = commentID;
    }

    public ObjectId getCommentID()
    {
        return commentID;
    }

    public void setMasterID(ObjectId masterID)
    {
        this.masterID = masterID;
    }

    public ObjectId getMasterID()
    {
        return masterID;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentID=" + commentID +
                ", masterID='" + masterID + '\'' +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
