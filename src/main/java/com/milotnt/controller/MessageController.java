package com.milotnt.controller;


import com.milotnt.mapper.MessageMapper;
import com.milotnt.pojo.Member;
import com.milotnt.pojo.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/message")
public class MessageController {

    @Resource
    MessageMapper messageMapper;

    @PostMapping
    public boolean addMessage(Message message) {
        return messageMapper.insertMessage(message);
    }

    @GetMapping
    public List<Message> get() {
        return messageMapper.findAll();
    }
}
