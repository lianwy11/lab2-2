package com.lian.web.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: SORA
 * @Date: 2022/11/08/0:03
 * @Description:
 */
public class DateUtil {



    public static String getnowtime(){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String nowtime = dateFormat.format(date);
        return nowtime;

    }
}
