package com.lian.web.Service;

import com.lian.web.mapper.RoomMapper;
import com.lian.web.model.Room;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: SORA
 * @Date: 2022/11/07/23:11
 * @Description:
 */
@Service
public class RoomServiceImpl implements RoomService {
    @Resource
    RoomMapper roomMapper;
    @Override
    public int creaetRoom(int roomNumber, String username) {
        Room room=new Room();
        room.setName(username);
        room.setRoomnumber(roomNumber);
        return roomMapper.insert(room);
    }
}
