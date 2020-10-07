package com.common.handler;

import com.common.base.ResponseResult;
import com.common.constant.CommonConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: ybx
 * @email: 1520688026@qq.com
 * @date: 2020/10/6 10:59 下午
 */
@Slf4j
@Component
public class ResultResponseHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (handler instanceof HandlerMethod){
            final HandlerMethod handlerMethod = (HandlerMethod) handler;
            final Class<?> cla = handlerMethod.getBeanType();
            final Method method = handlerMethod.getMethod();
            // 判断注解是否存在
            if (cla.isAnnotationPresent(ResponseResult.class)){
                request.setAttribute(CommonConstant.RESPONSE_RESULT_ANN,cla.getAnnotation(ResponseResult.class));
            }else if (method.isAnnotationPresent(ResponseResult.class)){
                request.setAttribute(CommonConstant.RESPONSE_RESULT_ANN,cla.getAnnotation(ResponseResult.class));
            }
        }
        return true;
    }

}
