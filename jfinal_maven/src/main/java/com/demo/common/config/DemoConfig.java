package com.demo.common.config;

import com.demo.common.controller.IndexController;
import com.demo.common.model._MappingKit;
import com.demo.user.controller.UserController;
import com.jfinal.config.*;
import com.jfinal.ext.interceptor.Restful;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;

/**
 * @author dongxiaoxia
 * @create 2016-06-12 11:46
 */
public class DemoConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {
        me.setEncoding("UTF-8");
        me.setViewType(ViewType.JSP);
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/",IndexController.class);
        me.add("/user",UserController.class,"/user");
    }

    @Override
    public void configPlugin(Plugins me) {
        PropKit.use("jdbc.properties");
        final String URL = PropKit.get("jdbcUrl");
        final String USERNAME = PropKit.get("user");
        final String PASSWORD = PropKit.get("password");
        final Integer INITIALSIZE = PropKit.getInt("initialSize");
        final Integer MIDIDLE = PropKit.getInt("minIdle");
        final Integer MAXACTIVEE = PropKit.getInt("maxActivee");

        DruidPlugin druidPlugin = new DruidPlugin(URL,USERNAME,PASSWORD);
        druidPlugin.set(INITIALSIZE,MIDIDLE,MAXACTIVEE);
        druidPlugin.setFilters("stat,wall");
        me.add(druidPlugin);

        ActiveRecordPlugin activeRecordPlugin = new ActiveRecordPlugin(druidPlugin);
//        activeRecordPlugin.addMapping("user", "userid", User.class);
        _MappingKit.mapping(activeRecordPlugin);
        me.add(activeRecordPlugin);
    }

    @Override
    public void configInterceptor(Interceptors me) {
//        me.addGlobalActionInterceptor(new AuthIntercepter());
        me.addGlobalActionInterceptor(new Restful());
    }

    @Override
    public void configHandler(Handlers me) {

    }
}
