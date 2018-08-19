package com.gaozhd.ssm.controller.test;

import com.gaozhd.ssm.common.util.LogUtil;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Test5 {

    public  static void main(String[] args){
        LogUtil.log("test");

       new Test5().Test5();

       Test0 test0=new Test0();
       LogUtil.log(test0);
       new Test5().Test2(test0);
       LogUtil.log(test0);
    }

    public  void Test5(){

        Map<String,String> map=new HashMap<>();
        map.put(null,null);
        map.put("",null);
        LogUtil.logJson(map);

        Map<String,String> t=new Hashtable<>();
//        t.put(null,null);
        t.put("","llllll");
        LogUtil.logJson(t);
    }

    public void Test2(Test0 test0){
        test0=new Test0();
        LogUtil.log(test0);
    }
}
