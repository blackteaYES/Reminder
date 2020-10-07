package com.common.base;

/**
 * @description: 错误接口对象
 * @author: ybx
 * @email: 1520688026@qq.com
 * @date: 2020/10/7 8:16 下午
 */
public interface BaseErrorInfoInterface {

    /** 错误码*/
    String getResultCode();

    /** 错误描述*/
    String getResultMsg();
}
