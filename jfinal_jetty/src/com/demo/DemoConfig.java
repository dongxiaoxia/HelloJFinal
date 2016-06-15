package com.demo;

import com.jfinal.config.*;

/**
 * @author dongxiaoxia
 * @create 2016-06-12 11:46
 */
public class DemoConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/hello",HelloController.class);
        me.add("/",IndexController.class);
    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }
}
