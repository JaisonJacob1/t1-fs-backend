package com.bulletinboard.controller;

import com.bulletinboard.BoardContentRepository;
import com.bulletinboard.model.CreateModel;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CreateController {

    @Autowired
    private BoardContentRepository repository;

    @RequestMapping(value = "/bulletinBoard/create", method = RequestMethod.POST,
                                                        consumes = {"application/json"},
                                                        produces = {"application/json"})
    public CreateModel create(@Valid @RequestBody CreateModel createModel)
    {
        createModel.setEntryID(ObjectId.get());
        repository.save(createModel);
        return createModel;
    }


}
