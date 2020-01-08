package com.bulletinboard.controller;

import com.bulletinboard.handler.SearchHandler;
import com.bulletinboard.model.CreateModel;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SearchController {

    @Autowired
    private SearchHandler searchHandler;

    @RequestMapping(value = "/bulletinBoard/search/category/{category}", method = RequestMethod.GET,
                                                                                 produces = {"application/json"})
    public @ResponseBody List<CreateModel> searchByCategory(@PathVariable("category") String category )
    {
        return searchHandler.getByCategory(category);
    }

    @RequestMapping(value = "/bulletinBoard/search/id/{entryID}", method = RequestMethod.GET, produces = {"application/json"})
    private @ResponseBody CreateModel searchByID(@PathVariable("entryID")ObjectId entryID)
    {
        return searchHandler.getByEntryID(entryID);
    }

    @RequestMapping(value = "/bulletinBoard/search/{contentTitle}", method = RequestMethod.GET, produces = {"application/json"})
    private @ResponseBody List<CreateModel> searchByContentTitle(@PathVariable String contentTitle)
    {
        return searchHandler.getByContentTitle(contentTitle);
    }

}
