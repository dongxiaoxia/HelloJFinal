package com.demo.user.intercepter;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;

/**
 * @author dongxiaoxia
 * @create 2016-06-12 15:26
 */
public class AuthIntercepter implements Interceptor {
    public void intercept(Invocation invocation) {
        Controller controller = invocation.getController();
        Boolean loginUser = controller.getSessionAttr("flag");
        if (loginUser!=null && loginUser == true){
            invocation.invoke();
        }else {
            controller.redirect("/");
        }
    }
}
