package com.bulletinboard.controller;

import com.bulletinboard.BoardContentRepository;
import com.bulletinboard.CommentRepository;
import com.bulletinboard.handler.SearchHandler;
import com.bulletinboard.model.Comment;
import com.bulletinboard.model.CreateModel;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class CreateController {

    @Autowired
    private BoardContentRepository repository;
    @Autowired
    private SearchHandler searchHandler;
    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping(value = "/bulletinBoard/create", method = RequestMethod.POST,
                                                        consumes = {"application/json"},
                                                        produces = {"application/json"})
    public CreateModel create(@Valid @RequestBody CreateModel createModel)
    {
        createModel.setEntryID(ObjectId.get());
        createModel.setCreateDateTime(LocalDateTime.now());
        repository.save(createModel);
        return createModel;
    }

    @RequestMapping(value = "/bulletinBoard/id/{entryID}/comment", method = RequestMethod.POST)
    public CreateModel comment(@Valid @PathVariable("entryID") ObjectId entryID, @RequestBody Comment comment)
    {
        comment.setCommentID(ObjectId.get());
        comment.setMasterID(entryID);
        commentRepository.save(comment);
        List<Comment> comments = commentRepository.findByMasterID(entryID);
        CreateModel createModel = searchHandler.getByEntryID(entryID);
        createModel.setComment(comments);
        repository.save(createModel);
        return createModel;
    }


}
