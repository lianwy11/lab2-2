package com.lian.web;

import com.lian.web.Service.RoomMemberService;
import com.lian.web.Service.RoomService;
import com.lian.web.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: SORA
 * @Date: 2022/11/07/23:06
 * @Description:
 */
@RestController
public class RoomController {
@Autowired
private RoomService roomService;
@Autowired
private UserService userService;
@Autowired
private RoomMemberService roomMemberService;


@RequestMapping("createRoom")
    public HashMap<String,Object> createRoom(int roomNumber,String username){
    HashMap<String,Object> hashmap=new HashMap();
    try{String password = userService.getPassword(username);}catch (Exception e ){
        hashmap.put("error","没有这个用户，请先注册");
        return hashmap;

    }


  try{ int a =  roomService.creaetRoom(roomNumber,username);}catch (Exception e ){hashmap.put("msg","房间创建失败,已经存在房间");
  return hashmap;
  }
  //群主第一个加入房间
    try{int a =roomMemberService.insertUser(roomNumber,username);}catch (Exception e ){
        hashmap.put("error","加入房间失败");
        return hashmap;
    }

  hashmap.put("msg","创建成功");
  return hashmap;
}

    @RequestMapping("joinRoom")
    public HashMap<String,Object> joinRoom(int roomNumber,String username){

    HashMap<String,Object> map=new HashMap();

  try{ int a = roomMemberService.checkUser(username);}catch (Exception e ){

      roomMemberService.insertUser(roomNumber,username);

      map.put("msg","加入房间成功");
      return map;
  }
    map.put("error","你已经在房间里了");
    return map;

}


}
