package com.bulletinboard.controller;

import com.bulletinboard.BoardContentRepository;
import com.bulletinboard.model.CreateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping(value = "/bulletinBoard", method = RequestMethod.GET)
    String home()
    {
        return "Hello World";
    }
}
