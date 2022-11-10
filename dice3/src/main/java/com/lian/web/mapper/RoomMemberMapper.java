package com.lian.web.mapper;

import com.lian.web.model.RoomMember;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoomMemberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoomMember record);

    int insertSelective(RoomMember record);

    RoomMember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoomMember record);

    int updateByPrimaryKey(RoomMember record);

    int checkUser(String username);
}