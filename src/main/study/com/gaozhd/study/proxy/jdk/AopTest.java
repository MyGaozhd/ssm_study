package com.gaozhd.study.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class AopTest {
    public static void main(String[] args) {
        InvocationHandler handler = new StudyJdkAopHandler(new RealStudyServiceImpl());
        IStudyService s = (IStudyService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{IStudyService.class}, handler);
        s.study("English");
    }
}
