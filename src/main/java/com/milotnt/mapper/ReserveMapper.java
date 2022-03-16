package com.milotnt.mapper;

import com.milotnt.pojo.Message;
import com.milotnt.pojo.Reserve;

import java.util.List;

public interface ReserveMapper {
    List<Reserve> findAll();
    
    Boolean insert(Reserve info);
    
    Boolean update(Reserve info);
}
