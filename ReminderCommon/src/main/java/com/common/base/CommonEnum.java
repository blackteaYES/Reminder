package com.common.base;

/**
 * @description:
 * @author: ybx
 * @email: 1520688026@qq.com
 * @date: 2020/10/7 8:17 下午
 */
public enum CommonEnum implements BaseErrorInfoInterface{

    // 数据操作错误定义
    SUCCESS("200", "成功!"),
    BODY_NOT_MATCH("400","程序出现空指针!"),
    SIGNATURE_NOT_MATCH("401","请求的数字签名不匹配!"),
    NOT_FOUND("404", "未找到该资源!"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误!"),
    SERVER_BUSY("503","服务器正忙，请稍后再试!")
    ;

    /** 错误码 */
    private String resultCode;

    /** 错误描述 */
    private String resultMsg;

    CommonEnum(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    @Override
    public String getResultCode() {
        return this.resultCode;
    }

    @Override
    public String getResultMsg() {
        return this.resultMsg;
    }
}
