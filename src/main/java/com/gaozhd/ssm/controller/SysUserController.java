package com.gaozhd.ssm.controller;

import com.gaozhd.ssm.entity.SysUser;
import com.gaozhd.ssm.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private ISysUserService userService;

    @RequestMapping(value = "/getOneUser", method = { RequestMethod.GET,
            RequestMethod.POST })
    @ResponseBody
    public SysUser getOneUser() throws Exception {

        return userService.findSysUserByID(1);
    }
}
