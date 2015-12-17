package org.framework;

import org.framework.helper.BeanHelper;
import org.framework.helper.ClassHelper;
import org.framework.helper.ControllerHelper;
import org.framework.helper.IocHelper;
import org.framework.util.ClassUtil;

/**
 * 加载其他ClassHelper,BeanHelper,IocHelper,ControllerHelper
 * 目的是为了集中加载
 * Created by lizhaoz on 2015/12/17.
 */

public class HelperLoader {
    public static void init(){
        Class<?>[] classList={
          ClassHelper.class,BeanHelper.class,IocHelper.class,ControllerHelper.class
        };
        //加载其他4个类,并初始化
        for(Class<?> cls:classList){
            ClassUtil.loadClass(cls.getName(),true);
        }
    }
}
