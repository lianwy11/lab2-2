package com.lian.web.Service;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: SORA
 * @Date: 2022/11/08/0:05
 * @Description:
 */
public interface GroupMessageService

{
    void insertMessage(String userSend, int roomNumber, String time,String message);

    List<Map<String,Object>> getMessage(int roomNumber);
}
