package com.demo.common.controller;

import com.jfinal.core.Controller;

/**
 * @author dongxiaoxia
 * @create 2016-06-12 11:48
 */
public class IndexController extends Controller {

    public void index(){
       renderJsp("index.jsp");
    }
}
