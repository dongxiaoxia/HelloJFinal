package com.demo.user.controller;

import com.demo.common.model.User;
import com.demo.common.vo.AjaxResult;
import com.demo.user.service.UserService;
import com.demo.user.validator.LoginValidator;
import com.jfinal.aop.Before;
import com.jfinal.aop.Duang;
import com.jfinal.core.Controller;

import java.util.List;

/**
 * @author dongxiaoxia
 * @create 2016-06-12 15:34
 */
public class UserController extends Controller {

    //    private UserService userService = new UserService();
    private UserService userService = Duang.duang(UserService.class);

    public void index() {
        List<User> users = User.dao.find("select * from user");
        setAttr("users",users);
        render("list.jsp");
    }

    public void create(){
        render("form.jsp");
    }

    public void save(){
        User user = getModel(User.class,"user");
        user.save();
        redirect("/user");
    }

    public void show() {
        String id =getPara(0);
        User user = User.dao.findById(id);
        if (user!=null){
            setAttr("user",user);
        }
        renderJson("user",user);
//        render("form.jsp");
    }

    public void delete(){
        String id = getPara(0);
        boolean result = User.dao.deleteById(id);
        if (result){
            renderJson(new AjaxResult());
        }else {
            renderJson(new AjaxResult().addError("server error"));
        }
    }

    public void edit(){
        String id =getPara(0);
        User user = User.dao.findById(id);
        if (user!=null){
            setAttr("user",user);
        }
        render("edit.jsp");
    }

    public void update(){
        User user = getModel(User.class,"user");
        user.update();
        renderJson(new AjaxResult());
    }

    @Before(LoginValidator.class)
    public void login() {
        String username = getPara("username");
        String password = getPara("password");
        boolean loginCheck = userService.login(username, password);
        if (loginCheck) {
            renderJson("10000");
            getSession().setAttribute("flag", true);
        } else {
            renderJson("10001");
        }
    }

    public void register() {
        String username = getPara("username");
        String password = getPara("password");
        boolean result = userService.add(username, password);
        if (result) {
            renderJson("10010");
        } else {
            renderJson("10011");
        }
    }



    public void image() {
        try {
            getFile(getPara("img"), "UTF-8");
            renderJson("20010");
        } catch (Exception e) {
            renderJson("20012");
        }
    }


}
