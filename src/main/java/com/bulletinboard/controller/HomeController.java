package com.bulletinboard.controller;

import com.bulletinboard.BoardContentRepository;
import com.bulletinboard.model.CreateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private BoardContentRepository repository;

    @RequestMapping(value = "/bulletinBoard", method = RequestMethod.GET, produces = {"application/json"})
    public @ResponseBody List<CreateModel> getAllItems()
    {
        return repository.findAll();
    }
}
