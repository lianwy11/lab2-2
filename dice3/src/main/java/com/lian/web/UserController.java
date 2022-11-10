package com.lian.web;

import com.lian.web.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: SORA
 * @Date: 2022/11/06/23:18
 * @Description:
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

@RequestMapping("login")
    public HashMap<String,Object> login(String username,String password){
    HashMap map=new HashMap();
    String password1="";
    try{ password1=userService.getPassword(username);}
    catch (Exception e ){
        map.put("error","查无此用户");
        return map;

    }

    if (password.equals(password1)){
        map.put("success","登录成功");

    }else{
        map.put("error","密码错误");

    }
    return map;
}


@RequestMapping("dice")
    public HashMap<String,Object> trydice(int a []){

        HashMap map=new HashMap();
        if (a.length!=6){
        map.put("error","出错了");

            return map;

        }
        int count[]=new int[6];
    for (int i = 0; i <a.length ; i++) {
        count[a[i]-1]++;
    }
    //先判断4的个数
    if (count[3]==1){

        for (int i = 0; i <count.length ; i++) {
            if (count[i]==4){
                map.put("msg","四进带一秀");
                return map;

            }
            if (count[i]==5){
                map.put("msg","五子带四");

                return map;

            }
        }
        //判断对堂
        if (count[0]==1&&count[1]==1&&count[2]==1&&count[4]==1&&count[5]==1){
            map.put("msg","获得了对堂");
            return map;

        }
        map.put("msg","获得了一秀");
        return map;

    }else if (count[3]==2){
        for (int i = 0; i <count.length ; i++) {
            if (count[i]==4){
                map.put("msg","四进带二举");
                return map;

            }

        }
        map.put("msg","获得了二举");
        return map;


    }else if (count[3]==3){
        map.put("msg","获得了三红");

    }else if (count[3]==4){

        int countNumber=0;
        for (int i = 0; i <count.length ; i++) {
            if (i==3){

            }else{
                if (count[i] == 1){
                  countNumber+= i+1;
                }else if (count[i]==2){
                    countNumber+=2*(i+1);

                }
            }
        }
        map.put("msg","状元带"+countNumber);
        return map;


    }else if (count[3]==5){
        int countNumber=0;

        for (int i = 0; i <count.length ; i++) {
            if (i==3){

            }else{
                if (count[i] == 1){
                    countNumber+= i+1;
                }
            }
            map.put("msg","五子带"+countNumber);
            return map;

        }

    }else if (count[3]==6){
        map.put("msg","六子状元真牛逼");
    return map;


    }else{
        int countNumber=0;
        //没有4的情况，需要判断五子，四进，六个一样的

        for (int i = 0; i <count.length ; i++) {
            if (count[i]==4){
                map.put("msg","获得了四进");
                return map;
            }else if (count[i]==5){

                for (int j = 0; j <count.length ; j++) {
                    if (j==3){
                    }else{
                        if (count[j] == 1){
                            countNumber+= j+1;
                        }
                    }


                }
                map.put("msg","五子带"+countNumber);


                return map;
            }else if (count[i]==6){
                map.put("msg","六子");


            }else{
                map.put("msg","什么都没有");

            }

        }

    }

    return map;

}


}
