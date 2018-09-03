package com.gaozhd.study.proxy.jdk;

import com.gaozhd.ssm.common.util.LogUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudyJdkAopHandler implements InvocationHandler {

    private Object real;

    public StudyJdkAopHandler(Object real) {
        this.real = real;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        LogUtil.logJson("开始：---------------");
        result = method.invoke(real, args);

        LogUtil.logJson("执行：" + result);

        LogUtil.logJson("结束：----------------");
        return result;
    }
}
