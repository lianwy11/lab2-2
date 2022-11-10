package com.lian.web.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: SORA
 * @Date: 2022/11/07/23:23
 * @Description:
 */
public interface RoomMemberService
{
    int insertUser(int roomNumber, String username);

    int checkUser(String username);
}
