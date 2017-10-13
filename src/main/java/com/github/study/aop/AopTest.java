package com.github.study.aop;

import org.smart4j.framework.aop.AspectProxy;
import org.smart4j.framework.aop.annotation.Aspect;

import java.lang.reflect.Method;

/**
 * Created by yangyuan on 10/13/17.
 */
@Aspect(pkg = "com.github.study",cls = "TestController")
public class AopTest extends AspectProxy{

    public void before(Class<?> cls, Method method, Object[] params) throws Throwable {
        System.out.println(method.getName() + "invoke begin");
    }

    public void after(Class<?> cls, Method method, Object[] params, Object result) throws Throwable {
        System.out.println(method.getName() + "invoke end.");
    }
}
