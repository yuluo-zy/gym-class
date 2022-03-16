package com.milotnt.mapper;

import com.milotnt.pojo.Member;
import com.milotnt.pojo.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author yuluo
 */
@Mapper
public interface MessageMapper {

    //查询优惠通知
    List<Message> findAll();

    //新增优惠信息
    Boolean insert(Message info);
}
