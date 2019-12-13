package com.bulletinboard.handler;

import com.bulletinboard.BoardContentRepository;
import com.bulletinboard.model.CreateModel;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;

import java.util.List;

@Configuration
public class SearchHandler {
    @Autowired
    private BoardContentRepository repository;

    public List<CreateModel> getByCategory(String category)
    {
        return repository.findByCategory(category, Sort.by(Sort.Direction.DESC, "createDateTime"));
    }

    public CreateModel getByEntryID(ObjectId entryID)
    {
        return repository.findByEntryID(entryID);
    }
}
