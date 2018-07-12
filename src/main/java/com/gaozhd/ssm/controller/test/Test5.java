package com.gaozhd.ssm.controller.test;

import com.gaozhd.ssm.controller.base.BaseController;
import com.gaozhd.ssm.entity.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test5")
public class Test5 extends BaseController {

    @RequestMapping(value = "/method1", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public SysUser method1(@RequestBody SysUser user, HttpServletRequest request) {
        RequestContext context = new RequestContext(request);
        user.setSex(context.getMessage("welcome"));
        return user;//96
    }

    @RequestMapping(value = "/method2", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public SysUser method2(@RequestParam("name") String name, HttpServletRequest request) {
        SysUser user = new SysUser();
        RequestContext context = new RequestContext(request);
        user.setSex(context.getMessage("welcome"));
        return user;//96
    }
}
