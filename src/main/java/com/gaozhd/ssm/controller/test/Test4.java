package com.gaozhd.ssm.controller.test;

import com.gaozhd.ssm.common.util.LogUtil;
import com.gaozhd.ssm.controller.base.BaseController;
import com.gaozhd.ssm.entity.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test4")
public class Test4 extends BaseController {

    @RequestMapping(value = "/method1", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public SysUser method1(@RequestBody SysUser user) {
        return user;//96
    }
}
