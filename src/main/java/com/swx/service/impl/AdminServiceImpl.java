package com.swx.service.impl;

import com.swx.mapper.AdminMapper;
import com.swx.model.Admin;
import com.swx.model.AdminExample;
import com.swx.service.AdminService;
import com.swx.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description:
 * @Author: sunweixin
 * @Date: 2021/12/8
 */
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(String name, String pwd) {

        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andANameEqualTo(name);
        List<Admin> adminList = adminMapper.selectByExample(adminExample);
        if(adminList.size()>0){
            Admin admin = adminList.get(0);
            String miPwd = MD5Util.getMD5(pwd);
            if (miPwd.equals(admin.getaPass())){
                return admin;
            }
        }
        return null;
    }
}
