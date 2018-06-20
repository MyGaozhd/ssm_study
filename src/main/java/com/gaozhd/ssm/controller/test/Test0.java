package com.gaozhd.ssm.controller.test;

import com.gaozhd.ssm.entity.SysUser;
import com.gaozhd.ssm.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test0")
public class Test0 {

    @RequestMapping(value = {"/test", "/test1", ""}, method = {RequestMethod.GET,
            RequestMethod.POST})
    @ResponseBody
    public String test1() throws Exception {
        return "test1";
    }

    @RequestMapping(value = "test2", method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public SysUser test2() throws Exception {
        SysUser sysUser = new SysUser();
        sysUser.setName("test2");
        return sysUser;
    }
}
