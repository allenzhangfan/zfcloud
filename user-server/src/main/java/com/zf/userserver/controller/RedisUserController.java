//package com.zf.userserver.controller;
//
//import com.zf.common.RedisUtil;
//import com.zf.userserver.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import java.util.Date;
//
///**
// * @program: springbootdemo
// * @Date: 2019/1/25 15:03
// * @Author: Mr.Zheng
// * @Description:
// */
//@RequestMapping("/redis")
//@RestController
//public class RedisUserController {
//
//    private static int ExpireTime = 60;   // redis中存储的过期时间60s
//
////    @Resource
//    private RedisUtil redisUtil=new RedisUtil(new RedisTemplate());
//
//    @RequestMapping("set")
//    public boolean redisset(String key, String value){
//        User user =new User();
//        user.setId(1);
//        user.setUserName("zhangsan");
//        user.setPassWord("1111");
//        user.setRealName("zhangsan1");
//
//        return redisUtil.set(key,user,ExpireTime);
//
////        return redisUtil.set(key,value);
////        return  true;
//    }
//
//    @RequestMapping("get")
//    public Object redisget(String key){
////        return redisUtil.get(key);
//        return  null;
//    }
//
//    @RequestMapping("expire")
//    public boolean expire(String key){
////        return redisUtil.expire(key,ExpireTime);
//        return  true;
//    }
//}