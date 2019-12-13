package com.bulletinboard;

import com.bulletinboard.model.CreateModel;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BoardContentRepository extends MongoRepository<CreateModel, String> {

    CreateModel insert (CreateModel entity);

    List<CreateModel> findByCategory(String category, Sort s);

    CreateModel findByEntryID(ObjectId entryID);


}
