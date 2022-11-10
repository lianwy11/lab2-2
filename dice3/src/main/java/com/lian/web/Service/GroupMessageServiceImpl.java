package com.lian.web.Service;

import com.lian.web.mapper.GroupMessageMapper;
import com.lian.web.model.GroupMessage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: SORA
 * @Date: 2022/11/08/0:05
 * @Description:
 */
@Service
public class GroupMessageServiceImpl implements GroupMessageService {
    @Resource
    private GroupMessageMapper groupMessageMapper;


    @Override
    public void insertMessage(String userSend, int roomNumber, String time,String message) {
        GroupMessage groupMessage=new GroupMessage();
        groupMessage.setRoomnumber(roomNumber);
        groupMessage.setTime(time);
        groupMessage.setUsersend(userSend);
        groupMessage.setMessage(message);

        groupMessageMapper.insert(groupMessage);

    }

    @Override
    public List<Map<String,Object>> getMessage(int roomNumber) {
        return groupMessageMapper.getMessage(roomNumber);
    }
}
