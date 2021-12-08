package com.swx.test;

import com.swx.util.MD5Util;
import org.junit.Test;

/**
 * @Description:
 * @Author: sunweixin
 * @Date: 2021/12/8
 */
public class Mytest {

    @Test
    public void testMD5(){
        String mi = MD5Util.getMD5("000000");
        System.out.println(mi);
    }
}
