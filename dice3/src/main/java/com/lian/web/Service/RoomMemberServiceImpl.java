package com.lian.web.Service;

import com.lian.web.mapper.RoomMemberMapper;
import com.lian.web.model.RoomMember;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: SORA
 * @Date: 2022/11/07/23:25
 * @Description:
 */
@Service
public class RoomMemberServiceImpl implements RoomMemberService {
    @Resource
    private RoomMemberMapper roomMemberMapper;

    @Override
    public int insertUser(int roomNumber, String username) {
        RoomMember roomMember=new RoomMember();
        roomMember.setRoomnumber(roomNumber);
        roomMember.setUsername(username);
        return roomMemberMapper.insert(roomMember);
    }

    @Override
    public int checkUser(String username) {
        return roomMemberMapper.checkUser(username);
    }
}
