package com.demo;

import com.jfinal.core.Controller;

/**
 * @author dongxiaoxia
 * @create 2016-06-12 11:48
 */
public class HelloController extends Controller {
    public void index(){
        renderText("欢迎来到JFinal的世界！");
    }
}
