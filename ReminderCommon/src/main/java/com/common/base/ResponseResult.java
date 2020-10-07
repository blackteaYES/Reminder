package com.common.base;

import java.lang.annotation.*;

/**
 * @description:
 * @author: ybx
 * @email: 1520688026@qq.com
 * @date: 2020/10/6 10:55 下午
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface ResponseResult {

}
