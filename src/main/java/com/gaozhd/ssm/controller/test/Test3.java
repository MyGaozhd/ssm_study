package com.gaozhd.ssm.controller.test;

import com.gaozhd.ssm.common.util.LogUtil;
import com.gaozhd.ssm.controller.base.BaseController;
import com.gaozhd.ssm.entity.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test3")
@SessionAttributes("user")
public class Test3 extends BaseController {

    @RequestMapping(value = "/method1", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public SysUser method1(@RequestParam("name") String name, @RequestParam("code") String code, Model model) {
        LogUtil.logJson(getSession().getAttribute("user"));
        SysUser user = new SysUser();
        user.setCode(code);
        user.setName(name);
        model.addAttribute("user", user);
        return user;
    }
}
