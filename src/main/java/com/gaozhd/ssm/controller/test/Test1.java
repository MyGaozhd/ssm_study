package com.gaozhd.ssm.controller.test;

import com.gaozhd.ssm.common.util.json.JsonUtil;
import com.gaozhd.ssm.entity.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test1")
public class Test1 {

    @ModelAttribute
    public void userModel(String username, String code, Model model) {
        SysUser sysUser = new SysUser();
        sysUser.setName(username);
        sysUser.setCode(code);
        model.addAttribute("user", sysUser);
    }
    @ModelAttribute
    public void userModel(String username, String code, ModelMap model) {
        SysUser sysUser = new SysUser();
        sysUser.setName(username);
        sysUser.setCode(code);
        model.addAttribute("user", sysUser);
    }

    @ModelAttribute
    public void userModel(String username, String code, ModelAndView model) {
        SysUser sysUser = new SysUser();
        sysUser.setName(username);
        sysUser.setCode(code);
        model.addObject("message",JsonUtil.toJson(sysUser));
    }

    @RequestMapping(value = "/getUser", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public SysUser getUser(Model model) {
        return (SysUser) model.asMap().get("user");
    }

    @RequestMapping(value = "/getUser1", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public SysUser getUser1(Model model) {
        return (SysUser) model.asMap().get("user");
    }

    @RequestMapping(value = "/getUser2", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String getUser2() {
        return "getUser2";
    }

    @RequestMapping(value = "/getUser3", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public SysUser getUser3(ModelMap model) {
        return (SysUser) model.get("user");
    }

    @RequestMapping(value = "/getUser4", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ModelAndView getUser4(ModelAndView model) {
        model.setViewName("modelandview");
        return model;
    }
}
