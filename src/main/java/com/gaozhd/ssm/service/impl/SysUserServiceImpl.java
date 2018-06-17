package com.gaozhd.ssm.service.impl;

import com.gaozhd.ssm.entity.SysUser;
import com.gaozhd.ssm.mapper.SysUserMapper;
import com.gaozhd.ssm.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findSysUserByID(int id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }
}
