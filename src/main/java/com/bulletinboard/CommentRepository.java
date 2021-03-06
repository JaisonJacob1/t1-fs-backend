package com.bulletinboard;

import com.bulletinboard.model.Comment;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, String> {

    Comment save (Comment entity);

    List<Comment> findByMasterID(ObjectId masterID);

}
