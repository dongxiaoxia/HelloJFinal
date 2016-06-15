package com.demo.user.service;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

/**
 * @author dongxiaoxia
 * @create 2016-06-12 15:19
 */
public class UserService {
    public boolean add(String username,String password){
        String SQL = "SELECT userid FROM user WHERE username = ?";
        Integer result = Db.queryFirst(SQL, username);
        if (result==null){
            Record user = new Record().set("username",username).set("password",password);
            Db.save("user",user);
            return true;
        }
        return false;
    }

    public boolean login(String username,String password){
        String SQL = "SELECT userid FROM user WHERE username = ? and password = ?";
        Integer result = Db.queryFirst(SQL,username,password);
        return result!=null;
    }
}
