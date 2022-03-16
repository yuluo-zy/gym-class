package com.milotnt.controller;

import com.milotnt.mapper.MessageMapper;
import com.milotnt.mapper.ReserveMapper;
import com.milotnt.pojo.Message;
import com.milotnt.pojo.Reserve;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/message")
public class ReserveController {

    @Resource
    ReserveMapper mapper;

    @PostMapping
    public boolean add(Reserve item) {
        if(item.getId() != null){
            return mapper.update(item);
        }
        return mapper.insert(item);
    }

    @GetMapping
    public List<Reserve> get() {
        return mapper.findAll();
    }
}

