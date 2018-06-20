package com.gaozhd.ssm.controller.test;

import com.gaozhd.ssm.entity.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test2")
public class Test2 {

    @RequestMapping(value = {"/method1", ""}, method = {RequestMethod.GET,
            RequestMethod.POST})
    @ResponseBody
    public SysUser method1(@RequestParam("name") String name, @RequestParam("code") String code) throws Exception {
        SysUser user = new SysUser();
        user.setCode(code);
        user.setName(name);
        return user;
    }

    @RequestMapping(value = {"/method2"}, method = {RequestMethod.GET,
            RequestMethod.POST})
    @ResponseBody
    public SysUser method2(@RequestParam(value = "name", required = false, defaultValue = "gao") String name, @RequestParam("code") String code) throws Exception {
        SysUser user = new SysUser();
        user.setCode(code);
        user.setName(name);
        return user;
    }

    @RequestMapping(value = {"/method3/{name}/{code}"}, method = {RequestMethod.GET,
            RequestMethod.POST})
    @ResponseBody
    public SysUser method3(@PathVariable String name, @PathVariable String code) throws Exception {
        SysUser user = new SysUser();
        user.setCode(code);
        user.setName(name);
        return user;
    }

    @RequestMapping(value = {"/method4/{name}/{code}"}, method = {RequestMethod.GET,
            RequestMethod.POST})
    @ResponseBody
    public SysUser method4(
            @RequestHeader(value = "User-Agent", required = false, defaultValue = "zzz") String userAgent, @PathVariable String name, @PathVariable String code) throws Exception {
        SysUser user = new SysUser();
        user.setCode(code);
        user.setName(name);
        user.setSex(userAgent);
        return user;
    }

    @RequestMapping(value = {"/method5"}, method = {RequestMethod.GET,
            RequestMethod.POST})
    @ResponseBody
    public SysUser method5(@CookieValue("JSESSIONID") String value) throws Exception {
        SysUser user = new SysUser();
        user.setCode(value);
        return user;
    }
}
