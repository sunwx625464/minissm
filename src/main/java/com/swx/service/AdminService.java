package com.swx.service;

import com.swx.model.Admin;

/**
 * @Description:
 * @Author: sunweixin
 * @Date: 2021/12/8
 */
public interface AdminService {

    /**
     * 完成登录判断
     * @param name
     * @param pwd
     * @return
     */
    Admin login(String name,String pwd);
}
