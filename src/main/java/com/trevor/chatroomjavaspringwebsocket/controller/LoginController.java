package com.trevor.chatroomjavaspringwebsocket.controller;

import com.trevor.chatroomjavaspringwebsocket.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.net.UnknownHostException;

@Controller
public class LoginController {
    @RequestMapping({"/", "login"})
    public ModelAndView login(User user) {
        return new ModelAndView("login");
    }

    @RequestMapping("chat")
    public ModelAndView chat(String username, HttpServletRequest request) throws UnknownHostException {
        return new ModelAndView("chat");
    }
}
