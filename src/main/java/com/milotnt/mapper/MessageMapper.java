package com.milotnt.mapper;

import com.milotnt.pojo.Member;
import com.milotnt.pojo.Message;

import java.util.List;

/**
 * @author yuluo
 */
public interface MessageMapper {

    //查询优惠通知
    List<Message> findAll();

    //新增优惠信息
    Boolean insert(Message info);
}
