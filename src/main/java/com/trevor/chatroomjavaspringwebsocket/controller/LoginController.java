package com.trevor.chatroomjavaspringwebsocket.controller;

import com.trevor.chatroomjavaspringwebsocket.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @RequestMapping({"/", "login"})
    public ModelAndView login(User user) {
        return new ModelAndView("login");
    }

}
