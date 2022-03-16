package com.milotnt.controller;


import com.milotnt.mapper.MessageMapper;
import com.milotnt.pojo.ClassTable;
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

    @RequestMapping("/add")
    public String addMessage(Message message) {
         messageMapper.insert(message);
         return "redirect:select";
    }

    //跳转新增课程页面
    @RequestMapping("/toAdd")
    public String toAdd() {
        return "addMessage";
    }

    @RequestMapping("/select")
    public String get(Model model) {
        List<Message> all = messageMapper.findAll();
        model.addAttribute("messageList", all);
        return "selectMessage";
    }

    @RequestMapping("/toUser")
    public String getUser(Model model) {
        List<Message> all = messageMapper.findAll();
        model.addAttribute("messageList", all);
        return "selectUserMessage";
    }
}
