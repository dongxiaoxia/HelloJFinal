package com.demo;

import com.jfinal.core.Controller;

/**
 * @author dongxiaoxia
 * @create 2016-06-12 11:48
 */
public class IndexController extends Controller {

    public void index(){
        renderText("这是Tomcat下的index页面！");
    }
}
