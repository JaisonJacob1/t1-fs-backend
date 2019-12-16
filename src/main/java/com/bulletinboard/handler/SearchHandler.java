package com.bulletinboard.handler;

import com.bulletinboard.BoardContentRepository;
import com.bulletinboard.model.CreateModel;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

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

    public List<CreateModel> getByContentTitle(String contentTitle)
    {
        List<String> keyword = Arrays.asList(contentTitle.split("\\s"));
        List<CreateModel> allContents;
        allContents = repository.findAll();
        List<CreateModel> filteredItem = allContents.stream().filter(filteredContents -> keyword.stream().anyMatch(key->
                filteredContents.getContentTitle().contains(key))).collect(toList());
        return filteredItem;

    }
}
