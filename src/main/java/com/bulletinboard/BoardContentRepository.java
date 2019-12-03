package com.bulletinboard;

import com.bulletinboard.model.CreateModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoardContentRepository extends MongoRepository<CreateModel, String> {

    CreateModel insert (CreateModel entity);

}
