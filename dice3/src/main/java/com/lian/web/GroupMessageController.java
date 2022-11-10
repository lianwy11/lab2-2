package com.lian.web;

import com.lian.web.Service.GroupMessageService;
import com.lian.web.Service.RoomService;
import com.lian.web.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: SORA
 * @Date: 2022/11/08/0:01
 * @Description:
 */
@RestController
public class GroupMessageController {

    @Autowired
    private GroupMessageService groupMessageService;


    @RequestMapping("sendGroupMessage")
    public Map<String,Object> sendGroupMessage(String userSend,int roomNumber,String message){

        Map<String,Object> map=new HashMap<>();
        String time = DateUtil.getnowtime();
        //TODO 写简单点，不需要判断是否存在roomNumber
       try {
           groupMessageService.insertMessage(userSend,roomNumber,time,message);
       }catch (Exception e ){
           map.put("error","发送消息出错，请重新尝试");
           return map;
       }
       map.put("success","发送消息成功");
       return map;
    }

    @RequestMapping("getGrouMessage")
    public List getMessage(int roomNumber){
        List<Map<String,Object>> list=new ArrayList<>();
        Map map=new HashMap();

        try {
            list = groupMessageService.getMessage(roomNumber);
        }catch (Exception e ){
            map.put("error","获得消息失败");
            list.add(map);
            return list;

        }
        return list;
    }

}
