package com.milotnt.mapper;

import com.milotnt.pojo.Message;
import com.milotnt.pojo.Reserve;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReserveMapper {
    List<Reserve> findAll();
    
    Boolean insert(Reserve info);
    
    Boolean update(Reserve info);
}
